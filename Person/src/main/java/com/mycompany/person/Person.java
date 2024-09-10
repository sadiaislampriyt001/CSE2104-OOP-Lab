/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author Lenovo
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
   
    public Person(String name,int age,String gender,String address){
        this.name= name;
        this.age= age;
        this.gender= gender;
        this.address= address;
    }
     public Person(String name,int age){
            
          this(name, age, "Unknown", "Unknown");
}
    
    
    public void displayPersonInfo(){
        System.out.println("Person Information: ");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Gender: "+this.gender);
        System.out.println("Address: "+this.address);
    }
    
     public void changePerson(String gender){
          this.gender = gender;
}

   public void changePerson(String gender, String address){
     this.gender = gender;
     this.address = address;
}

    public static void main(String[] args) {
        Person person1 = new Person("Tina",20,"Female","Dhaka");
        Person person2 = new Person("Hasan",31);
        
        person1.displayPersonInfo();
        person2.displayPersonInfo();
        
        System.out.println();
        
        person1.changePerson("ghazipur");
        person2.changePerson("male","colima" );
        
        person1.displayPersonInfo();
        person2.displayPersonInfo();
    }
}
 