/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralDP.Composite;

/**
 *
 * @author Omar Fayed
 */

public class EmployeeLeaf implements PersonComponent{
    private String name;
    
    public EmployeeLeaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void display() {
        System.out.println("Employee: " + this.name);
    }
    
}
