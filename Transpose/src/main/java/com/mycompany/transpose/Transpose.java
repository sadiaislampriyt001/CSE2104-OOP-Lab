/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transpose;

/**
 *
 * @author Lenovo
 */
public class Transpose {
    public static int[][] transposeMatrix(int[][] matrix){
        int rows = matrix.length;
        int colums = matrix[0].length;
       
        int[][] transposeMatrix = new int[colums][rows];
       
        for(int i= 0;i<rows;i++){
            for(int j = 0;j<colums;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void main(String[] args) {
         int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
       
        int[][] transposeMatrix = transposeMatrix(matrix);
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.println("\ntransposed Matrix: ");
        printMatrix(transposeMatrix);
    }
    public static void printMatrix(int[][] matrix){
        for(int[]row : matrix){
            for(int num : row){
                System.out.println(num+"");
            }
            System.out.println();
        }
    }
   
}
    

