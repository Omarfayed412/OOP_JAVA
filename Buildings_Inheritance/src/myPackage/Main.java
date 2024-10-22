/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

import java.util.Scanner;

/**
 *
 * @author Omar Fayed
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        char option;
        do { 
            System.out.print("Enter type of building (R->Residential, C->Commercial): ");
            option = scanner.next().charAt(0);
            if (option == 'r' || option == 'R') {
                
                ResidentialBuilding resB = new ResidentialBuilding("123 Main St", 5, 1500, 10, 1200);
                resB.printInfoRes();
                break;
            }
            else if (option == 'c' || option == 'C') {
                CommercialBuilding comB = new CommercialBuilding("456 Market St", 10, 5000, 4000, 25);
                comB.printInfoCom();
                break;
            }
            else {
                System.out.print("Error: Wrong input.");                
            }
        }while(true);
        
    }
}
