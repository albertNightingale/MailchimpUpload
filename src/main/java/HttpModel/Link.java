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
public class Link {
    @Expose
    private String rel;
    @Expose
    private String href;
    @Expose
    private String method;
    @Expose
    private String targetSchema;

    public Link() {
    }

    public Link(String rel, String href, String method, String targetSchema) {
        this.rel = rel;
        this.href = href;
        this.method = method;
        this.targetSchema = targetSchema;
    }

    public String getRel() {
        return rel;
    }

    public String getHref() {
        return href;
    }

    public String getMethod() {
        return method;
    }

    public String getTargetSchema() {
        return targetSchema;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setTargetSchema(String targetSchema) {
        this.targetSchema = targetSchema;
    }
    
    
}
