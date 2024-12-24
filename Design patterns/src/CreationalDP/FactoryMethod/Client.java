/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.FactoryMethod;

/**
 *
 * @author Omar Fayed
 */
public class Client {
    public static void main(String[] args) {
        BreakfastCreator bFactory = new BreakfastCreator();
        LunchCreator lFactory = new LunchCreator();
        DinnerCreator dFactory = new DinnerCreator();
        
        Meal meal1 = bFactory.makeMeal();
        Meal meal2 = lFactory.makeMeal();
        Meal meal3 = dFactory.makeMeal();
        
        FactoryCompare f = new FactoryCompare();
        Meal meal4 = f.makeMeal("Breakfast");
        meal4.prepare();
        
        meal1.prepare();
        meal2.prepare();
        meal3.prepare();
    }
}
