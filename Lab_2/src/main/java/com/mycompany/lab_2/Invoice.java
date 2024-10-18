/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_2;

/**
 *
 * @author Omar Fayed
 */
public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double[] prices;
    
    //Constructor 
    public Invoice(int invoiceNumber, String customerName, double[] prices) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.prices = prices;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public double calculateInvoice() {
        double totalCost = 0;
        for (double i : prices) totalCost += i;
        //Discount rates
        if (totalCost >= 1000) totalCost -= (totalCost * 1/100);
        else if (totalCost >= 5000) totalCost -= (totalCost * 4/100);
        else if (totalCost >= 8000) totalCost -= (totalCost * 6/100);
        else if (totalCost >= 10000) totalCost -= (totalCost * 8/100);
        
        return totalCost;
    }
    
    public void report() {
        System.out.println("Account number: " + this.invoiceNumber);
        System.out.println("Name: " + this.customerName);
        System.out.println("Total cost: " + this.calculateInvoice()
        );
        System.out.println("Account number: " + this.invoiceNumber);
        
    }
}
