/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.movie1;

/**
 *
 * @author Lenovo
 */
public class Movie1 {
    //Class variables
    private static int totalMovies =0;
    
    
    //Object variables
    private String title;
    private String director;
    private int year;
    
    
    //Parametarized constructor
    public Movie1(String title, String director, int year)
    {
        this.title= title;
        this.director= director;
        this.year=year;
        totalMovies++;
    }
    //Object methods
    public void displayMovieDetails()
    {
        System.out.println("Title: "+ title);
        System.out.println("Director: "+director);
        System.out.println("Year: "+year);
    }
    
//class method
    public static int getTotalMovies(){
        return totalMovies;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Movie1 movie1 =new Movie1(title:"The Shawshank Redemption", director:"Frank Darabont", year:1994);
        Movie1 movie2 =new Movie1(title:"Inception", director:"Christopher Nolan", year:2010);
        
        System.out.println("Movie 1 detaild:");
        movie1.displayMovieDetails();
        System.out.println();
        
         System.out.println("Movie 2 detaild:");
        movie2.displayMovieDetails();
        System.out.println();
        
        System.out.println("Total number of movies: "+Movie1.getTotalMovies());
    }
}
