package com.mycompany.employee2;

public class Employee2 {
    private String name;
    private int id;
    private double salary;
    private String designation;
    
    // Constructor with all fields
    public Employee2(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }
    
    // Constructor with default values
    public Employee2(String name, int id) {
        this(name, id, 0.0, "Unknown");
    }

    // Display employee information
    public void displayEmployee2Info() {
        System.out.println("Employee Information: ");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
    }

    // Method to change salary
    public void changeEmployee2(double salary) {
        this.salary = salary;
    }

    // Method to change salary and designation
    public void changeEmployee2(double salary, String designation) {
        this.salary = salary;
        this.designation = designation;
    }

    // Main method
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2("Tina", 223014090, 20000.0, "Manager");
        Employee2 employee2 = new Employee2("Hasan", 223014031);
        
        employee1.displayEmployee2Info();
        employee2.displayEmployee2Info();
        
        System.out.println();
        
        // Updating salary and designation
        employee1.changeEmployee2(3000.89);
        employee2.changeEmployee2(34000.0, "CEO");
        
        employee1.displayEmployee2Info();
        employee2.displayEmployee2Info();
    }
}
