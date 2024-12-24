/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralDP.Composite;

/**
 *
 * @author Omar Fayed
 */
public class Client {
    public static void main(String[] args) {
        EmployeeLeaf e1 = new EmployeeLeaf("Nice1");
        EmployeeLeaf e2 = new EmployeeLeaf("Nice2");
        EmployeeLeaf e3 = new EmployeeLeaf("Nice3");
        EmployeeLeaf e4 = new EmployeeLeaf("Nice4");
        EmployeeLeaf e5 = new EmployeeLeaf("Nice5");
        
        ManagerComposite m1 = new ManagerComposite("Mice1");
        ManagerComposite m2 = new ManagerComposite("Mice2");
        ManagerComposite m3 = new ManagerComposite("Mice3");
        ManagerComposite m4 = new ManagerComposite("Mice4");
        
        m1.add(e1);
        m1.add(e2);
        m2.add(m1);
        m2.add(m4);
        m4.add(e3);
        m4.add(e4);
        m2.add(e5);
        
        m3.add(m2);
        
        m3.display();
    }
}
