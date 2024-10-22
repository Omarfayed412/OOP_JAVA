/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Omar Fayed
 */
public abstract class Building {
    private String address;
    private int numberOfFloors;
    private double totalArea;

    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    //Abstract method to be used by the children classes
    public double calcRent() {
        return 1;
    }
    
    public void printInfo() {
        System.out.println("Address: " + this.getAddress());
        System.out.println("Number of Floors: " + this.getNumberOfFloors());
        System.out.println("Total Area: " + this.getTotalArea());
    }
}
