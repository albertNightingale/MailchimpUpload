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
public class ListInformations {
    @SerializedName("lists")
    @Expose 
    private ListInformation[] lists;

    public ListInformations() {
    
    }

    public ListInformations(ListInformation[] lists) {
        this.lists = lists;
    }

    public ListInformation[] getLists() {
        return lists;
    }

    public void setLists(ListInformation[] lists) {
        this.lists = lists;
    }
    
}
