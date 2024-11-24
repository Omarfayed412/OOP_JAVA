/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

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
    public AbstractShape[] getShapes() {
        AbstractShape[] shapes_arr = null;
        int count = 0;
        for (AbstractShape i : shapes) {
            shapes_arr[count] = i;
            count++;
        }
        return shapes_arr;
    }
    
    public void refresh(javax.swing.JPanel canvas) {
        for (AbstractShape i : shapes) {
            i.draw(canvas);
        }
        canvas.repaint();
        System.out.println("Refreshed");
    }
    
}
