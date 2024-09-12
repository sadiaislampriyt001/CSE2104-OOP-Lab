/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doctor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Doctor {

    private String name;
    private String specialization;

 

    public Doctor(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

 

    public String getName(){
        return name;
    }

 

    public String getSpecialization(){
        return specialization;
    }

 

    public void displayAvailability(){

        System.out.println("Doctor's availability");
    }
}

 
class GeneralPractitioner extends Doctor

{
    public GeneralPractitioner(String name){

        super(name, "General Practitioner");
    }

 

    @Override

    public void displayAvailability(){

        System.out.println("General Practitioner " + getName() + " is available for walk-in patients.");
    }
}


class Specialist extends Doctor{

    public Specialist(String name, String specialization){
        super(name, specialization);
    }

 

    @Override

    public void displayAvailability() {

        System.out.println("Specialist " + getName() + " (" + getSpecialization() + ") requires appointment confirmation.");

    }
}

class Patient {

    private String name;
    private String id;
    private int age;
    private String problemName;
    

    public Patient(String name, String id, int age, String problemName) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.problemName = problemName;

    }

    public String getName(){

        return name;
    }
    public String getId()

    {
        return id;

    }
    public int getAge()

    {
        return age;

    }
    public String getProblemName()

    {
        return problemName;

    }
}

class Appointment

{

    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date){
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public Patient getPatient(){
        return patient;
    }

 

    public String getDate(){
        return date;
    }

 
    public void saveToFile(){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("appointments.txt", true))){
            writer.write("Doctor: " + doctor.getName() + ", Specialization: " + doctor.getSpecialization() +
                    ", Patient: " + patient.getName() + ", Date: " + date);

            writer.newLine();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


public class ClinicManagementSystem

{

    private static Scanner inputScanner = new Scanner(System.in);
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();

 

    public static void main(String[] args)

    {
        registerDoctors();
        registerPatients();
        displayDoctorAvailability();
        bookAppointments();
        inputScanner.close();
    }

    private static void registerDoctors()

    {

        System.out.println("Doctors Register:");
        int numDoctor = inputScanner.nextInt();
        inputScanner.nextLine();

        for (int i = 0; i < numDoctor; i++)
        {
            System.out.println("Enter doctor's name:");
            String name = inputScanner.nextLine();
            System.out.println("Enter doctor's specialization (1.General Practitioner or 2.Specialist):");
            System.out.println("Type-1.General Practitioner");
            System.out.println("Type-2.Specialist");
            String specialization = inputScanner.nextLine();

 

            if (specialization.equalsIgnoreCase("2")){
                doctors.add(new GeneralPractitioner(name));
            }
            else
            {

                System.out.println("Enter specialist's field:");
                String field = inputScanner.nextLine();
                doctors.add(new Specialist(name, field));
            }
        }
    }

    private static void registerPatients(){

        System.out.println("Enter number of patients to register:");
        int numPatient = inputScanner.nextInt();
        inputScanner.nextLine();

 

        for (int i = 0; i < numPatient; i++){

            System.out.println("Enter patient's name:");
            String name = inputScanner.nextLine();
            System.out.println("Enter patient's ID:");
            String id = inputScanner.nextLine();
            System.out.println("Enter patient's ProblemName:");
            String problemName = inputScanner.nextLine();

            patients.add(new Patient(name, id, problemName));

        }
    }

    private static void displayDoctorAvailability(){

        for (Doctor i : doctors){

            i.displayAvailability();
        }
    }

    private static void bookAppointments(){

        System.out.println("Enter the number of appointments to book:");
        int numAppointments = inputScanner.nextInt();

        inputScanner.nextLine();

        for (int i = 0; i < numAppointments; i++){

            System.out.println("Enter the  ID of the patient's for appointment:");
            String patientId = inputScanner.nextLine();
            Patient patient = findPatientById(patientId);
            if (patient == null){
                System.out.println("Patient not found.");
                continue;
            }
            System.out.println("Enter doctor's name for  appointment:");
            String doctorName = inputScanner.nextLine();
            Doctor doctor = findDoctorByName(doctorName);
            if (doctor == null)
            {
                System.out.println("Doctor not found.");
                continue;
            }

            System.out.println("Enter appointment date (YYYY-MM-DD):");
            String date = inputScanner.nextLine();
            Appointment appointment = new Appointment(doctor, patient, date);
            appointment.saveToFile();
            System.out.println("Appointment is booked ");

        }

    }
    private static Patient findPatientById(String id){
        for (Patient i : patients){
            if (i.getId().equals(id)) return i;
        }
        return null;
    }
    
    private static Doctor findDoctorByName(String name){

        for (Doctor i : doctors){
            if (i.getName().equals(name))
            {
                return i;
            }
        }
        return null;
}
}
