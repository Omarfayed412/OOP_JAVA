/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.FactoryMethod;

/**
 *
 * @author Omar Fayed
 */
public class FactoryCompare{

    public FactoryCompare() {
    }

    public Meal makeMeal(String type) { 
        if (type.equalsIgnoreCase("Breakfast")) 
            return new Breakfast();
        else if (type.equalsIgnoreCase("Lunch"))
                return new Lunch();
        else if(type.equalsIgnoreCase("Dinner"))
                return new Dinner();
        else 
            return null;
    }
    
}
