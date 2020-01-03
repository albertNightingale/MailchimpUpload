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
public class ResponseMember{
    @Expose
    private String id;
    @Expose
    private String email_address;
    @Expose
    private String unique_email_id;
    @Expose
    private int web_id;
    @Expose
    private String email_type;
    @Expose
    private String status;
    @Expose
    private MergeFields merge_fields;
    @Expose
    private MemberStats stats;
    @Expose
    private String ip_signup;
    @Expose
    private String timestamp_signup;
    @Expose
    private String ip_opt;
    @Expose
    private String timestamp_opt;
    @Expose
    private int member_rating;
    @Expose
    private String last_changed;
    @Expose
    private String language;
    @Expose
    private boolean vip;
    @Expose
    private String email_client;
    @Expose
    private Location location;
    @Expose
    private String source;
    @Expose
    private int tags_count;
    @Expose
    private Object[] tags;
    @Expose
    private String list_id;
    @SerializedName("_links")
    @Expose
    private Link[] links;

    public ResponseMember() {
    }

    public ResponseMember(String id, String email_address, String unique_email_id, int web_id, String email_type, 
            String status, MergeFields merge_fields, MemberStats stats, String ip_signup, String timestamp_signup, 
            String ip_opt, String timestamp_opt, int member_rating, String last_changed, String language, 
            boolean vip, String email_client, Location location, String source, int tags_count, Object[] tags, 
            String list_id, Link[] links) {

        this.id = id;
        this.email_address = email_address;
        this.unique_email_id = unique_email_id;
        this.web_id = web_id;
        this.email_type = email_type;
        this.status = status;
        this.merge_fields = merge_fields;
        this.stats = stats;
        this.ip_signup = ip_signup;
        this.timestamp_signup = timestamp_signup;
        this.ip_opt = ip_opt;
        this.timestamp_opt = timestamp_opt;
        this.member_rating = member_rating;
        this.last_changed = last_changed;
        this.language = language;
        this.vip = vip;
        this.email_client = email_client;
        this.location = location;
        this.source = source;
        this.tags_count = tags_count;
        this.tags = tags;
        this.list_id = list_id;
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public String getEmail_address() {
        return email_address;
    }

    public String getUnique_email_id() {
        return unique_email_id;
    }

    public int getWeb_id() {
        return web_id;
    }

    public String getEmail_type() {
        return email_type;
    }

    public String getStatus() {
        return status;
    }

    public MergeFields getMerge_fields() {
        return merge_fields;
    }

    public MemberStats getStats() {
        return stats;
    }

    public String getIp_signup() {
        return ip_signup;
    }

    public String getTimestamp_signup() {
        return timestamp_signup;
    }

    public String getIp_opt() {
        return ip_opt;
    }

    public String getTimestamp_opt() {
        return timestamp_opt;
    }

    public int getMember_rating() {
        return member_rating;
    }

    public String getLast_changed() {
        return last_changed;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isVip() {
        return vip;
    }

    public String getEmail_client() {
        return email_client;
    }

    public Location getLocation() {
        return location;
    }

    public String getSource() {
        return source;
    }

    public int getTags_count() {
        return tags_count;
    }

    public Object[] getTags() {
        return tags;
    }

    public String getList_id() {
        return list_id;
    }

    public Link[] getLinks() {
        return links;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setUnique_email_id(String unique_email_id) {
        this.unique_email_id = unique_email_id;
    }

    public void setWeb_id(int web_id) {
        this.web_id = web_id;
    }

    public void setEmail_type(String email_type) {
        this.email_type = email_type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMerge_fields(MergeFields merge_fields) {
        this.merge_fields = merge_fields;
    }

    public void setStats(MemberStats stats) {
        this.stats = stats;
    }

    public void setIp_signup(String ip_signup) {
        this.ip_signup = ip_signup;
    }

    public void setTimestamp_signup(String timestamp_signup) {
        this.timestamp_signup = timestamp_signup;
    }

    public void setIp_opt(String ip_opt) {
        this.ip_opt = ip_opt;
    }

    public void setTimestamp_opt(String timestamp_opt) {
        this.timestamp_opt = timestamp_opt;
    }

    public void setMember_rating(int member_rating) {
        this.member_rating = member_rating;
    }

    public void setLast_changed(String last_changed) {
        this.last_changed = last_changed;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTags_count(int tags_count) {
        this.tags_count = tags_count;
    }

    public void setTags(Object[] tags) {
        this.tags = tags;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public void setLinks(Link[] links) {
        this.links = links;
    }
}
