/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ywrealty.subscriberupdate.GSUploader;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**********
 * 
 * @author Albert Liu 
 */
public class SheetManager extends GooglesheetCredentials {

    private Logger logger = Logger.getLogger(SheetManager.class.getName());
    private final Sheets sheetsService; 
    private final String application_name;
    private final String spreadsheetid;
    
    public SheetManager(Properties prop, String application_name, String spreadsheetid) throws IOException, GeneralSecurityException {
        super(prop);
        this.application_name = application_name;
        this.spreadsheetid = spreadsheetid;
        sheetsService = createSheetsService(this.application_name);
    }
    
    public static Sheets createSheetsService(String application_name) throws IOException, GeneralSecurityException {
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Credential credential = getCredentials(HTTP_TRANSPORT); 
        
        return new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
        .setApplicationName(application_name).build(); 
    }     

    /*******
     * Allows for accessing the full list of data. 
     * @param sheetname
     * @return
     * @throws IOException
     * @throws GeneralSecurityException
     * @throws InterruptedException 
     */
    public List<List<Object>> accessdata(String sheetname) throws IOException, GeneralSecurityException, InterruptedException
    {
        ValueRange response = sheetsService.spreadsheets().values().get(spreadsheetid, sheetname).execute(); 
        
        List<List<Object>> values = response.getValues();
        
        if (values == null || response.isEmpty())
        {
            logger.log(Level.INFO, "Sheet is Empty");
            return null; 
        }
        else
        {
            return values; 
        }
    }
        
    private String timetostr(Timestamp t)
    {
        if (t == null)
        {
            return "NULL";
        }
        else
        {
            if (!t.toString().contains("-"))
                System.out.println(t.toString());
            return t.toString().split(" ")[0]; 
        }
    }
    
    // allows the program to pause a bit for the Google server to catch up. 
    private static void sleepABit() throws InterruptedException {    
        Thread.sleep(5000);
    }
        
}
