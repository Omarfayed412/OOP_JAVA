/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Omar Fayed
 */
public class Lab2_p2 {
    public static void main(String[] args) {
        CustomSet set1 = new CustomSet();
        CustomSet set2 = new CustomSet();
        int size1, size2;
        
        Set<Integer> set1_input = new HashSet<Integer>(); 
        Set<Integer> set2_input = new HashSet<Integer>(); 
        
        ////Set1
        System.out.print("Please enter the members of the size of first set: ");
        Scanner s = new Scanner(System.in);
        size1 = s.nextInt();
        
        System.out.print("Please enter the members of the first set: ");
        for (int i  = 0; i < size1; i++) {
        s = new Scanner(System.in);
        set1_input.add(s.nextInt());
        }
        set1.setSize(size1);
        set1.setData(set1_input);
        
        ////Set2
        System.out.print("Please enter the members of the size second set: "); 
        s = new Scanner(System.in);
        size2 = s.nextInt();
        
        System.out.print("Please enter the members of the second set: ");
        for (int i  = 0; i < size2; i++) {
        s = new Scanner(System.in);
        set2_input.add(s.nextInt());
        }
        set2.setSize(size1);
        set2.setData(set1_input);
        
        System.out.print("The union of two sets is [");
        CustomSet newSet = CustomSet.union(set1, set2);
        newSet.display();
        System.out.print("]");
        
        System.out.println(" ");
        System.out.print("The prime numbers that are members of the union: ");
        for (int  i: (newSet.getData())){
            if (isPrime(i)) 
                System.out.print(i + " ");   
        }
    }
    
    static boolean isPrime(int num) { //Static methods doesn't need a new instance to be called unlike public
        if (num <= 1) return false;
        
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) return false;
        }
        return true;
    }
}
