/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carr;

/**
 *
 * @author Lenovo
 */
public class Carr {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    
    public Carr(String make,String model,int year,String color,double salary){
        this.make= make;
        this.model= model;
        this.year= year;
        this.color= color;
        this.price= price;
    
    
   
    }
    
    public Carr(String make,String model,int year){
            
          this(make, model, year, "Unknown", 0.0);
}
    
     public void displayCarrInfo(){
        System.out.println("Car Information: ");
        System.out.println("Make: "+this.make);
        System.out.println("Model: "+this.model);
        System.out.println("Year: "+this.year);
        System.out.println("Color: "+this.color);
        System.out.println("Price: $"+this.price);
}
      public void changeCar(String color){
          this.color = color;
}

   public void changeCar(String color, double price){
     this.color = color;
     this.price = price;
}


    public static void main(String[] args) {
        Carr car1 = new Carr("Toyota","Camry",2022,"Red",25000);
        Carr car2 = new Carr("Honda","Accord",2021);
        
        car1.displayCarrInfo();
        car2.displayCarrInfo();
        
        System.out.println();
        
        car1.changeCar("Yellow");
        car2.changeCar("Blue", 30000);
        
        car1.displayCarrInfo();
        car2.displayCarrInfo();
        
    }
}
