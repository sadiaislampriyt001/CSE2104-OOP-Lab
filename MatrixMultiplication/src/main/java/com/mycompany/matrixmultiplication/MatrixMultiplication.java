package com.mycompany.matrixmultiplication;

public class MatrixMultiplication {

    public static void main(String[] args) {
       int[][] matrix1 = {{3,4,5}, {6,7,8}};
       int[][] matrix2 = {{11,12}, {9,10}, {11,12}};
       
       int[][] result = multiplyMatrices(matrix1,matrix2);
       System.out.println("Matrix 1:");
       printMatrix(matrix1);
       
       System.out.println("Matrix 2:");
       printMatrix(matrix2);
       
       System.out.println("Result:");
       printMatrix(result);
    }
    
public static int[][] multiplyMatrices(int[][]matrix1,int[][]matrix2) {

    int rowsInMatrix1 = matrix1.length;
    int colsInMatrix1 = matrix1[0].length;
    int rowsInMatrix2 = matrix2.length;
    int colsInMatrix2 = matrix2[0].length;
    if (colsInMatrix1!= rowsInMatrix2) {
        
        System.out.println("Matrices cannot be multiplied");
        return null;
}
   int[][]result = new int[rowsInMatrix1][colsInMatrix2];
        for (int i = 0; i < rowsInMatrix1; i++) {
            
            for (int j = 0; j < colsInMatrix2; j++) {
                
                for (int k = 0; k < colsInMatrix1; k++) {
                    
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
}
 
public static void printMatrix(int[][] matrix) {
    
    for (int i = 0; i < matrix.length; i++) {
        
        for (int j = 0; j < matrix[0].length; j++) {
            
            System.out.print(matrix[i][j] + " ");
        }
        
        System.out.println();
    }
}
    }

