/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.processing.Generated;

/**
 *
 * @author albertliu
 */
@Generated("org.jsonschema2pojo") 
public class MemberStats {
     @Expose
     private double avg_open_rate;
     @Expose
     private double avg_click_rate;

    public MemberStats() {
    }

    public MemberStats(double avg_open_rate, double avg_click_rate) {
        this.avg_open_rate = avg_open_rate;
        this.avg_click_rate = avg_click_rate;
    }

    public double getAvg_click_rate() {
        return avg_click_rate;
    }

    public double getAvg_open_rate() {
        return avg_open_rate;
    }

    public void setAvg_open_rate(double avg_open_rate) {
        this.avg_open_rate = avg_open_rate;
    }

    public void setAvg_click_rate(double avg_click_rate) {
        this.avg_click_rate = avg_click_rate;
    }
    
}
