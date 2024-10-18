/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_2;

import java.util.Scanner;

/**
 *
 * @author Omar Fayed
 */


public class countPrimes {
    public static void main(String[] args){
        int number, prime_num = 1;
        do {
            System.out.print("You should enter a +ve integer number:");
            Scanner s = new Scanner(System.in); 
            number = s.nextInt();
        } while (number <= 0);
        
        boolean flag = false;
        
        while(prime_num <= number) {
          if (isPrime(prime_num)) {
             if (flag == false) 
                System.out.print("The prime numbers between 1 and " + number + ": ");
           
             System.out.print(prime_num + " ");
             flag = true;
          }  
          prime_num++;
        }
        
        if (flag == false) {
            System.out.println("There are no prime numbers between 1 and " + number);
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
