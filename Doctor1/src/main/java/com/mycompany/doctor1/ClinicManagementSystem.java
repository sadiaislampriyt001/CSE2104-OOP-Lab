/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.doctor1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ClinicManagementSystem {
    private static Scanner inputScanner = new Scanner(System.in);
    private static List<Doctor1> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();


    public static void main(String[] args) {
        registerDoctors();
        displayDoctorAvailability();
        inputScanner.close();
    }

    // Method to register doctors
    private static void registerDoctors() {
        System.out.println("Enter number of doctors to register:");
        int numDoctors = inputScanner.nextInt();
        inputScanner.nextLine(); // Consume newline

        for (int i = 0; i < numDoctors; i++) {
            System.out.println("Enter doctor's name:");
            String name = inputScanner.nextLine();

            System.out.println("Enter doctor's specialization:");
            String specialization = inputScanner.nextLine();

            doctors.add(new Doctor1(name, specialization));
        }
    }
    
     private static void registerPatients() 
    {
        System.out.println("Enter number of patients to register:");
        int numPatients = inputScanner.nextInt();
        inputScanner.nextLine(); 

        for (int i = 0; i < numPatients; i++) 
        {
            System.out.println("Enter patient's name:");
            String name = inputScanner.nextLine();
            System.out.println("Enter patient's ID:");
            String id = inputScanner.nextLine();
            patients.add(new Patient(name, id));
        }

    }

    // Method to display doctor availability
    private static void displayDoctorAvailability() {
        for (Doctor1 doctor : doctors) {
            doctor.displayAvailability();
        }
    }
    // Closes the scanner after input is done
  private static void bookAppointments() 
    {
        System.out.println("Enter number of appointments to book:");
        int numAppointments = inputScanner.nextInt();
        inputScanner.nextLine(); 

        for (int i = 0; i < numAppointments; i++) 
        {
            System.out.println("Enter patient's ID for the appointment:");
            String patientId = inputScanner.nextLine();
            Patient patient = findPatientById(patientId);

            if (patient == null) 
            {
                System.out.println("Patient not found.");
                continue;
            }

            System.out.println("Enter doctor's name for the appointment:");
            String doctorName = inputScanner.nextLine();
            Doctor1 doctor = findDoctorByName(doctorName);

            if (doctor == null) 
            {
                System.out.println("Doctor not found.");
                continue;
            }

            System.out.println("Enter appointment date (YYYY-MM-DD):");
            String date = inputScanner.nextLine();

            Appointment appointment = new Appointment(doctor, patient, date);
            appointment.saveToFile();
            System.out.println("Appointment booked successfully.");
        } 

    }
   private static Patient findPatientById(String id) 
    {
        for (Patient i : patients) 
        {
            if (i.getId().equals(id)) return i;
        }
        return null;
    }

    // Method to find a doctor by name
    private static Doctor1 findDoctorByName(String name) 
    {
        for (Doctor1 i : doctors) 
        {
            if (i.getName().equals(name)) 
            {
                return i;
            }
        }
        return null;
    }
}


 
