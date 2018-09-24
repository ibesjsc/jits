/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import utilities.Parameters;

/**
 *
 * @author Luzec
 */
public class Point {
    private Double lat;
    private Double lng;

    public Point(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Point(String lat, String lng)
    {
        this.lat = Double.valueOf(lat);
        this.lng = Double.valueOf(lng);
    }
    
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
    
    // Distance in km unit
    public double distance(Point point) {
        double lat1 = this.lat;
        double lng1 = this.lng;
        double lat2 = point.lat;
        double lng2 = point.lng;
        double earthRadius = Parameters.R;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double a = Math.pow(sindLat, 2)
                        + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double dist = earthRadius * c;
        return dist;
    }
}
