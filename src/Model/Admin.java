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
    
    public Admin(String ID, String firstName, String surname, String password){
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        }
    
}
