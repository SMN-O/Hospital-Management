/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Patient;
import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.UUID;

/**
 *
 * @author Simon Yates
 */
public class AccountHandler {

    public static String makePatientID;
    
    public int NewAccountId()
    {     
        int highestId = 0;
        for (Patient account : Patient.users) {
            
            //get the last 4 chars, turn to int, then increment by one.
            String retrieveID = account.getID().substring(1);

            //got ya new id number.
            int id = Integer.parseInt(retrieveID);
            if(id > highestId){
                highestId = id;                
            }
        }            
        
        highestId++;
        
        return highestId;
    }
    public String makePatientID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "P"+NewAccountId();
        return createdID;
    
    }
    public String makeDoctorID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "D"+NewAccountId();
        return createdID;
    }
    public String makeSecretaryID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "S"+NewAccountId();
        return createdID;
    
    }
    public String makeAdminID() {
		int generateID = (int)(Math.random()*9000)+1000;
                String createdID = "A"+NewAccountId();
        return createdID;
    }
}

    
    