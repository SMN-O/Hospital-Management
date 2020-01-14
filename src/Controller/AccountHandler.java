/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import Model.Doctor;
import Model.Patient;
import Model.Secretary;

/**
 *
 * @author Simon Yates
 */
public class AccountHandler {
//makePatientID
    public static String makePatientID;
    
    public static String NewPatientId()
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
        return "P" + String.format("%04d", highestId).substring(0, 4);
    }
        //Creates for Doctors
    public static String NewDocId()
    {     
        int highestId = 0;
        for (Doctor account : Doctor.doctors) {
            
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
//increments
        highestId++;
        //returns the letter D before the integers
        return "D" + String.format("%04d", highestId).substring(0, 4);
    }
    
    public static String NewSecId()
    {     
        int highestId = 0;
        for (Secretary account : Secretary.secretaries) {
            
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
        
        return "S" + String.format("%04d", highestId).substring(0, 4);
    }
        
    public static String NewAdminId()
    {     
        int highestId = 0;
        for (Admin account : Admin.admins) {
            
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
        
        return "A" + String.format("%04d", highestId).substring(0, 4);
    }
    

}

    
    

    
    



    
    