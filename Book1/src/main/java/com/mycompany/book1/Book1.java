/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book1;
import java.util.Scanner;
public class Book1 {
     private String title;
    private String author;
    private int year;
    private static String genre="drama";
    private static int bookcount;
    
    public Book1(String title, String author, int year)
    {
        this.title=title;
        this.author=author;
        this.year=year;
        bookcount++;
    }
    
    public void displaybookdetails()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
    }
    public static void displayTotalBooks() {
        
        System.out.println("Total number of books: " + bookcount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The first book details");
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Year: ");
        int year1 = scanner.nextInt();
        scanner.nextLine();
        
        
        System.out.println("The second book details");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Year: ");
        int year2 = scanner.nextInt();
        scanner.nextLine();
        
        
        System.out.println("The third book details");
        System.out.print("Title: ");
        String title3 = scanner.nextLine();
        System.out.print("Author: ");
        String author3 = scanner.nextLine();
        System.out.print("Year: ");
        int year3 = scanner.nextInt();
        scanner.nextLine();
        
         Book1 b1 = new Book1(title1, author1, year1);
         Book1 b2 = new Book1(title2, author2, year2);
         Book1 b3 = new Book1(title3, author3, year3);
         
        System.out.println("\nBook 1 Details:");
        b1.displaybookdetails();
        
        System.out.println("\nBook 2 Details:");
        b2.displaybookdetails();
        
        System.out.println("\nBook 3 Details:");
        b3.displaybookdetails();
        
       Book1.displayTotalBooks();
        
        
        
    }
}
