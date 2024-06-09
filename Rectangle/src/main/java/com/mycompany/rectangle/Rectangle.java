/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author Lenovo
 */
public class Rectangle {
    double length;
    double width;
    double area,perimeter;
    
public Rectangle(double length,double width){
    this.length=length;
    this.width=width;
}

    public static void main(String[] args) {
        Rectangle a=new Rectangle(500,250);
        a.calculate(500,250);
    }
    public void calculate(double length,double width){
      area =length*width;
        System.out.println("Area= "+area);
        perimeter=2*(length+width);
        System.out.println("Perimeter="+perimeter);
    }
}
