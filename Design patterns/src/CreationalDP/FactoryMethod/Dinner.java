/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.FactoryMethod;

/**
 *
 * @author Omar Fayed
 */
public class Dinner implements Meal{

    public Dinner() {
    }

    @Override
    public void prepare() {
        System.out.println("Dinner Prepared");
    }    
}
