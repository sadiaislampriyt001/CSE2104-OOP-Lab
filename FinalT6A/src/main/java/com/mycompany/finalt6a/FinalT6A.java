/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalt6a;

/**
 *
 * @author Lenovo
 */
public class FinalT6A {

    public static void main(String[] args) {
        FinalT6A q1 = new FinalT6A(2, 1);
q1.methodA();
q1.display();
FinalT6A q2 = new FinalT6A(3, 5);
q2.methodA();
q2.display();
q1 = new FinalT6A(5, 7);
q1.methodA();
q1.display();
q2.methodA();
q2.display();
}
}
class FinalT6A {
private int a;
private int b;
public FinalT6A(int a, int b) {
this.a = a;
this.b = b;
}
public void methodA() {
a = a * 2;
b = b * 2;
}
public void display() {
System.out.println("a: " + a + ", b: " + b);
}

}
    }
}
