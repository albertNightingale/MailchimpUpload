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
public class ListStats {
    @Expose  
    private int member_count;
    @Expose  
    private int unsubscribe_count;
    @Expose  
    private int cleaned_count;
    @Expose  
    private int member_count_since_send;
    @Expose  
    private int unsubscribe_count_since_send;
    @Expose  
    private int cleaned_count_since_send;
    @Expose  
    private int campaign_count;
    @Expose  
    private String campaign_last_sent;
    @Expose  
    private int merge_field_count;
    @Expose  
    private double avg_sub_rate;
    @Expose  
    private double avg_unsub_rate;
    @Expose  
    private double target_sub_rate;
    @Expose  
    private double open_rate;
    @Expose  
    private double click_rate;
    @Expose  
    private String last_sub_date;
    @Expose  
    private String last_unsub_date;

    public ListStats() {
    }

    public ListStats(int member_count, int unsubscribe_count, int cleaned_count, int member_count_since_send, int unsubscribe_count_since_send, int cleaned_count_since_send, int campaign_count, String campaign_last_sent, int merge_field_count, double avg_sub_rate, double avg_unsub_rate, double target_sub_rate, double open_rate, double click_rate, String last_sub_date, String last_unsub_date) {
        this.member_count = member_count;
        this.unsubscribe_count = unsubscribe_count;
        this.cleaned_count = cleaned_count;
        this.member_count_since_send = member_count_since_send;
        this.unsubscribe_count_since_send = unsubscribe_count_since_send;
        this.cleaned_count_since_send = cleaned_count_since_send;
        this.campaign_count = campaign_count;
        this.campaign_last_sent = campaign_last_sent;
        this.merge_field_count = merge_field_count;
        this.avg_sub_rate = avg_sub_rate;
        this.avg_unsub_rate = avg_unsub_rate;
        this.target_sub_rate = target_sub_rate;
        this.open_rate = open_rate;
        this.click_rate = click_rate;
        this.last_sub_date = last_sub_date;
        this.last_unsub_date = last_unsub_date;
    }

    public void setMember_count(int member_count) {
        this.member_count = member_count;
    }

    public void setUnsubscribe_count(int unsubscribe_count) {
        this.unsubscribe_count = unsubscribe_count;
    }

    public void setCleaned_count(int cleaned_count) {
        this.cleaned_count = cleaned_count;
    }

    public void setMember_count_since_send(int member_count_since_send) {
        this.member_count_since_send = member_count_since_send;
    }

    public void setUnsubscribe_count_since_send(int unsubscribe_count_since_send) {
        this.unsubscribe_count_since_send = unsubscribe_count_since_send;
    }

    public void setCleaned_count_since_send(int cleaned_count_since_send) {
        this.cleaned_count_since_send = cleaned_count_since_send;
    }

    public void setCampaign_count(int campaign_count) {
        this.campaign_count = campaign_count;
    }

    public void setCampaign_last_sent(String campaign_last_sent) {
        this.campaign_last_sent = campaign_last_sent;
    }

    public void setMerge_field_count(int merge_field_count) {
        this.merge_field_count = merge_field_count;
    }

    public void setAvg_sub_rate(double avg_sub_rate) {
        this.avg_sub_rate = avg_sub_rate;
    }

    public void setAvg_unsub_rate(double avg_unsub_rate) {
        this.avg_unsub_rate = avg_unsub_rate;
    }

    public void setTarget_sub_rate(double target_sub_rate) {
        this.target_sub_rate = target_sub_rate;
    }

    public void setOpen_rate(double open_rate) {
        this.open_rate = open_rate;
    }

    public void setClick_rate(double click_rate) {
        this.click_rate = click_rate;
    }

    public void setLast_sub_date(String last_sub_date) {
        this.last_sub_date = last_sub_date;
    }

    public void setLast_unsub_date(String last_unsub_date) {
        this.last_unsub_date = last_unsub_date;
    }

    public int getMember_count() {
        return member_count;
    }

    public int getUnsubscribe_count() {
        return unsubscribe_count;
    }

    public int getCleaned_count() {
        return cleaned_count;
    }

    public int getMember_count_since_send() {
        return member_count_since_send;
    }

    public int getUnsubscribe_count_since_send() {
        return unsubscribe_count_since_send;
    }

    public int getCleaned_count_since_send() {
        return cleaned_count_since_send;
    }

    public int getCampaign_count() {
        return campaign_count;
    }

    public String getCampaign_last_sent() {
        return campaign_last_sent;
    }

    public int getMerge_field_count() {
        return merge_field_count;
    }

    public double getAvg_sub_rate() {
        return avg_sub_rate;
    }

    public double getAvg_unsub_rate() {
        return avg_unsub_rate;
    }

    public double getTarget_sub_rate() {
        return target_sub_rate;
    }

    public double getOpen_rate() {
        return open_rate;
    }

    public double getClick_rate() {
        return click_rate;
    }

    public String getLast_sub_date() {
        return last_sub_date;
    }

    public String getLast_unsub_date() {
        return last_unsub_date;
    }
    
    
    
}
