/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.FactoryMethod;

/**
 *
 * @author Omar Fayed
 */
public class Lunch implements Meal{

    public Lunch() {
    }

    @Override
    public void prepare() {
        System.out.println("Lunch Prepared!");
    }
}
