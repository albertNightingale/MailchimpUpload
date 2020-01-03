/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpMailchimp;

import HttpModel.ResponseMember;
import HttpModel.ListInformation;
import HttpModel.ListInformations;
import HttpModel.Member;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author albertliu
 */
public class MailchimpRequestSender {

    private String key;
    private final String BASEURL; 
    private static final String AUTHURI = "https://login.mailchimp.com/oauth2/authorize/";
    private static final String AUTHURI1 = "authorized-apps/";
    private static final String GETLISTSURI = "lists/";
    private static final String ADDSUBSCRIBERTOLISTURI = "members/";
    
    public MailchimpRequestSender(String key)  {
        this.key = key; 
        String serverLoc;
        
        if (this.key != null && key.contains("-"))
        {
            serverLoc = key.split("-")[1];
            if (!getHome(String.format("https://%s.api.mailchimp.com/3.0/", serverLoc))) // test if the key is going to work
            {
                BASEURL = null;
                throw new IllegalArgumentException("Constructor(): the key or the server location is invalid"); 
            }
        }
        else
        {
            BASEURL = null;
            throw new NullPointerException("Constructor(): the key cannot be null!"); 
        }
        
        BASEURL = String.format("https://%s.api.mailchimp.com/3.0/", serverLoc); 
    }
    
    /********
     * Get the home information of the account on Mailchimp
     * @param url the url to put into the server
     * @return true if the method successfully get the response from the server, 
     * false if any exceptions or errors occurred
     */
    public boolean getHome(String url)
    {
        boolean success = true;
        try(CloseableHttpClient httpClient = HttpClients.createDefault())
        {
            HttpGet request = new HttpGet(url);
            request.setHeader("Authorization", String.format("Basic %s", key));

            try (CloseableHttpResponse response = httpClient.execute(request))
            {
                HttpEntity entity = response.getEntity();
                
                System.out.println("----------------------------------------");
                System.out.println("Get Home: ");
                System.out.println(response.getStatusLine());
                if(response.getStatusLine().getStatusCode() >= 400)
                    success = false;
                String returnresult = "";
                if (entity != null) {
                    returnresult = new String(entity.getContent().readAllBytes());  // the result of the content
                    System.out.println("    Response content: " + returnresult);
                    System.out.println("----------------------------------------"); 
                }
                EntityUtils.consume(entity);   
            }
            return success; 
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            success = false;
            return success;
        }
    }
    
    /******
     * Get all the lists in the Mailchimp account, 
     * @return Hashtable<String, ListInformation> key is the list_id, null if any exceptions are raised
     */
    public Hashtable<String, ListInformation> getLists()
    {
        Hashtable<String, ListInformation> table = null;
        
        try(CloseableHttpClient httpClient = HttpClients.createDefault())
        {
            String authURL = BASEURL + GETLISTSURI;
            HttpGet request = new HttpGet(authURL);
            request.setHeader("Authorization", String.format("Basic %s", key));
            
            try (CloseableHttpResponse response = httpClient.execute(request))
            {
                
                HttpEntity entity = response.getEntity();
                String returnresult = "";
                System.out.println("----------------------------------------");
                System.out.println(response.getStatusLine());
                if (response.getStatusLine().getStatusCode() >= 400)
                    table = null;
                else 
                    table = new Hashtable<>();
                if (entity != null) { // output the result of the content  
                    returnresult = new String(entity.getContent().readAllBytes());  // the result of the content
                    System.out.println("    Response content: " + returnresult); 
                    System.out.println("----------------------------------------");
                }

                EntityUtils.consume(entity); 
                
                if (table != null)
                {
                    // convert Json object into Java Object 
                    ListInformations resultobj = new Gson().fromJson(returnresult, ListInformations.class); 

                    if (resultobj != null)
                        for(ListInformation li : resultobj.getLists())
                            table.put(li.getId(), li);
                }
            } 
            return table;
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return null;
        }
    }
    
    /*****
     * Find the list from lists
     * @param list
     * @param lists
     * @param list_id
     * @return return true if the list is found, false if is not found
     */
    public boolean findList(ListInformation list, Hashtable<Integer, ListInformation> lists, String list_id)
    {
        if (lists.containsKey(list_id))
        {
            list = lists.get(list_id);
            return true; 
        }

        return false; 
    }
    
    /********
     * Send a request to the Mailchimp server to add a member to the specified list in the account. 
     * 
     * If the server responds with any error messages, then set success to false; if the server 
     * responds with any 200 status code, then means that the member is successfully being added
     * 
     * After the member is being successfully added, parse the response and get the web id 
     * and set that as the id of the member passed into the parameter. Do not set the member 
     * if the the result is an error. 
     * @IOException when there exist any problem with CloseableHttpClient/CloseableHttpResponse, 
     * undo the set_id, and set success to false, then return. 
     * 
     * @param member is an object holding the information of the subscriber to be added
     * @param list_id the list in the lists object that is to be added
     * @return True if add member is successful, false if unsuccessful. 
     */
    public ResponseMember addMember(Member member, String list_id)
    {        
        ResponseMember returnmember = null; 
        try(CloseableHttpClient httpClient = HttpClients.createDefault())
        {
            String addMemberURL = BASEURL + GETLISTSURI + list_id + "/" + ADDSUBSCRIBERTOLISTURI;

            System.out.println(addMemberURL);
            HttpPost request = new HttpPost(addMemberURL);
            
            request.setHeader("Authorization", String.format("Basic %s", key));
            request.setHeader("Content-Type", "application/raw");
            String data = String.format("{\"email_address\": \"%s\", \"status\": \"%s\"}", 
                    member.getEmail_address(), member.getStatus());
            StringEntity enti = new StringEntity(data, ContentType.APPLICATION_FORM_URLENCODED);
            request.setEntity(enti);
            
            try (CloseableHttpResponse response = httpClient.execute(request))
            {
                HttpEntity entity = response.getEntity();
                String returnresult;
                System.out.println("----------------------------------------");
                System.out.println(response.getStatusLine());
                if (response.getStatusLine().getStatusCode() <= 400)
                    returnmember = new ResponseMember();
                if (entity != null) { // output the result of the content  
                    returnresult = new String(entity.getContent().readAllBytes());  // the result of the content
                    System.out.println("    Response content: " + returnresult); 
                    System.out.println("----------------------------------------");
                    
                    if (returnmember != null) // since the entity is not null and no error messages, parse it into ResponseMember
                    {
                        returnmember = new Gson().fromJson(returnresult, ResponseMember.class); 
                    }
                }

                EntityUtils.consume(entity); 
            } 
            return returnmember;
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return returnmember;
        }
    }
    
    /********
     * Verify the member is within the specified list
     * @param list_id the id of the list in lists
     * @param member the member
     * @return true if found, false if not found
     */
    public boolean verifyMemberExistence(String list_id, ResponseMember member)
    {
        boolean found;
        try(CloseableHttpClient httpClient = HttpClients.createDefault())
        {
            String addMemberURL = BASEURL + GETLISTSURI + list_id + "/" + ADDSUBSCRIBERTOLISTURI + member.getId() + "/";
            System.out.println(addMemberURL);

            HttpGet request = new HttpGet(addMemberURL);
            
            request.setHeader("Authorization", String.format("Basic %s", key));
            
            try (CloseableHttpResponse response = httpClient.execute(request))
            {
                HttpEntity entity = response.getEntity();
                String returnresult;
                System.out.println("----------------------------------------");
                System.out.println(response.getStatusLine());
                if (response.getStatusLine().getStatusCode() >= 400)
                    found = false;
                else
                    found = true;
                if (entity != null) { // output the result of the content  
                    returnresult = new String(entity.getContent().readAllBytes());  // the result of the content
                    System.out.println("    Response content: " + returnresult); 
                    System.out.println("----------------------------------------");
                }
        
                EntityUtils.consume(entity);                            
            }
            return found;
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            found = false;
            return found;
        }
    }    
}
