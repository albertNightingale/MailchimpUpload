/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpModel;

import com.google.gson.annotations.Expose;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 *
 * @author albertliu
 */
@Generated("org.jsonschema2pojo") 
public class Location {
    
    @Expose
    private double latitude;
    @Expose
    private double longtitude;
    @Expose
    private double gmtoff;
    @Expose
    private double dstoff;
    @Expose
    private String country_code;
    @Expose
    private String timezone;

    public Location() {
    }

    public Location(double latitude, double longtitude, double gmtoff, double dstoff, String country_code, String timezone) {
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.gmtoff = gmtoff;
        this.dstoff = dstoff;
        this.country_code = country_code;
        this.timezone = timezone;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public double getGmtoff() {
        return gmtoff;
    }

    public double getDstoff() {
        return dstoff;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public void setGmtoff(double gmtoff) {
        this.gmtoff = gmtoff;
    }

    public void setDstoff(double dstoff) {
        this.dstoff = dstoff;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    
            
}
