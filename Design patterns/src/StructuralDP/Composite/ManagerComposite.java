/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralDP.Composite;

import java.util.ArrayList;

/**
 *
 * @author Omar Fayed
 */
public class ManagerComposite implements PersonComponent{
    private ArrayList<PersonComponent> employees;
    private String name;

    public ManagerComposite(String name) {
        this.employees = new ArrayList();
        this.name = name;
    }

    public void add(PersonComponent p) {
        this.employees.add(p);
    }
    
    public void remove(PersonComponent p) {
        this.employees.remove(p);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void display() {
        System.out.println("Manager: " + this.name + " List: ");
        try { 
            for(PersonComponent i : employees) {
                i.display();
            }
        } catch(NullPointerException e) {
            System.out.println("Error: empty list");
        }
    }
}
