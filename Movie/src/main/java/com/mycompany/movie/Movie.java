/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

/**
 *
 * @author Lenovo
 */
public class Movie {
    String title;
    String genre;
    String leadactor;
    String director;
    int releaseYear;
    double rating;
    String review;
    
    public Movie(String title,String genre,String leadactor,String director,int releaseYear,double rating){
        this.title=title;
        this.genre=genre;
        this.leadactor=leadactor;
        this.director=director;
        this.releaseYear=releaseYear;
        this.rating=rating ;
        moviereview();
}

    public static void main(String[] args) {
        Movie A=new Movie("Inception","Sci-Fi","Leonardo DiCaprio","Christopher Nolan", 2010, 8.8);
        Movie B=new Movie("The Shawshank Redemption ","Drama","Tim Robbins","Frank Darabont",1994, 9.3);
        
        System.out.println("Movie Information 1:");
        A.displaymovie();
        System.out.println("Movie Information 2:");
        B.displaymovie();
    }
    
    public void moviereview(){
          if(this.rating<5){
             this.review="Not Good";
}
else{
   this.review="Good";
}

}

public void displaymovie(){
System.out.println("Title: " + title);
System.out.println("Genre: " + genre);
System.out.println("Lead Actor: " + leadactor);
System.out.println("Director: " + director);
System.out.println("Release Year: "+ releaseYear);
System.out.println("Rating: "+ rating);
System.out.println("Review: " + review);
}
}
