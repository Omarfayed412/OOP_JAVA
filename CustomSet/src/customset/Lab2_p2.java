/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author 20112
 */
public class Lab2_p2 {
    public static void main(String[] args) {
                
        System.out.print("Enter the size of first Set: ");
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        System.out.print("Please enter the members of first set: ");
        Set<Integer> inputSet = new HashSet<Integer>();
        for (int i = 0; i < size1; i++) {
            s = new Scanner(System.in);
            inputSet.add(s.nextInt());
        }
        
        CustomSet set1 = new CustomSet(inputSet);
        
        
        System.out.print("Enter the size of Second Set: ");
        s = new Scanner(System.in);
        int size2 = s.nextInt();
        System.out.print("Please enter the members of Second set: ");
        Set<Integer> inputSet2 = new HashSet<Integer>();
        for (int i = 0; i < size2; i++) {
            s = new Scanner(System.in);
            inputSet2.add(s.nextInt());
        }
        CustomSet set2 = new CustomSet(inputSet2);  
        
        set1.display();
        set2.display();
        
        CustomSet unionSet = CustomSet.union(set1, set2);
        unionSet.display();
        
        System.out.print("The prime numbers in the union: ");
        
        for (int i : unionSet.getData()) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        
        
    }
    
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num/2; i++) {
            if ((num % i) == 0) return false;
        }
        return true;
    }
}
