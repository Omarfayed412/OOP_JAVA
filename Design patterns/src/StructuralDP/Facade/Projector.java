/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralDP.Facade;

/**
 *
 * @author Omar Fayed
 */

//Complex Subsystem
public class Projector implements Device{
    private String state = "Off";
    
    public Projector() {
    }
    
    @Override
    public void turnOn() {
        this.state = "On";
        System.out.println("Projector turned on!");
    }

    @Override
    public void turnOff() {
        this.state = "Off";
        System.out.println("Projector turned off!");
    }
}
