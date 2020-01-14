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
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
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
        Type listType = new TypeToken<ArrayList<Patient>>(){}.getType();
        Patient.setUsers(gson.fromJson(firstLine, listType));
        
        } catch(IOException e) {
            System.out.println(e.getMessage());
        
        }    
        
         try{
        BufferedReader br = new BufferedReader(new FileReader("Doctors.txt"));
              
        String firstLine = br.readLine();
        
        Gson gson = new Gson();
        
        Type listType = new TypeToken<ArrayList<Doctor>>(){}.getType();
        ArrayList<Doctor> doctors = gson.fromJson(firstLine, listType);
        
        Doctor.setDoctors(doctors);
        
        } catch(IOException e) {
            System.out.println(e.getMessage());

        
        }    
                
         try{
        BufferedReader br = new BufferedReader(new FileReader("Admins.txt"));
              
        String firstLine = br.readLine();
        
        Gson gson = new Gson();
        
        Type listType = new TypeToken<ArrayList<Admin>>(){}.getType();
        Admin.setAdmins(gson.fromJson(firstLine, listType));
        
        } catch(IOException e) {
                       System.out.println(e.getMessage());

        
        }    
                        
         try{
        BufferedReader br = new BufferedReader(new FileReader("Secretarys.txt"));
              
        String firstLine = br.readLine();
        
        Gson gson = new Gson();
        
        Type listType = new TypeToken<ArrayList<Secretary>>(){}.getType();
        Secretary.setSecretaries(gson.fromJson(firstLine, listType));
        
        } catch(IOException e) {
        
                    System.out.println(e.getMessage());

        }    
    
    }
    
    
    
    
    
}
