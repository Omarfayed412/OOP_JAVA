/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.FactoryMethod;

/**
 *
 * @author Omar Fayed
 */

//Concrete creator that returns product of type breakfast of base Meal
public class BreakfastCreator implements IMealCreator{
    public BreakfastCreator() {
    }
    
    @Override
    public Meal makeMeal() {
        return new Breakfast();
    }
}
