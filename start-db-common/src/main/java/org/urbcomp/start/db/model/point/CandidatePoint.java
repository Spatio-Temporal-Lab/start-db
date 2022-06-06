package org.urbcomp.start.db.model.point;

import org.locationtech.jts.geom.Coordinate;
import org.urbcomp.start.db.model.roadsegment.RoadSegment;
import org.urbcomp.start.db.util.GeoFunctions;


public class CandidatePoint extends SpatialPoint {
    /**
     * matched road segment id
     */
    private int roadSegmentId;
    /**
     * the distance from the start point of the matched road segment, meter
     */
    private double offsetInM;
    /**
     * the matched position index in the road segment geo
     */
    private int matchedIndex;

    /**
     * the distance between the matched point and the gps point
     */
    private double errorDistanceM;

    public CandidatePoint(SpatialPoint matchedPoint, RoadSegment roadSegment, int matchedIndex, double errorDistanceM) {
        super(matchedPoint.getLng(), matchedPoint.getLat());
        this.roadSegmentId = roadSegment.getRoadSegmentId();
        this.matchedIndex = matchedIndex;
        this.errorDistanceM = errorDistanceM;
        this.offsetInM = calOffsetInM(roadSegment, matchedIndex);
    }

    private double calOffsetInM(RoadSegment roadSegment, int matchedIndex) {
        double offset = GeoFunctions.getDistanceInM(new SpatialPoint(roadSegment.getGeom().getCoordinateN(matchedIndex)), this);
        Coordinate[] coordinates = roadSegment.getGeom().getCoordinates();
        for(int i = 0; i < coordinates.length; i++) {
            offset += GeoFunctions.getDistanceInM(new SpatialPoint(coordinates[i]), new SpatialPoint(coordinates[i + 1]));
        }
        return offset;
    }
}
