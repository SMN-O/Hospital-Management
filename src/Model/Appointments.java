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
public class Appointments {
        public static List<Appointments> schedule = new ArrayList<>();

   
    
    private int time;
    private String date;
    private String doctorID;
    private String patientID;

    public Appointments(int time, String date, String doctorID, String patientID) {
        this.time = time;
        this.date = date;
        this.doctorID = doctorID;
        this.patientID = patientID;
    }

    public static List<Appointments> getSchedule() {
        return schedule;
    }

    public static void setSchedule(List<Appointments> schedule) {
        Appointments.schedule = schedule;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
}
