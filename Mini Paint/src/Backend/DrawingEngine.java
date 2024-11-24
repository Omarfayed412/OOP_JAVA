/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Backend;

/**
 *
 * @author Omar Fayed
 */

public interface DrawingEngine {
    //Shape objects
    public void addShape(AbstractShape shape);
    public void removeShape(AbstractShape shape);
    //Return created shapes
    public AbstractShape[] getShapes();
    //Redraw all shapes
    public void refresh(javax.swing.JPanel canvas);
}
