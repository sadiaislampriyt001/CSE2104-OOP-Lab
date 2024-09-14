/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personn;

/**
 *
 * @author Lenovo
 */
public class Personn {
    private String name;
    private int age;
    private String gender;
    private String address;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge (int age){
        this.age= age;
    }
    
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
     public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public static void main(String[] args) {
        
        Personn person1 = new Personn();
        
        person1.setName("Tina");
        person1.setAge(21);
        person1.setGender("Female");
        person1.setAddress("Dhaka");
        
        Personn person2 = new Personn();
        
        person2.setName("Lina");
        person2.setAge(25);
        person2.setGender("Female");
        person2.setAddress("Barishal");
        
        Personn person3 = new Personn();
        
        person3.setName("Tamim");
        person3.setAge(30);
        person3.setGender("Male");
        person3.setAddress("Khulna");
        
        System.out.println("Person 1:");
        System.out.println("Name: "+person1.getName());
        System.out.println("Age: "+person1.getAge());
        System.out.println("Gender: "+person1.getGender());
        System.out.println("Address: "+person1.getAddress());
        System.out.println();
        
        System.out.println("Person 2:");
        System.out.println("Name: "+person2.getName());
        System.out.println("Age: "+person2.getAge());
        System.out.println("Gender: "+person2.getGender());
        System.out.println("Address: "+person2.getAddress());
        System.out.println();
        
        System.out.println("Person 3:");
        System.out.println("Name: "+person3.getName());
        System.out.println("Age: "+person3.getAge());
        System.out.println("Gender: "+person3.getGender());
        System.out.println("Address: "+person3.getAddress());
        System.out.println();
    }
}
