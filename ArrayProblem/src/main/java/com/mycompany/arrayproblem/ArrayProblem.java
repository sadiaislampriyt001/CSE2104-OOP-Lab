
package com.mycompany.arrayproblem;

/**
 *
 * @author Lenovo
 */
public class ArrayProblem {
    
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num: arr){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = calculateSum(arr);
        System.out.println("Sum of numbers in the array: "+sum);
    }
}
