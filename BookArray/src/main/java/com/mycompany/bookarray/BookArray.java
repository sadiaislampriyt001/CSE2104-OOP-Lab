/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookarray;

/**
 *
 * @author Lenovo
 */
public class BookArray {
    private String title; 
    private String author; 
    private int year; 
    private String genre;
    public BookArray(String title, String author, int year, String genre){ 
        this.title = title; 
        this.author = author; 
        this.year = year; 
        this.genre = genre; 
    } 
    
    public void displayDetails() { 
        System.out.println("Title: " + title); 
        System.out.println("Author: " + author); 
        System.out.println("Year: " + year); 
        System.out.println("Genre: " + genre); 
        System.out.println(); 
    }


    public static void main(String[] args) {
        BookArray[] books = new BookArray[3]; 
        books[0] = new BookArray("tumi AMAR", "SAMIR", 2022, "ROMENTIC");
        books[1] = new BookArray("Data Structures", "Jane Smith", 2018, "Computer Science"); 
        books[2] = new BookArray("Introduction to Algorithms", "David Johnson", 2019, "Computer Science"); 
        System.out.println("Books before removal:"); 
        
        for(BookArray book : books){
            book.displayDetails(); 
        } 
        
        books[1] = null; 
        System.out.println("Books after removal:"); 
        
        for(BookArray book : books){ 
            if (book != null) { 

                book.displayDetails(); 
            } 
        } 


    }
}
