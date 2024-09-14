/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carrr;

/**
 *
 * @author Lenovo
 */
public class Carrr {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear (int year){
        this.year= year;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    

    public static void main(String[] args) {
        
        Carrr car1 = new Carrr();
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setYear(2022);
        car1.setColor("Silver");
        car1.setPrice(25000.00);
        
        Carrr car2 = new Carrr();
        
        car2.setMake("Honda");
        car2.setModel("Accord");
        car2.setYear(2021);
        car2.setColor("Red");
        car2.setPrice(28000.00);
        
        Carrr car3 = new Carrr();
        
        car3.setMake("Ford");
        car3.setModel("Mustang");
        car3.setYear(2023);
        car3.setColor("Blue");
        car3.setPrice(35000.00);
        
        System.out.println("Car 1:");
        System.out.println("Make: "+car1.getMake());
        System.out.println("Model: "+car1.getModel());
        System.out.println("Year: "+car1.getYear());
        System.out.println("Color: "+car1.getColor());
        System.out.println("Price: "+car1.getPrice());
        System.out.println();
        
        System.out.println("Car 2:");
        System.out.println("Make: "+car2.getMake());
        System.out.println("Model: "+car2.getModel());
        System.out.println("Year: "+car2.getYear());
        System.out.println("Color: "+car2.getColor());
        System.out.println("Price: "+car2.getPrice());
        System.out.println();
        
        System.out.println("Car 3:");
        System.out.println("Make: "+car3.getMake());
        System.out.println("Model: "+car3.getModel());
        System.out.println("Year: "+car3.getYear());
        System.out.println("Color: "+car3.getColor());
        System.out.println("Price: "+car3.getPrice());
        System.out.println();
        
        
        
        
    }
}
