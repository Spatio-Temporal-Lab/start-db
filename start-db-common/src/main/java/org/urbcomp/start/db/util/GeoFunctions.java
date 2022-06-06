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

package org.urbcomp.start.db.util;

import org.urbcomp.start.db.model.point.SpatialPoint;

public class GeoFunctions {

    /**
     * 地球长半径
     */
    private static final double EARTH_RADIUS_IN_METER = 6378137.0;

    /**
     * 将球面距离转化为度（在地理坐标系下做缓冲区时使用）
     *
     * @param distance 距离，单位m
     * @return 弧度
     */
    public static double getDegreeFromM(double distance) {
        double perimeter = 2 * Math.PI * EARTH_RADIUS_IN_METER;
        double degreePerM = 360 / perimeter;
        return distance * degreePerM;
    }

    /**
     * 计算两经纬度间距离
     *
     * @param lng1 经度1
     * @param lat1 纬度1
     * @param lng2 经度2
     * @param lat2 纬度2
     * @return meter，有误差
     */
    public static double getDistanceInM(double lng1, double lat1, double lng2, double lat2) {
        double radLat1 = Math.toRadians(lat1);
        double radLat2 = Math.toRadians(lat2);
        double radLatDistance = radLat1 - radLat2;
        double radLngDistance = Math.toRadians(lng1) - Math.toRadians(lng2);
        return 2 * Math.asin(
            Math.sqrt(
                Math.pow(Math.sin(radLatDistance / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2)
                    * Math.pow(Math.sin(radLngDistance / 2), 2)
            )
        ) * EARTH_RADIUS_IN_METER;
    }

    public static double getDistanceInM(SpatialPoint point1, SpatialPoint point2) {
        return getDistanceInM(point1.getLng(), point1.getLat(), point2.getLng(), point2.getLat());
    }
}
