
package com.mycompany.palindrome;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (isPalindrome(number)) 
        {
            System.out.println(" The number is a palindrome.");
        } 
        else {
            System.out.println( " The number is not a palindrome.");
        }
        input.close();
    }
      public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
             number /= 10;
        }


        return originalNumber == reverseNumber;
      }

}      
       