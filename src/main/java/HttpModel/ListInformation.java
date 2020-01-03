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
public class ListInformation {
    @SerializedName("id")
    @Expose       
    private String id;
    @SerializedName("web_id")
    @Expose       
    private String web_id; 
    @SerializedName("name")
    @Expose       
    private String name; 
    @SerializedName("contact")
    @Expose       
    private Contact contact; 
    @SerializedName("permission_reminder")
    @Expose      
    private String permission_reminder;
    @SerializedName("use_archive_bar")
    @Expose  
    private boolean use_archive_bar;
    @SerializedName("campaign_defaults")
    @Expose  
    private CampaignDefaults campaign_defaults;
    @SerializedName("notify_on_subscribe")
    @Expose  
    private String notify_on_subscribe;
    @SerializedName("notify_on_unsubscribe")
    @Expose  
    private String notify_on_unsubscribe; 
    @SerializedName("date_created")
    @Expose  
    private String date_created; 
    @SerializedName("list_rating")
    @Expose      
    private int list_rating; 
    @SerializedName("email_type_option")
    @Expose    
    private boolean email_type_option; 
    @SerializedName("subscribe_url_short")
    @Expose  
    private String subscribe_url_short; 
    @SerializedName("subscribe_url_long")
    @Expose  
    private String subscribe_url_long; 
    @SerializedName("beamer_address")
    @Expose  
    private String beamer_address; 
    @SerializedName("visibility")
    @Expose  
    private String visibility;
    @SerializedName("double_optin")
    @Expose  
    private boolean double_optin; 
    @SerializedName("has_welcome")
    @Expose  
    private boolean has_welcome; 
    @SerializedName("marketing_permissions")
    @Expose  
    private boolean marketing_permissions; 
    @SerializedName("modules")
    @Expose  
    private Object[] modules; 
    @SerializedName("stats")
    @Expose  
    private ListStats stats;
    @SerializedName("_links")
    @Expose  
    private Link[] links; 

    public ListInformation() {
    }

    public ListInformation(String id, String web_id, String name, Contact contact, String permission_reminder, 
            boolean use_archive_bar, CampaignDefaults campaign_defaults, String notify_on_subscribe, 
            String notify_on_unsubscribe, String date_created, int list_rating, boolean email_type_option, 
            String subscribe_url_short, String subscribe_url_long, String beamer_address, String visibility, 
            boolean double_optin, boolean has_welcome, boolean marketing_permissions, Object[] modules, ListStats stats, Link[] links) {
        this.id = id;
        this.web_id = web_id;
        this.name = name;
        this.contact = contact;
        this.permission_reminder = permission_reminder;
        this.use_archive_bar = use_archive_bar;
        this.campaign_defaults = campaign_defaults;
        this.notify_on_subscribe = notify_on_subscribe;
        this.notify_on_unsubscribe = notify_on_unsubscribe;
        this.date_created = date_created;
        this.list_rating = list_rating;
        this.email_type_option = email_type_option;
        this.subscribe_url_short = subscribe_url_short;
        this.subscribe_url_long = subscribe_url_long;
        this.beamer_address = beamer_address;
        this.visibility = visibility;
        this.double_optin = double_optin;
        this.has_welcome = has_welcome;
        this.marketing_permissions = marketing_permissions;
        this.modules = modules;
        this.stats = stats;
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public String getWeb_id() {
        return web_id;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public String getPermission_reminder() {
        return permission_reminder;
    }

    public boolean isUse_archive_bar() {
        return use_archive_bar;
    }

    public CampaignDefaults getCampaign_defaults() {
        return campaign_defaults;
    }

    public String getNotify_on_subscribe() {
        return notify_on_subscribe;
    }

    public String getNotify_on_unsubscribe() {
        return notify_on_unsubscribe;
    }

    public String getDate_created() {
        return date_created;
    }

    public int getList_rating() {
        return list_rating;
    }

    public boolean isEmail_type_option() {
        return email_type_option;
    }

    public String getSubscribe_url_short() {
        return subscribe_url_short;
    }

    public String getSubscribe_url_long() {
        return subscribe_url_long;
    }

    public String getBeamer_address() {
        return beamer_address;
    }

    public String getVisibility() {
        return visibility;
    }

    public boolean isDouble_optin() {
        return double_optin;
    }

    public boolean isHas_welcome() {
        return has_welcome;
    }

    public boolean isMarketing_permissions() {
        return marketing_permissions;
    }

    public Object[] getModules() {
        return modules;
    }

    public ListStats getStats() {
        return stats;
    }

    public Link[] getLinks() {
        return links;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWeb_id(String web_id) {
        this.web_id = web_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setPermission_reminder(String permission_reminder) {
        this.permission_reminder = permission_reminder;
    }

    public void setUse_archive_bar(boolean use_archive_bar) {
        this.use_archive_bar = use_archive_bar;
    }

    public void setCampaign_defaults(CampaignDefaults campaign_defaults) {
        this.campaign_defaults = campaign_defaults;
    }

    public void setNotify_on_subscribe(String notify_on_subscribe) {
        this.notify_on_subscribe = notify_on_subscribe;
    }

    public void setNotify_on_unsubscribe(String notify_on_unsubscribe) {
        this.notify_on_unsubscribe = notify_on_unsubscribe;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public void setList_rating(int list_rating) {
        this.list_rating = list_rating;
    }

    public void setEmail_type_option(boolean email_type_option) {
        this.email_type_option = email_type_option;
    }

    public void setSubscribe_url_short(String subscribe_url_short) {
        this.subscribe_url_short = subscribe_url_short;
    }

    public void setSubscribe_url_long(String subscribe_url_long) {
        this.subscribe_url_long = subscribe_url_long;
    }

    public void setBeamer_address(String beamer_address) {
        this.beamer_address = beamer_address;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setDouble_optin(boolean double_optin) {
        this.double_optin = double_optin;
    }

    public void setHas_welcome(boolean has_welcome) {
        this.has_welcome = has_welcome;
    }

    public void setMarketing_permissions(boolean marketing_permissions) {
        this.marketing_permissions = marketing_permissions;
    }

    public void setModules(Object[] modules) {
        this.modules = modules;
    }

    public void setStats(ListStats stats) {
        this.stats = stats;
    }

    public void setLinks(Link[] links) {
        this.links = links;
    }    
}
