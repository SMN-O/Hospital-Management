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
public class Admin {
    
        public static List<Admin> admins = new ArrayList<>();
    private String ID;
    private String firstName;
    private String surname;
    private String password;

    public Admin() {
    }
    
    
    
    
    public Admin(String ID, String firstName, String surname, String password){
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        }

    public static List<Admin> getAdmins() {
        return admins;
    }

    public static void setAdmins(List<Admin> admins) {
        Admin.admins = admins;
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
    
    
    
}
