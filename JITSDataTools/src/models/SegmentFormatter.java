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
public class SegmentFormatter {
    private String separator;
    private int pos_segment_id;
    private int pos_street_id;
    private int pos_street_type;
    private int pos_lat_start;
    private int pos_lng_start;
    private int pos_lat_end;
    private int pos_lng_end;

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public int getPos_segment_id() {
        return pos_segment_id;
    }

    public void setPos_segment_id(int pos_segment_id) {
        this.pos_segment_id = pos_segment_id;
    }

    public int getPos_street_id() {
        return pos_street_id;
    }

    public void setPos_street_id(int pos_street_id) {
        this.pos_street_id = pos_street_id;
    }

    public int getPos_street_type() {
        return pos_street_type;
    }

    public void setPos_street_type(int pos_street_type) {
        this.pos_street_type = pos_street_type;
    }

    public int getPos_lat_start() {
        return pos_lat_start;
    }

    public void setPos_lat_start(int pos_lat_start) {
        this.pos_lat_start = pos_lat_start;
    }

    public int getPos_lng_start() {
        return pos_lng_start;
    }

    public void setPos_lng_start(int pos_lng_start) {
        this.pos_lng_start = pos_lng_start;
    }

    public int getPos_lat_end() {
        return pos_lat_end;
    }

    public void setPos_lat_end(int pos_lat_end) {
        this.pos_lat_end = pos_lat_end;
    }

    public int getPos_lng_end() {
        return pos_lng_end;
    }

    public void setPos_lng_end(int pos_lng_end) {
        this.pos_lng_end = pos_lng_end;
    }

    public SegmentFormatter(String separator, int pos_segment_id, int pos_street_id, int pos_street_type, int pos_lat_start, int pos_lng_start, int pos_lat_end, int pos_lng_end) {
        this.separator = separator;
        this.pos_segment_id = pos_segment_id;
        this.pos_street_id = pos_street_id;
        this.pos_street_type = pos_street_type;
        this.pos_lat_start = pos_lat_start;
        this.pos_lng_start = pos_lng_start;
        this.pos_lat_end = pos_lat_end;
        this.pos_lng_end = pos_lng_end;
    }
    
    public SegmentFormatter(String separator, String pos_segment_id, String pos_street_id, String pos_street_type, String pos_lat_start, String pos_lng_start, String pos_lat_end, String pos_lng_end) {
        this.separator = separator;
        this.pos_segment_id = Integer.valueOf(pos_segment_id);
        this.pos_street_id = Integer.valueOf(pos_street_id);
        this.pos_street_type = Integer.valueOf(pos_street_type);
        this.pos_lat_start = Integer.valueOf(pos_lat_start);
        this.pos_lng_start = Integer.valueOf(pos_lng_start);
        this.pos_lat_end = Integer.valueOf(pos_lat_end);
        this.pos_lng_end = Integer.valueOf(pos_lng_end);
    }
}
