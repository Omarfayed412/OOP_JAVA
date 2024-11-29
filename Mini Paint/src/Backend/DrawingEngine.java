/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Backend;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Omar Fayed
 */

public interface DrawingEngine {
    //Shape objects
    public void addShape(AbstractShape shape);
    public void removeShape(AbstractShape shape);
    //Return created shapes
    public ArrayList<AbstractShape> getShapes();
    //Redraw all shapes
    public void refresh(Graphics canvas);
    //Adds arraylist to other
    public void addAll(ArrayList<AbstractShape> newShapes);
    //removes all elements
    public void removeAll();
}
