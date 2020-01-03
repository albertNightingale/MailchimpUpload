/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ywrealty.subscriberupdate;

import HttpMailchimp.MailchimpRequestSender;
import HttpModel.ListInformation;
import HttpModel.Member;
import HttpModel.ResponseMember;
import com.ywrealty.subscriberupdate.GSUploader.SheetManager;
import java.util.ArrayList;
import java.util.Hashtable;

import java.util.Scanner;

/**
 *
 * @author albertliu
 */
public class Launcher {
 
    public ArrayList<String> getEmailsFromSpreadsheets()
    {
        ArrayList<String> emails = new ArrayList<String>();
        
        SheetManager sm = new SheetManager();
        
    }
    
    public static void main(String[] args)
    {
        MailchimpRequestSender mrs = new MailchimpRequestSender("098574958a2931e8cf7ea39a55d57573-us18");
        Hashtable<String, ListInformation> listdata = mrs.getLists();
        
        System.out.println("Enter the List name: ");
        Scanner sc = new Scanner(System.in);
        String listname = sc.next();
        boolean foundlist = false;
        if (listname != null)
        {
            for(ListInformation list : listdata.values())
            {
                if (listname.equals(list.getName()))
                {
                    foundlist = true;
                    break;
                }
            }
        }

        if (foundlist==true)        
        {
            Member m = new Member("alb.k1@gmail.com", "subscribed");
            ResponseMember rm = mrs.addMember(m, listname);
            System.out.println("Found object? " + mrs.verifyMemberExistence(listname, rm));
        }
        else
        {
            System.out.println(foundlist + " does not exist in your mailchimp account ");
        }
    }
}
