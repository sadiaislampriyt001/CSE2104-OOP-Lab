package com.mycompany.sorting;
import java.util.Scanner;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int i, j;
        for(i=0; i<n-1; i++) {
            for(j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int i, j;
        for(i=0; i<n-1; i++) {
            int min_idx = i;
            for (j=i+1; j<n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void mergeSort(int[] arr) {
        int i, j;
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];
            for(i=0; i<mid; i++) {
                left[i] = arr[i];
            }
            for (i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
    }
    
    public static void merge(int[] left, int[] right, int[] arr){
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                arr[k++] = left[i++];
            } 
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
    public static void printArray(int[] arr){
        int i;
        for(i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {77, 37, 27, 97, 17, 57, 47};
        
        System.out.println("Original array:");
        printArray(arr);
        
        int[] bubbleArr = arr.clone();
        bubbleSort(bubbleArr);
        System.out.println("Bubble sort:");
        printArray(bubbleArr);
        
        int[] selectionArr = arr.clone();
        selectionSort(selectionArr);
        System.out.println("Selection sort:");
        printArray(selectionArr);
        
        int[] mergeArr = arr.clone();
        mergeSort(mergeArr);
        System.out.println("Merge sort:");
        printArray(mergeArr);
    }
}


