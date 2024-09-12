/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doctor1;

/**
 *
 * @author Lenovo
 */
public class Specialist {
     public Specialist(String name, boolean isAvailable) {
        super(name, "Specialist", isAvailable);
    }

  
    public void displayAvailability() {
        if (isAvailable()) {
            System.out.println(getName() + " (Specialist) is available for appointments.");
        } else {
            System.out.println(getName() + " (Specialist) requires appointment confirmation.");
        }
    }
}
    

