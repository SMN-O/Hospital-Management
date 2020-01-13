/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simon Yates
 */
public class Patient {
    
    public static List<Patient> users = new ArrayList<>();

   
    
    private String ID;
    private String firstName;
    private String surname;
    private String password;
    private String gender;
    private int age;
    
    public Patient(String ID, String firstName, String surname, String password,
             String gender, Integer Age){
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.gender = gender;
        this.age = age;
        
        
    }
    

    public Patient(String d0003, String octo, String puss, String spiderman) {
        //To change body of generated methods, choose Tools | Templates.
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;

    }

    public static List<Patient> getUsers() {
        return users;
    }

    public static void setUsers(List<Patient> users) {
        Patient.users = users;
    }

    public Patient() {

    }

   

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

   

   


}
