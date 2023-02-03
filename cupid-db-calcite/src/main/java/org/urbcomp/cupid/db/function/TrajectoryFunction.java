/*
 * This file is inherited from Apache Calcite and modifed by ST-Lab under apache license.
 * You can find the original code from
 *
 * https://github.com/apache/calcite
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.urbcomp.cupid.db.function;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.Point;
import org.urbcomp.cupid.db.algorithm.mapmatch.tihmm.TiHmmMapMatcher;
import org.urbcomp.cupid.db.algorithm.shortestpath.BiDijkstraShortestPath;
import org.urbcomp.cupid.db.algorithm.staypointdetection.StayGPSPointList;
import org.urbcomp.cupid.db.algorithm.staypointdetection.StayPointDetection;
import org.urbcomp.cupid.db.algorithm.trajectorysegment.TimeIntervalSegment;
import org.urbcomp.cupid.db.exception.AlgorithmExecuteException;
import org.urbcomp.cupid.db.model.roadnetwork.RoadNetwork;
import org.urbcomp.cupid.db.model.trajectory.MapMatchedTrajectory;
import org.urbcomp.cupid.db.model.trajectory.Trajectory;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class TrajectoryFunction {

    @CupidDBFunction("st_traj_asGeoJSON")
    public String st_traj_asGeoJSON(Trajectory trajectory) throws JsonProcessingException {
        return trajectory.toGeoJSON();
    }

    @CupidDBFunction("st_traj_fromGeoJSON")
    public Trajectory st_traj_fromGeoJSON(String str) throws IOException {
        return Trajectory.fromGeoJSON(str);
    }

    @CupidDBFunction("st_traj_oid")
    public String st_traj_oid(Trajectory trajectory) {
        return trajectory.getOid();
    }

    @CupidDBFunction("st_traj_tid")
    public String st_traj_tid(Trajectory trajectory) {
        return trajectory.getTid();
    }

    @CupidDBFunction("st_traj_startTime")
    public Timestamp st_traj_startTime(Trajectory trajectory) {
        return trajectory.getStartTime();
    }

    @CupidDBFunction("st_traj_endTime")
    public Timestamp st_traj_endTime(Trajectory trajectory) {
        return trajectory.getEndTime();
    }

    @CupidDBFunction("st_traj_startPoint")
    public Point st_traj_startPoint(Trajectory trajectory) {
        return trajectory.getStartPoint();
    }

    @CupidDBFunction("st_traj_endPoint")
    public Point st_traj_endPoint(Trajectory trajectory) {
        return trajectory.getEndPoint();
    }

    @CupidDBFunction("st_traj_numOfPoints")
    public int st_traj_numOfPoints(Trajectory trajectory) {
        return trajectory.getGPSPointList().size();
    }

    @CupidDBFunction("st_traj_pointN")
    public Point st_traj_pointN(Trajectory trajectory, int n) {
        return trajectory.getGPSPointList().get(n);
    }

    @CupidDBFunction("st_traj_timeN")
    public Timestamp st_traj_timeN(Trajectory trajectory, int n) {
        return trajectory.getGPSPointList().get(n).getTime();
    }

    @CupidDBFunction("st_traj_lengthInKM")
    public double st_traj_lengthInKM(Trajectory trajectory) {
        return trajectory.getLengthInKm();
    }

    @CupidDBFunction("st_traj_speedInKMPerHour")
    public double st_traj_speedInKMPerHour(Trajectory trajectory) {
        return trajectory.getSpeedInKMPerHour();
    }

    @CupidDBFunction("st_traj_geom")
    public LineString st_traj_geom(Trajectory trajectory) {
        return trajectory.getLineString();
    }

    @CupidDBFunction("st_traj_mapMatch")
    public String st_traj_mapMatch(RoadNetwork roadNetwork, Trajectory trajectory)
        throws AlgorithmExecuteException, JsonProcessingException {
        TiHmmMapMatcher mapMatcher = new TiHmmMapMatcher(
            roadNetwork,
            new BiDijkstraShortestPath(roadNetwork)
        );
        MapMatchedTrajectory mmTrajectory = mapMatcher.mapMatch(trajectory);
        return mmTrajectory.toGeoJSON();
    }

    @CupidDBFunction("st_traj_timeIntervalSegment")
    public List<Trajectory> st_traj_timeIntervalSegment(
        Trajectory trajectory,
        int maxTimeIntervalInSec
    ) {
        TimeIntervalSegment trajectortsegment = new TimeIntervalSegment(maxTimeIntervalInSec);
        List<Trajectory> subtrajectory = trajectortsegment.segment(trajectory);
        return subtrajectory;
    }

    @CupidDBFunction("st_traj_stayPointDetection")
    public List<StayGPSPointList> st_traj_stayPointDetection(
        Trajectory trajectory,
        double d,
        double t
    ) {
        StayPointDetection stayPointDetection = new StayPointDetection();
        return stayPointDetection.detection(trajectory, d, t);
    }
}
