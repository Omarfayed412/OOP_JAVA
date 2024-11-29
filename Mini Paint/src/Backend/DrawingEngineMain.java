/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Omar Fayed
 */

public class DrawingEngineMain implements DrawingEngine {
    private ArrayList<AbstractShape> shapes = new ArrayList<AbstractShape>();
    
    @Override
    public void addShape(AbstractShape shape) {
        shapes.add(shape);
        System.out.println("Shape added");
    }
    
    
    @Override
    public void removeShape(AbstractShape shape) {
        shapes.remove(shape);
        System.out.println("Shape removed");
    }
    
    @Override
    public ArrayList<AbstractShape> getShapes() {
        return this.shapes;
    }
    
    @Override
    public void refresh(Graphics canvas) {
        for (AbstractShape i : shapes) {
            System.out.print("shape drawed");
            i.draw(canvas);
        }
        System.out.println("Refreshed");
    }

    @Override
    public void addAll(ArrayList<AbstractShape> newShapes) {
        for (AbstractShape i : newShapes) 
            shapes.add(i);
    }

    @Override
    public void removeAll() {
        for (AbstractShape i : shapes)
            shapes.remove(i);
    }
    
    
   
}
