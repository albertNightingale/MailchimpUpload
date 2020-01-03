/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpModel;

import com.google.gson.annotations.Expose;
import javax.annotation.processing.Generated;

/**
 *
 * @author albertliu
 */ 
@Generated("org.jsonschema2pojo") 
public class Member {

    @Expose  
    private String email_address;
    @Expose  
    private String status; 

    public Member() {
    }

    public Member(String email_address, String status) {
        this.email_address = email_address;
        this.status = status;
    }

    public String getEmail_address() {
        return email_address;
    }

    public String getStatus() {
        return status;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
