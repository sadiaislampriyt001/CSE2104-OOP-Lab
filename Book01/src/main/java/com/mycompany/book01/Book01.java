
package com.mycompany.book01;

public class Book01 {
    private String title;
    private String author;
    private int year;
    private String genre;
   
    public Book01(String title, String author, int year,String genre){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }
   
    public void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
        System.out.println("Genre: "+genre);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Book01[] books =new Book01[3];
       
        books[0]= new Book01("Book 1", "Author 1", 2020, "Fiction");
        books[1]= new Book01("Book 2", "Author 2", 2018, "thriller");
        books[2]= new Book01("Book 3", "Author 3", 2015, "Mystery");
       
        System.out.println("Initial Book Details:");
        for(Book01 book: books){
            book. displayDetails();
        }
        books[1]=null;
       
        System.out.println("Book Details after removing an Object:");
        for(Book01 book: books){
            if(book !=null){
                 book. displayDetails();
            }
        }
    }
}
