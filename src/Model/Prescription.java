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
public class Prescription {
    
    public static List<Prescription> prescription = new ArrayList<>();

   
    
    private String dosage;
    private int quantity;
    private String medicine;

    public Prescription(String dosage, int quantity, String medicine) {
        this.dosage = dosage;
        this.quantity = quantity;
        this.medicine = medicine;
    }

    public static List<Prescription> getPrescription() {
        return prescription;
    }

    public static void setPrescription(List<Prescription> prescription) {
        Prescription.prescription = prescription;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
}
