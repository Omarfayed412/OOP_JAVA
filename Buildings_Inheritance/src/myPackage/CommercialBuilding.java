/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Omar Fayed
 */
public class CommercialBuilding extends Building{
    private double officeSpace;
    private double rentPerSquareMeter;
    
    //Subclass building 
    public CommercialBuilding (String address, int numberOfFloors, double totalArea, double officeSpace, double rentPerSquareMeter) {
        //Calling the superclass building
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    public double getOfficeSpace() {
        return officeSpace;
    }

    public double getRentPerSquareMeter() {
        return rentPerSquareMeter;
    }
    
    //Used override to use the concept of run-time polymorphism 
    //and use same function with different implementations according to 
    //type of class
    @Override
    public double calcRent () {
        return this.rentPerSquareMeter * this.officeSpace;
    }
    
    public void printInfoCom() {
        printInfo();
        System.out.println("Office Space: " + this.getOfficeSpace());
        System.out.println("Rent Per Square Meter: " + this.getRentPerSquareMeter());
        System.out.println("Total Rent: " + this.calcRent());
    }
}
