/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.FactoryMethod;

/**
 *
 * @author Omar Fayed
 */
public class Breakfast implements Meal{

    public Breakfast() {
    }
    
    @Override
    public void prepare() {
        System.out.println("Breakfast prepared!");
    }
}
