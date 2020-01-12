/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.UUID;

/**
 *
 * @author Simon Yates
 */
public class AccountHandler {
    public Account NewAccount()
    {     
        for (Account account : Account.users) {
            //get the user id
            account.getID();
            
            //get the last 4 chars, turn to int, then increment by one.
            String retrieveID = account.getID().substring(1);

            //got ya new id number.
            Integer.parseInt(retrieveID);
            
        }
        
        Account.users.size();
        for(Account account : Account.users) {
            account.getID();
            
         
        }
            
        
        return null;
    }
    public String makePatientID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "P"+generateID;
        return createdID;
    
    }
    public String makeDoctorID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "D"+generateID;
        return createdID;
    }
    public String makeSecretaryID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "S"+generateID;
        return createdID;
    
    }
    public String makeAdminID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "A"+generateID;
        return createdID;
    }
}

    
    