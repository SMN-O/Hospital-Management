/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Patient;

/**
 *
 * @author Simon Yates
 */
public class AccountHandler {

    public static String makePatientID;
    
    public String NewAccountId()
    {     
        int highestId = 0;
        for (Patient account : Patient.users) {
            
            try {

                //get the last 4 chars, turn to int, then increment by one.
                String retrieveID = account.getID().substring(1, 5);
                
                //got ya new id number.
                int id = Integer.parseInt(retrieveID);
                if(id > highestId){
                    highestId = id;                
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }            
        
        highestId++;
        
        return String.format("%04d", highestId).substring(0, 4);
    }
    
    public String makePatientID() {
                String createdID = "P"+NewAccountId();
        return createdID;
    
    }
    public String makeDoctorID() {
                String createdID = "D"+NewAccountId();
        return createdID;
    }
    public String makeSecretaryID() {
                String createdID = "S"+NewAccountId();
        return createdID;
    
    }
    public String makeAdminID() {
                String createdID = "A"+NewAccountId();
        return createdID;
    }
}

    
    