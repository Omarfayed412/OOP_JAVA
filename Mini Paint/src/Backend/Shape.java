/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Map;

/**
 *
 * @author Omar Fayed
 */
public interface Shape {
    //Position
    public void setPosition(Point position);
    public Point getPosition();
    //Properties(radius, length)
    public void setProperties(Map<String, Double> properties);
    public Map<String, Double> getProperties();
    //Color methods
    public void setColor(Color color);
    public Color getColor();
    public void setFillColor(Color color);
    public Color getFillColor();
    //Redraw shape in canvas
    public void draw(javax.swing.JPanel canvas); 
    public String getID();
}

/* 
Map
Map<String, Double> prices = new HashMap<>();

        // Add key-value pairs
        prices.put("Apple", 2.99);
        prices.put("Banana", 1.99);
        prices.put("Orange", 3.49);

//Drawing
import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent;
class ShapeDrawing extends JComponent {
  
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.drawRect(100, 150, 60, 200);
        g2.fillRect(100, 150, 60, 200);
        
        g2.setColor(Color.ORANGE);
        g2.drawOval(185, 235, 80, 220);
        g2.fillOval(185, 235, 80, 220);
        
        g.setColor(Color.YELLOW);
        int x[] = {400, 400, 500};
        int y[] = {100, 200, 200};
        int numPoints = 3;
        g.drawPolygon(x, y, numPoints);
        g.fillPolygon(x, y, numPoints);
    }
}
public class Graphics101 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first JFrame");
        frame.setSize(600, 600);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.getContentPane().add(new ShapeDrawing ());
        frame.setVisible(true);  
    }
    
}
*/