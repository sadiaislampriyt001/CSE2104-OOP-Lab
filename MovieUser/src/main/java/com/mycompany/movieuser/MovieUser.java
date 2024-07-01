
package com.mycompany.movieuser;
import java.util.Scanner;
public class MovieUser {
    private static int totalMovies = 0;
      
     private String title;
     private String director;
     private int year;
     
     public MovieUser(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
        totalMovies++;
        
     }
     
     public void displayMovieDetails() 
     {
        System.out.println("Title: " +title);
        System.out.println("Director: " +director);
        System.out.println("Year: " +year);
    }
     
     public static int getTotalMovies() {
        return totalMovies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The first movie details");
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Director: ");
        String director1 = scanner.nextLine();
        System.out.print("Year: ");
        int year1 = scanner.nextInt();
        scanner.nextLine();
        
        
        System.out.println("The second movie details");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Director: ");
        String director2 = scanner.nextLine();
        System.out.print("Year: ");
        int year2 = scanner.nextInt();
        scanner.nextLine();
        
         MovieUser movie1 = new MovieUser(title1, director1, year1);
         MovieUser movie2 = new MovieUser(title2, director2, year2);
         
        System.out.println("\nMovie 1 Details:");
        movie1.displayMovieDetails();
        
        System.out.println("\nMovie 2 Details:");
        movie2.displayMovieDetails();
        
        System.out.println("Total number of movies: " + MovieUser.getTotalMovies());
        
        
    }
}
