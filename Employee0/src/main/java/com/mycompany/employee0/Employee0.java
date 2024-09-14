/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee0;

/**
 *
 * @author Lenovo
 */
public class Employee0 {
    private String name;
    private int id;
    private double salary;
    private String designation;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getID(){
        return id;
    }
    public void setID (int id){
        this.id= id;
    }
    
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }

    public static void main(String[] args) {
        
        Employee0 employee1 = new Employee0();
        employee1.setName("Adiba");
        employee1.setID(234);
        employee1.setSalary(21000.00);
        employee1.setDesignation("Software Engineer");
        
        Employee0 employee2 = new Employee0();
        employee2.setName("Abid");
        employee2.setID(257);
        employee2.setSalary(54000.00);
        employee2.setDesignation("Architecture Engineer");
        
        Employee0 employee3 = new Employee0();
        employee3.setName("Rabeya");
        employee3.setID(301);
        employee3.setSalary(27000.00);
        employee3.setDesignation("Civil Engineer");
        
        System.out.println("Employee 1:");
        System.out.println("Name: "+employee1.getName());
        System.out.println("Age: "+employee1.getID());
        System.out.println("Gender: "+employee1.getSalary());
        System.out.println("Address: "+employee1.getDesignation());
        System.out.println();
        
        System.out.println("Employee 2:");
        System.out.println("Name: "+employee2.getName());
        System.out.println("Age: "+employee2.getID());
        System.out.println("Gender: "+employee2.getSalary());
        System.out.println("Address: "+employee2.getDesignation());
        System.out.println();
        
        System.out.println("Employee 3:");
        System.out.println("Name: "+employee3.getName());
        System.out.println("Age: "+employee3.getID());
        System.out.println("Gender: "+employee3.getSalary());
        System.out.println("Address: "+employee3.getDesignation());
        System.out.println();
        
    }
}
