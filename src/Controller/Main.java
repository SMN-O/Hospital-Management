/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Doctor;
import Model.Patient;
import Model.Secretary;
import Model.Admin;


/**
 *
 * @author Simon Yates
 */
public class Main {
    

    public  void main(String[] args) {
        Patient.users.add(new Patient("P0001", "David", "Atticborrow", "Cake", "Male", 31));
        Patient.users.add(new Patient("P0002", "Oliver", "Twist", "PleaseSir", "Male", 51));
        Patient.users.add(new Patient("P0003", "Tommy", "Gunn", "Shooter", "Male", 31));

        Secretary.secretaries.add(new Secretary("S0001", "Sharon", "Osbourne", "Singer"));
        Secretary.secretaries.add(new Secretary("S0002", "Peter", "Pan", "Tinkerbell"));

        Doctor.doctors.add(new Doctor("D0001", "Egg", "Man", "Sonic"));
        Doctor.doctors.add(new Doctor("D0002", "Octo", "Puss", "Spiderman"));

        Admin.admins.add(new Admin("A0001", "God", "Man", "Jesus"));
        Admin.admins.add(new Admin("A0002", "Kate", "Simple", "Simplekate"));


    }
}
