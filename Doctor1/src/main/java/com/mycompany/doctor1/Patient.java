/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doctor1;

/**
 *
 * @author Lenovo
 */
public class Patient {
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
    public void displayPatient1Info(){
        System.out.println("Patien Information: ");
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Age: "+this.age);
        System.out.println("ProblemName: "+this.problemName);
    }
public String getName() 
    {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getId() 
    {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getProblemName() 
    {
        return problemName;
    }
    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }
        
    

  
    
}
