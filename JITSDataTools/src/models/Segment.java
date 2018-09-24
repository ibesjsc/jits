/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Luzec
 */
public class Segment {
    private String line; // raw data
    //segment_id,????,????,????,street_id,street_type,(lat_start,lng_start),(lat_end,lng_end)
    private String segment_id;
    private String street_id;
    private String street_type;
    private Double lat_start;
    private Double lng_start;
    private Double lat_end;
    private Double lng_end;

    public Segment(String line, SegmentFormatter formatter) {
        this.line = line;
        String[] list = line.split(formatter.getSeparator());
        segment_id = list[formatter.getPos_segment_id()];
        street_id = list[formatter.getPos_street_id()];
        street_type = list[formatter.getPos_street_type()];
        lat_start = Double.valueOf(list[formatter.getPos_lat_start()]);
        lng_start = Double.valueOf(list[formatter.getPos_lng_start()]);
        lat_end = Double.valueOf(list[formatter.getPos_lat_end()]);
        lng_end = Double.valueOf(list[formatter.getPos_lng_end()]);
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    
    public String getSegment_id() {
        return segment_id;
    }

    public void setSegment_id(String segment_id) {
        this.segment_id = segment_id;
    }

    public String getStreet_id() {
        return street_id;
    }

    public void setStreet_id(String street_id) {
        this.street_id = street_id;
    }

    public String getStreet_type() {
        return street_type;
    }

    public void setStreet_type(String street_type) {
        this.street_type = street_type;
    }

    public Double getLat_start() {
        return lat_start;
    }

    public void setLat_start(Double lat_start) {
        this.lat_start = lat_start;
    }

    public Double getLng_start() {
        return lng_start;
    }

    public void setLng_start(Double lng_start) {
        this.lng_start = lng_start;
    }

    public Double getLat_end() {
        return lat_end;
    }

    public void setLat_end(Double lat_end) {
        this.lat_end = lat_end;
    }

    public Double getLng_end() {
        return lng_end;
    }

    public void setLng_end(Double lng_end) {
        this.lng_end = lng_end;
    }
    
    public boolean checkPointOutSide(Point point) {
        double start_lat = lat_start; 
        double start_lng = lng_start; 
        double end_lat = lat_end;
	double end_lng = lng_end;
        
        double sa = start_lng - end_lng;
        double sb = start_lat - end_lat;
        double sc = -(sa * start_lng + sb * start_lat);

        double ea = start_lng - end_lng;
        double eb = start_lat - end_lat;
        double ec = -(ea * end_lng + eb * end_lat);

        double sideDistance = (point.getLng() * sa + point.getLat() * sb + sc)
                        * (point.getLng() * ea + point.getLat() * eb + ec);
        if (sideDistance > 0) {
                // System.out.println("side distance > 0");
                return true;
        }
        return false;
    }
    
    // Check point whether belongs segment
    public boolean isBelongSegment(Point point, double distance){
        if (checkPointOutSide(point)) {
            return false;
        }
        double a = -(lat_start - lat_end);
        double b = (lng_start - lng_end);
//	double c = -(a * start_lng + b * start_lat);
        if ((Math.abs(a) + Math.abs(b)) == 0) {
            return false;
        }
        double y = (-a * point.getLat() + b * point.getLng() - ((b * (a * lng_start + b * lat_start)) / a)) / ((-b * b) / a - a);
        double x = ((a * lng_start + b * lat_start) / a) - (b / a) * y;
        Point tmp = new Point(y, x);
        if (point.distance(tmp) <= distance) {
                return true;
        }
        return false;
    }
}
