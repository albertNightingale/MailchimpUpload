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
public class MergeFields {
    @Expose
    @SerializedName("FNAME")
    private String fname;
    @Expose
    @SerializedName("LNAME")
    private String lname;
    @Expose
    @SerializedName("ADDRESS")
    private String add;
    @Expose
    @SerializedName("PHONE")
    private String phone;    

    public MergeFields() {
    }

    public MergeFields(String fname, String lname, String add, String phone) {
        this.fname = fname;
        this.lname = lname;
        this.add = add;
        this.phone = phone;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAdd() {
        return add;
    }

    public String getPhone() {
        return phone;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
