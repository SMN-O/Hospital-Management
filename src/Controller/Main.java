/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;


/**
 *
 * @author Simon Yates
 */
public class Main {
    

    public  void main(String[] args) {
        Account.users.add(new Account("P0001", "David", "Atticborrow", "Cake", "Male", 31));
        Account.users.add(new Account("P0002", "Oliver", "Twist", "PleaseSir", "Male", 51));
        Account.users.add(new Account("P0003", "Tommy", "Gunn", "Shooter", "Male", 31));

        Account.users.add(new Account("S0001", "Sharon", "Osbourne", "Singer"));
        Account.users.add(new Account("S0002", "Peter", "Pan", "Tinkerbell"));

        Account.users.add(new Account("D0001", "Egg", "Man", "Sonic"));
        Account.users.add(new Account("D0002", "Octo", "Puss", "Spiderman"));

        Account.users.add(new Account("A0001", "God", "Man", "Jesus"));
        Account.users.add(new Account("A0002", "Kate", "Simple", "Simplekate"));


    }
}
