/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Map;
import java.awt.*;

/**
 *
 * @author Omar Fayed
 */
public class Circle extends AbstractShape {
   private double radius; 
    
    public Circle() {
        super();
    }
    
    public void setRadius() {
        this.radius = super.getProperties().get("Radius");
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public void draw(javax.swing.JPanel canvas) {
        Graphics g = canvas.getGraphics();
        g.setColor(this.getColor());
        g.drawOval(this.getPosition().getX(), this.getPosition().getY(), (int)radius,(int) radius);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(this.getFillColor());
        g2.fillOval(this.getPosition().getX(), this.getPosition().getY(), (int)radius, (int)radius);
    }
}
