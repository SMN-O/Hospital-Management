/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Simon Yates
 */
public class Doctors {
   
    public class Doctor {
        int id;
        String name;

        private Doctor( int a, String b) {
          this.id = a;
          this.name = b;
        }
    }

    Doctor[] myList = { 
        new Doctor( 1, "Dr Egg" ),
        new Doctor( 2, "Dr Slum" ),
    }; 
}
