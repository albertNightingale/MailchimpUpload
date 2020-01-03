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
public class CampaignDefaults {
    @Expose   
    private String from_name;
    @Expose   
    private String from_email;
    @Expose   
    private String subject;
    @Expose   
    private String language;

    public CampaignDefaults() {
    }

    public CampaignDefaults(String from_name, String from_email, String subject, String language) {
        this.from_name = from_name;
        this.from_email = from_email;
        this.subject = subject;
        this.language = language;
    }

    public String getFrom_name() {
        return from_name;
    }

    public String getFrom_email() {
        return from_email;
    }

    public String getSubject() {
        return subject;
    }

    public String getLanguage() {
        return language;
    }

    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    public void setFrom_email(String from_email) {
        this.from_email = from_email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
}
