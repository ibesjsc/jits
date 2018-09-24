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
public class GPS {
    private String line; // raw data
    private String deviceID;
    private String type;
    private String driver;
    private Double speed;
    private Long dateTime; // Unix time
    private Double xLatitude;
    private Double yLongitute;
    private Double zVertical;

    public Double getxLatitude() {
        return xLatitude;
    }

    public void setxLatitude(Double xLatitude) {
        this.xLatitude = xLatitude;
    }

    public Double getyLongitute() {
        return yLongitute;
    }

    public void setyLongitute(Double yLongitute) {
        this.yLongitute = yLongitute;
    }

    public Double getzVertical() {
        return zVertical;
    }

    public void setzVertical(Double zVertical) {
        this.zVertical = zVertical;
    }

    
    
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Long getDateTime() {
        return dateTime;
    }

    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }
    
    public GPS(String line, GPSFormatter formatter) {
        this.line = line;
        String[] list = line.split(formatter.getSeparator());
        deviceID = list[formatter.getPosDeviceID()];
        type = list[formatter.getPosType()];
        driver = list[formatter.getPosDriver()];
        speed = Double.valueOf(list[formatter.getPosSpeed()]);
        dateTime = Long.valueOf(list[formatter.getPosDateTime()]);
        xLatitude = Double.valueOf(list[formatter.getPosXLatitude()]);
        yLongitute = Double.valueOf(list[formatter.getPosYLongitute()]);
        zVertical = Double.valueOf(list[formatter.getPosZVertical()]);
    }    
}
