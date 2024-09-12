/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doctor1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class Appointment {
    private Doctor1 doctor;
    private Patient patient;
    private String date;
    
    public Appointment(Doctor1 doctor, Patient patient, String date) 
    {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }
    
    public Doctor1 getDoctor() 
    {
        return doctor;
    }
    public void setDoctor(Doctor1 doctor) {
        this.doctor = doctor;
    }
    
     public Patient getPatient()
    {
        return patient;
    }
     public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() 
    {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void displayAppointment1Info(){
        System.out.println("Appointntment Information: ");
        System.out.println("Doctor: "+this.doctor);
        System.out.println("Patient: "+this.patient);
        System.out.println("Date: "+this.date);
        
    }
     public void saveToFile() 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("appointments.txt", true))) {
            writer.write("Doctor: " + doctor.getName() + ", Specialization: " + doctor.getSpecialization() +
                    ", Patient: " + patient.getName() + ", Date: " + date);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
