/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_2;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.w3c.dom.css.Counter;

/**
 *
 * @author Omar Fayed
 */
public class Lab2_p4 {
    public static void main(String[] args) {
        System.out.print("Enter the file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        readInvoiceDetailsFromFile(fileName);
        
    }
    
    public static Invoice[] readInvoiceDetailsFromFile(String fileName) {
        int countInvoices = 0;
        int counter = 0;
        String[] line;
        try{
            File directory = new File(fileName);
            Scanner myFileReader = new Scanner(directory);
            while (myFileReader.hasNextLine()) {
                if (counter == 0) 
                    countInvoices = myFileReader.nextInt();
                else {
                    //accountnumber, owner, number of products, products
                    line = myFileReader.nextLine().split(",");
                    for(String i:line) System.out.print(i);
                    System.out.println(" ");
                }
                counter++;
            }
            myFileReader.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return null;
    }
}
