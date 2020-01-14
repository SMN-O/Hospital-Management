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
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

/**
 *
 * @author Simon Yates
 */
public class JsonFileReadWrite {
 
    public static void writeAccounts(){
        Gson gson = new Gson();
  
        String json = gson.toJson(Patient.getUsers());
    
        try{
            FileWriter writer = new FileWriter("Patients.txt", true);
            writer.write(json);
            writer.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        json = gson.toJson(Doctor.getDoctors());
    
        try{
            FileWriter writer = new FileWriter("Doctors.txt", true);
            writer.write(json);
            writer.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        json = gson.toJson(Secretary.getSecretaries());
    
        try{
            FileWriter writer = new FileWriter("Secretarys.txt", true);
            writer.write(json);
            writer.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        json = gson.toJson(Admin.getAdmins());
    
        try{
            FileWriter writer = new FileWriter("Admins.txt", true);
            writer.write(json);
            writer.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void loadAccounts()
    {
        try{
        BufferedReader br = new BufferedReader(new FileReader("Patients.txt"));
              
        String firstLine = br.readLine();
        
        Gson gson = new Gson();
        
        Patient.setUsers(gson.fromJson(firstLine, new ArrayList<Patient>().getClass()));
        
        } catch(IOException e) {
            System.out.println(e.getMessage());
        
        }    
        
         try{
        BufferedReader br = new BufferedReader(new FileReader("Doctors.txt"));
              
        String firstLine = br.readLine();
        
        Gson gson = new Gson();
        
        ArrayList<Doctor> doctors = gson.fromJson(firstLine, new ArrayList<Doctor>().getClass());
        
        Doctor.setDoctors(doctors);
        
        } catch(IOException e) {
            System.out.println(e.getMessage());

        
        }    
                
         try{
        BufferedReader br = new BufferedReader(new FileReader("Admins.txt"));
              
        String firstLine = br.readLine();
        
        Gson gson = new Gson();
        
        Admin.setAdmins(gson.fromJson(firstLine, new ArrayList<Admin>().getClass()));
        
        } catch(IOException e) {
                       System.out.println(e.getMessage());

        
        }    
                        
         try{
        BufferedReader br = new BufferedReader(new FileReader("Secretarys.txt"));
              
        String firstLine = br.readLine();
        
        Gson gson = new Gson();
        
        Secretary.setSecretaries(gson.fromJson(firstLine, new ArrayList<Secretary>().getClass()));
        
        } catch(IOException e) {
        
                    System.out.println(e.getMessage());

        }    
    
    }
    
    
    
    
    
}
