/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Lenovo
 */
public class Student {
    int id;
    String name;
    String email;
    double cgpa;
    String hometown;
    
    void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Email :"+email);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Home Town: "+hometown);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=101;
        s1.name="Sakib";
        s1.email="sakib@gmail.com";
        s1.cgpa=3.55;
        s1.hometown="Dhaka";
        
        Student s2=new Student();
        s2.id=102;
        s2.name="Tamim";
        s2.email="tamim@gmail.com";
        s2.cgpa=3.45;
        s2.hometown="Khulna";
        
        s1.display();
        
        System.out.println("ID: "+s2.id);
        System.out.println("Name: "+s2.name);
        System.out.println("Email: "+s2.email);
        System.out.println("CGPA: "+s2.cgpa);
        System.out.println("Home Town: "+s2.hometown);
    }
}


