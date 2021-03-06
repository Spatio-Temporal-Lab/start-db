/*
 * Copyright 2022 ST-Lab
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */

package org.urbcomp.start.db.model.point;

import com.github.davidmoten.rtree.Entry;
import com.github.davidmoten.rtree.geometry.Geometries;
import com.github.davidmoten.rtree.geometry.Rectangle;
import org.locationtech.jts.geom.Envelope;
import org.locationtech.jts.geom.Geometry;
import org.urbcomp.start.db.model.roadnetwork.RoadNetwork;
import org.urbcomp.start.db.model.roadnetwork.RoadSegment;
import org.urbcomp.start.db.util.GeoFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CandidatePoint extends SpatialPoint {
    /**
     * matched road segment id
     */
    private final int roadSegmentId;
    /**
     * the distance from the start point of the matched road segment, meter
     */
    private final double offsetInMeter;

    /**
     * the matched position index in the road segment geo
     */
    private final int matchedIndex;

    /**
     * the distance between the matched point and the gps point
     */
    private final double errorDistanceInMeter;

    public int getRoadSegmentId() {
        return roadSegmentId;
    }

    public double getOffsetInMeter() {
        return offsetInMeter;
    }

    public int getMatchedIndex() {
        return matchedIndex;
    }

    public double getErrorDistanceInMeter() {
        return errorDistanceInMeter;
    }

    public CandidatePoint(
        SpatialPoint matchedPoint,
        RoadSegment roadSegment,
        int matchedIndex,
        double errorDistanceInMeter
    ) {
        super(matchedPoint.getLng(), matchedPoint.getLat());
        this.roadSegmentId = roadSegment.getRoadSegmentId();
        this.matchedIndex = matchedIndex;
        this.errorDistanceInMeter = errorDistanceInMeter;
        this.offsetInMeter = calOffsetInMeter(roadSegment, matchedIndex);
    }

    private double calOffsetInMeter(RoadSegment roadSegment, int matchedIndex) {
        double offset = 0;

        // ???????????????matchedIndex????????????
        List<SpatialPoint> points = roadSegment.getPoints();
        for (int i = 0; i < matchedIndex; i++) {
            offset += GeoFunctions.getDistanceInM(points.get(i), points.get(i + 1));
        }

        // matched point???matchedIndex?????????
        offset += GeoFunctions.getDistanceInM(
            new SpatialPoint(roadSegment.getPoints().get(matchedIndex).getCoordinate()),
            this
        );

        return offset;
    }

    @Override
    public String toString() {
        return this.roadSegmentId
            + "|"
            + this.offsetInMeter
            + "|"
            + this.matchedIndex
            + "|"
            + this.errorDistanceInMeter;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidatePoint other = (CandidatePoint) o;
        return this.roadSegmentId == other.getRoadSegmentId()
            && offsetInMeter == other.offsetInMeter
            && matchedIndex == other.matchedIndex
            && errorDistanceInMeter == other.errorDistanceInMeter
            && super.equals(other);
    }

    @Override
    public boolean equals(Geometry g) {
        if (this == g) return true;
        if (g == null || getClass() != g.getClass()) return false;
        CandidatePoint other = (CandidatePoint) g;
        return Math.abs(roadSegmentId) == Math.abs(other.getRoadSegmentId())
            && errorDistanceInMeter == errorDistanceInMeter
            && super.equals(g);
    }

    /**
     * ???????????????????????????candidate point
     *
     * @param pt          ?????????
     * @param roadNetwork ????????????
     * @param dist        ????????????
     * @return candidate point
     */
    public static CandidatePoint getNearestCandidatePoint(
        SpatialPoint pt,
        RoadNetwork roadNetwork,
        double dist
    ) {
        List<CandidatePoint> candidates = getCandidatePoint(pt, roadNetwork, dist);
        if (candidates.size() != 0) {
            return Collections.min(
                candidates,
                Comparator.comparingDouble(CandidatePoint::getErrorDistanceInMeter)
            );
        } else {
            return null;
        }
    }

    /**
     * ??????????????? ????????????????????? ??????range query???roadSegment
     *
     * @param pt          ???
     * @param roadNetwork ????????????
     * @param dist        ???????????????
     * @return ??????????????????????????????????????????????????? candidate points
     */
    public static List<CandidatePoint> getCandidatePoint(
        SpatialPoint pt,
        RoadNetwork roadNetwork,
        double dist
    ) {
        Envelope bbox = GeoFunctions.getExtendedBBox(pt, dist);
        Rectangle rec = Geometries.rectangleGeographic(
            bbox.getMinX(),
            bbox.getMinY(),
            bbox.getMaxX(),
            bbox.getMaxY()
        );
        Iterable<RoadSegment> roadSegmentIterable = roadNetwork.getRoadRTree()
            .search(rec)
            .map(Entry::value)
            .toBlocking()
            .toIterable();
        List<CandidatePoint> result = new ArrayList<>();
        roadSegmentIterable.forEach(rs -> {
            CandidatePoint candiPt = calCandidatePoint(pt, rs);
            if (candiPt.errorDistanceInMeter <= dist) {
                result.add(candiPt);
            }
        });
        return result;
    }

    /**
     * ???????????????????????????????????????roadSegment?????????candidate point
     *
     * @param rawPoint ?????????
     * @param rs       ??????
     * @return ????????????????????????candidate point
     */
    private static CandidatePoint calCandidatePoint(SpatialPoint rawPoint, RoadSegment rs) {
        List<SpatialPoint> points = rs.getPoints();
        ProjectionPoint projectionPoint = ProjectionPoint.calProjection(
            rawPoint,
            points,
            0,
            points.size() - 1
        );
        return new CandidatePoint(
            projectionPoint,
            rs,
            projectionPoint.getMatchedIndex(),
            projectionPoint.getErrorDistanceInMeter()
        );
    }

    static class ProjectionPoint extends SpatialPoint {
        /**
         * ????????????????????????m
         */
        private final double errorDistanceInMeter;
        /**
         * ???????????????
         */
        private final double rate;

        private final int matchedIndex;

        /**
         * ????????????
         *
         * @param point         ?????????
         * @param errorDistance ????????????
         * @param rate          ??????
         */
        public ProjectionPoint(
            SpatialPoint point,
            double errorDistance,
            double rate,
            int matchedIndex
        ) {
            super(point.getLng(), point.getLat());
            this.errorDistanceInMeter = errorDistance;
            this.rate = rate;
            this.matchedIndex = matchedIndex;
        }

        public double getErrorDistanceInMeter() {
            return errorDistanceInMeter;
        }

        public double getRate() {
            return rate;
        }

        public int getMatchedIndex() {
            return matchedIndex;
        }

        /**
         * ??????????????????????????????
         *
         * @param pt     ?????????
         * @param points ???????????????point list
         * @param start  ??????index
         * @param end    ??????index
         * @return ?????????, ??????????????????point list ???index
         */
        private static ProjectionPoint calProjection(
            SpatialPoint pt,
            List<SpatialPoint> points,
            int start,
            int end
        ) {
            if (end - start == 1) {
                return projectPtToSegment(points.get(start), points.get(end), pt, start);
            }
            int mid = (start + end) / 2;
            ProjectionPoint projectionPoint = projectPtToSegment(
                points.get(start),
                points.get(mid),
                pt,
                -1 // this value is not used
            );
            double rate = projectionPoint.getRate();
            if (rate > 1.0) {
                start = mid;
            } else {
                end = mid;
            }
            return calProjection(pt, points, start, end);
        }

        /**
         * ????????????????????? ???????????? ab?????????????????????????????? ?????????a??? ???????????????????????????b??? ????????????????????????rate?????????????????????????????????
         *
         * @param startPt ??? ??????rs???????????????
         * @param endPt   ??? ??????rs????????????
         * @param pt      ???????????????
         * @return ?????????segment?????????
         */
        private static ProjectionPoint projectPtToSegment(
            SpatialPoint startPt,
            SpatialPoint endPt,
            SpatialPoint pt,
            int matchedIndex
        ) {
            double abAngle = bearing(startPt, endPt);
            double atAngle = bearing(startPt, pt);
            double abLength = GeoFunctions.getDistanceInM(startPt, endPt);
            double atLength = GeoFunctions.getDistanceInM(startPt, pt);
            double deltaAngle = atAngle - abAngle;
            double metersAlong = atLength * Math.cos(Math.toRadians(deltaAngle));
            double rate;
            SpatialPoint projection;
            if (abLength == 0.0) {
                rate = 0.0;
            } else {
                rate = metersAlong / abLength;
            }
            if (rate > 1.0) {
                projection = new SpatialPoint(endPt.getLng(), endPt.getLat());
            } else if (rate < 0) {
                projection = new SpatialPoint(startPt.getLng(), startPt.getLat());
            } else {
                projection = calLocAlongLine(startPt, endPt, rate);
            }
            double dist = GeoFunctions.getDistanceInM(pt, projection);
            return new ProjectionPoint(projection, dist, rate, matchedIndex);
        }

        /**
         * ????????????????????????????????????
         *
         * @param startPt ???
         * @param endPt   ???
         * @return ????????????
         */
        private static double bearing(SpatialPoint startPt, SpatialPoint endPt) {
            double ptALatRad = Math.toRadians(startPt.getLat());
            double ptALngRad = Math.toRadians(startPt.getLng());
            double ptBLatRad = Math.toRadians(endPt.getLat());
            double ptBLngRad = Math.toRadians(endPt.getLng());
            double y = Math.sin(ptBLngRad - ptALngRad) * Math.cos(ptBLatRad);
            double x = Math.cos(ptALatRad) * Math.sin(ptBLatRad) - Math.sin(ptALatRad) * Math.cos(
                ptBLatRad
            ) * Math.cos(ptBLngRad - ptALngRad);
            double bearingRad = Math.atan2(y, x);
            return (Math.toDegrees(bearingRad) + 360.0) % 360.0;
        }

        /**
         * ??????rate ???????????????????????????
         *
         * @param startPt ?????????
         * @param endPt   ??????
         * @param rate    a?????????????????? / ab??????
         * @return ?????????
         */
        private static SpatialPoint calLocAlongLine(
            SpatialPoint startPt,
            SpatialPoint endPt,
            double rate
        ) {
            double lat = startPt.getLat() + rate * (endPt.getLat() - startPt.getLat());
            double lng = startPt.getLng() + rate * (endPt.getLng() - startPt.getLng());
            return new SpatialPoint(lng, lat);
        }
    }
}
