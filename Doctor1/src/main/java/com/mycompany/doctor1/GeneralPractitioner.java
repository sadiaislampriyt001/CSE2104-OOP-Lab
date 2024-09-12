/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doctor1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneralPractitioner {
    private ArrayList<Doctor1> doctors;
    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;
    private DoctorsDetails doctorsDetails; // To manage and display doctors by department
    private Scanner scanner;
    

    // Constructor
    public Interface() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
        doctorsDetails = new DoctorsDetails(); // Initialize doctor details
        scanner = new Scanner(System.in);
    }

    // Display the main menu and handle user input
    public void displayMenu() {
        while (true) {
            System.out.println("\n=== Clinic Management System ===");
            System.out.println("1. Find Your Doctor");
            System.out.println("2. View Patient List by Doctor");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    findYourDoctor();
                    break;
                case 2:
                    viewPatientListByDoctor();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    return; // Exit the menu loop
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Find your doctor by department
    private void findYourDoctor() {
        System.out.println("\n--- Find Your Doctor ---");
        System.out.println("Choose a Department:");
        System.out.println("1. Medicine");
        System.out.println("2. Surgery");
        System.out.println("3. Pediatrics");
        System.out.println("4. Obstetrics and Gynecology");
        System.out.print("Enter your choice: ");

        int departmentChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String department = switch (departmentChoice) {
            case 1 -> "Medicine";
            case 2 -> "Surgery";
            case 3 -> "Pediatrics";
            case 4 -> "Obstetrics and Gynecology";
            default -> {
                System.out.println("Invalid choice. Returning to the main menu.");
                yield null;
            }
        };

        if (department != null) {
            doctorsDetails.displayDoctorsByDepartment(department);
            selectDoctor(department);
        }
    }

    // Select a doctor from the department and input patient details
    private void selectDoctor(String department) {
        ArrayList<Doctor> doctors = doctorsDetails.getDoctorsByDepartment(department);
        if (doctors.isEmpty()) return;

        System.out.print("Choose a Doctor by number: ");
        int doctorChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (doctorChoice < 1 || doctorChoice > doctors.size()) {
            System.out.println("Invalid doctor choice.");
            return;
        }

        Doctor selectedDoctor = doctors.get(doctorChoice - 1);
        System.out.println("Selected Doctor: " + selectedDoctor.getName());

        // Input patient details
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int patientAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Problem Title: ");
        String problemTitle = scanner.nextLine();

        // Create and save patient data to file
        savePatientDetails(selectedDoctor, patientName, patientAge, problemTitle);
    }

    // Save patient details to a text file
    private void savePatientDetails(Doctor doctor, String name, int age, String problemTitle) {
        String fileName = "PatientDetails.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("Patient Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Problem: " + problemTitle + "\n");
            writer.write("Doctor: " + doctor.getName() + " - " + doctor.getSpecialty() + "\n");
            writer.write("====================================\n");
            System.out.println("Patient details saved successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving patient details: " + e.getMessage());
        }
    
        // Add the patient to the patients list
        // Add the patient to the patients list
        Patient patient = new Patient(name, age, problemTitle, doctor);
        patients.add(patient);
        
    }

    // View patient list by doctor
    // View patient list by doctor
    public void viewPatientListByDoctor() {
        System.out.print("Enter Doctor's Name: ");
        String doctorName = scanner.nextLine();

        Doctor selectedDoctor = null;
        for (Doctor doctor : doctorsDetails.getDoctors()) { // Search from doctorsDetails
            if (doctor.getName().equals(doctorName)) {
                selectedDoctor = doctor;
                break;
            }
        }

        if (selectedDoctor == null) {
            System.out.println("Doctor not found.");
            return;
        }
        System.out.println("Patient List for Doctor " + selectedDoctor.getName() + ":");
        ArrayList<Patient> patients = getPatientsByDoctor(selectedDoctor);
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            System.out.println((i + 1) + ". Name: " + patient.getName() + ", Age: " + patient.getAge() + ", Problem: " + patient.getProblemTitle());
        }
    }
    // Get patients by doctor
    private ArrayList<Patient> getPatientsByDoctor(Doctor doctor) {
        ArrayList<Patient> patientsByDoctor = new ArrayList<>();
        for (Patient patient : this.patients) {
            if (patient.getDoctor().equals(doctor)) {
                patientsByDoctor.add(patient);
            }
        }
        return patientsByDoctor;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public DoctorsDetails getDoctorsDetails() {
        return doctorsDetails;
    }

    public void setDoctorsDetails(DoctorsDetails doctorsDetails) {
        this.doctorsDetails = doctorsDetails;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
    
    
}
