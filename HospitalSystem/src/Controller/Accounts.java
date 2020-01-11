/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simon Yates
 */
public class Accounts {
    
    private String ID;
    private String firstName;
    private String surname;
    private String password;
    private String gender;
    private int age;
    
    public Accounts(String ID, String firstName, String surname, String password,
             String gender, Integer Age){
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.gender = gender;
        this.age = age;
        
    }

    private Accounts(String d0003, String octo, String puss, String spiderman) {
        //To change body of generated methods, choose Tools | Templates.
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;

    }

     @Override
    public String toString() {
        return "{" +
                "ID='" + ID + '\'' +
                ", FirstName=" + firstName + '\'' +
                ", Surname=" + surname + '\'' +
                ", Password=" + password + '\'' +             
                ", Gender=" + gender + '\'' +
                ", Age=" + age +
                '}';
    }

   

    public class ArrayListPatient {
    public  void main(String[] args) {
        List<Accounts> users = new ArrayList<>();
        users.add(new Accounts("P0001", "David", "Atticborrow", "Cake", "Male", 31));
        users.add(new Accounts("P0002", "Oliver", "Twist", "PleaseSir", "Male", 51));
        users.add(new Accounts("P0003", "Tommy", "Gunn", "Shooter", "Male", 31));

        users.add(new Accounts("S0001", "Sharon", "Osbourne", "Singer"));
        users.add(new Accounts("S0002", "Peter", "Pan", "Tinkerbell"));

        users.add(new Accounts("D0001", "Egg", "Man", "Sonic"));
        users.add(new Accounts("D0002", "Octo", "Puss", "Spiderman"));

        users.add(new Accounts("A0001", "God", "Man", "Jesus"));
        users.add(new Accounts("A0002", "Kate", "Simple", "Simplekate"));

        System.out.println("Person List : " + users);
    }
    }

}
