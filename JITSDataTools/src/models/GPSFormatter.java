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
public class GPSFormatter {
    private String separator;
    private int posDeviceID;
    private int posType;
    private int posDriver;
    private int posSpeed;
    private int posDateTime;
    private int posXLatitude;
    private int posYLongitute;
    private int posZVertical;

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public int getPosDeviceID() {
        return posDeviceID;
    }

    public void setPosDeviceID(int posDeviceID) {
        this.posDeviceID = posDeviceID;
    }

    public int getPosType() {
        return posType;
    }

    public void setPosType(int posType) {
        this.posType = posType;
    }

    public int getPosDriver() {
        return posDriver;
    }

    public void setPosDriver(int posDriver) {
        this.posDriver = posDriver;
    }

    public int getPosSpeed() {
        return posSpeed;
    }

    public void setPosSpeed(int posSpeed) {
        this.posSpeed = posSpeed;
    }

    public int getPosDateTime() {
        return posDateTime;
    }

    public void setPosDateTime(int posDateTime) {
        this.posDateTime = posDateTime;
    }

    public int getPosXLatitude() {
        return posXLatitude;
    }

    public void setPosXLatitude(int posXLatitude) {
        this.posXLatitude = posXLatitude;
    }

    public int getPosYLongitute() {
        return posYLongitute;
    }

    public void setPosYLongitute(int posYLongitute) {
        this.posYLongitute = posYLongitute;
    }

    public int getPosZVertical() {
        return posZVertical;
    }

    public void setPosZVertical(int posZVertical) {
        this.posZVertical = posZVertical;
    }

    public GPSFormatter(String separator, int posDeviceID, int posType, int posDriver, int posSpeed, int posDateTime, int posXLatitude, int posYLongitute, int posZVertical) {
        this.separator = separator;
        this.posDeviceID = posDeviceID;
        this.posType = posType;
        this.posDriver = posDriver;
        this.posSpeed = posSpeed;
        this.posDateTime = posDateTime;
        this.posXLatitude = posXLatitude;
        this.posYLongitute = posYLongitute;
        this.posZVertical = posZVertical;
    }
    
    public GPSFormatter(String separator, String posDeviceID, String posType, String posDriver, String posSpeed, String posDateTime, String posXLatitude, String posYLongitute, String posZVertical) {
        this.separator = separator;
        this.posDeviceID = Integer.valueOf(posDeviceID);
        this.posType = Integer.valueOf(posType);
        this.posDriver = Integer.valueOf(posDriver);
        this.posSpeed = Integer.valueOf(posSpeed);
        this.posDateTime = Integer.valueOf(posDateTime);
        this.posXLatitude = Integer.valueOf(posXLatitude);
        this.posYLongitute = Integer.valueOf(posYLongitute);
        this.posZVertical = Integer.valueOf(posZVertical);
    }
}
