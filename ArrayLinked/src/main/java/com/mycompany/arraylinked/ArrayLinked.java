/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylinked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinked {

    public static void main(String[] args) {
        
        List<Integer>arrayList = new ArrayList<>(); 
        arrayList.add(5); 
        arrayList.add(10); 
        arrayList.add(3); 
        arrayList.add(1); 
        arrayList.add(6); 
        System.out.println("ArrayList elements: " + arrayList); 
        System.out.println("ArrayList size: " + arrayList.size()); 
        System.out.println(); 
        System.out.println("Element at index 2: " + arrayList.get(2)); 
        System.out.println(); arrayList.set(1, 10); 
        System.out.println("ArrayList after setting element at index 1 to 10: " + arrayList); 
        System.out.println(); 
        arrayList.remove(3); 
        System.out.println("ArrayList after removing element at index 3: " + arrayList); 
        System.out.println(); 
        Collections.sort(arrayList); 
        
        System.out.println("ArrayList after sorting: " + arrayList);
        System.out.println();
        
        List<Integer>linkedList = new LinkedList<>(); 
        linkedList.add(15);
        linkedList.add(20); 
        linkedList.add(17); 
        linkedList.add(11); 
        linkedList.add(16); 
        System.out.println("LinkedList elements: " + linkedList); 
        System.out.println("LinkedList size: " + linkedList.size()); 
        System.out.println(); 
        System.out.println("Element at index 2: " + linkedList.get(2)); 
        System.out.println(); linkedList.set(1, 20); 
        System.out.println("LinkedList after setting element at index 1 to 20: " + linkedList); 
        System.out.println(); linkedList.remove(3); 
        System.out.println("LinkedList after removing element at index 3: " + linkedList); 
        System.out.println(); 
        Collections.sort(linkedList); 
        
        System.out.println("LinkedList after sorting: " + linkedList); 
        System.out.println(); 



        
    }
}
