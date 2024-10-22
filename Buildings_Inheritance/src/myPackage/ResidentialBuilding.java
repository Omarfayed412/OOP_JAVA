/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Omar Fayed
 */
public class ResidentialBuilding extends Building {
    private int numberOfApartment;
    private double rentPerApartment;
    
    public ResidentialBuilding (String address, int numberOfFloors, double totalArea, int numberOfApartment, double rentPerApartment) {
        //Calling the superclass building
        super(address, numberOfFloors, totalArea);
        this.numberOfApartment = numberOfApartment;
        this.rentPerApartment = rentPerApartment;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    public double getRentPerApartment() {
        return rentPerApartment;
    }
    
    //Used override to use the concept of run-time polymorphism 
    //and use same function with different implementations according to 
    //type of class
    @Override
    public double calcRent () {
        return this.numberOfApartment * this.rentPerApartment;
    }
    
    public void printInfoRes() {
        printInfo();
        System.out.println("Number of Apartments: " + this.getNumberOfApartment());
        System.out.println("Rent Per Apartment: " + this.getRentPerApartment());
        System.out.println("Total Rent: " + this.calcRent());
    }
}
