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
public class Contact {
    @SerializedName("company")
    @Expose   
    private String company;
    @SerializedName("address1")
    @Expose   
    private String address1;
    @SerializedName("address2")
    @Expose   
    private String address2;
    @SerializedName("city")
    @Expose   
    private String city;
    @SerializedName("state")
    @Expose   
    private String state;    
    @SerializedName("zip")
    @Expose   
    private String zip;  
    @SerializedName("country")
    @Expose   
    private String country;
    @SerializedName("phone")
    @Expose   
    private String phone; 

    public Contact() {
    }

    public Contact(String company, String address1, String address2, String city, String state, String zip, String country, String phone) {
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
