
package com.mycompany.doctor1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;

public class Doctor1 implements Serializable{
private String name;
    private String specialization;

    // Constructor
    public Doctor1(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    public void displayDoctor1Info(){
        System.out.println("Doctor Information: ");
        System.out.println("Name: "+this.name);
        System.out.println("Specialization: "+this.specialization);
    }
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Display availability (for simplicity, I included it here, can be overridden in subclasses)
    public void displayAvailability() {
        System.out.println("Doctor " + name + " (" + specialization + ") is available.");
    }
    
    
    
    public static void main(String[] args) {
       Doctor1 doctor1 = new Doctor1("Dr. Smith", "Cardiologist");
       Doctor1 doctor2 = new Doctor1("Dr.Ahona","Anesthesiology.");
       
       doctor1.displayDoctor1Info();
       doctor2.displayDoctor1Info();
       
       System.out.println();
       
       Patient Patient1 = new Patient("Tina", "23513",34,"Common cold");
       Patient Patient2 = new Patient("Lina", "67513",25,"Influenza");
       Patient Patient3 = new Patient("Tamim", "67513",40,"Chickenpox");
       Patient Patient4 = new Patient("mina", "67513",55,"Measles");
       
       Patient1.displayPatient1Info();
       Patient2.displayPatient1Info();
       Patient3.displayPatient1Info();
       Patient4.displayPatient1Info();
       
       System.out.println();
       
        Appointment appointment1 = new Appointment(doctor1, Patient2, "2024-09-15");
        Appointment appointment2 = new Appointment(doctor2, Patient1, "2024-09-16");
        Appointment appointment3 = new Appointment(doctor1, Patient4, "2024-09-17");
        Appointment appointment4 = new Appointment(doctor2, Patient3, "2024-09-18");
        
        appointment1.saveToFile();
        appointment2.saveToFile();
        appointment3.saveToFile();
        appointment4.saveToFile();
        
       
         System.out.println();
         
         
}
   
    
}



    
    

