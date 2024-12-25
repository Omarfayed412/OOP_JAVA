/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralDP.Facade;

/**
 *
 * @author Omar Fayed
 */

//Complex subsystem
public class DVD implements Device{
    private String state = "Off";

    public DVD() {
    }

    @Override
    public void turnOn() {
        this.state = "On";
        System.out.println("DVD turned on!");
    }

    @Override
    public void turnOff() {
        this.state = "Off";
        System.out.println("DVD turned off!");
    }
 }
