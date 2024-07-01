
package com.mycompany.studentt;

public class Studentt {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    
    private static String university="ULAB";
    private static int studentcount=0;
    
     public Studentt(int id, String name, String department, double cgpa)
    {
        
        this.id=id;
        this.name=name;
        this.department=department;
        this.cgpa=cgpa;
        studentcount++;
    }
     
      public void displayStudenttDetails()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("CGPA: "+cgpa);
        System.out.println("University: "+university);
        
    }
      public static void displayStudenttotal(){
        System.out.println("Total number of students: "+studentcount);
      }
      
     
    public static void main(String[] args) 
    {
       Studentt student1=new Studentt(223014167, "Rina","CSE",3.40);
       Studentt student2=new Studentt(223014099, "Prity","CSE",3.51);
       Studentt student3=new Studentt(223014167, "Abir","CSE",3.93);
        
       
       student1.displayStudenttDetails();
       student2.displayStudenttDetails();
       student3.displayStudenttDetails();
       
       Studentt.displayStudenttotal();
    }
}
