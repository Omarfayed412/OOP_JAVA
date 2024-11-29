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
        this.radius = super.getProperties().get("R");
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public void draw(Graphics canvas) {
        this.setRadius();
        Graphics2D g2 = (Graphics2D )canvas;
        g2.setColor(this.getColor());
        g2.drawOval(this.getPosition().getX(), this.getPosition().getY(), (int)radius,(int) radius);
        System.out.println(this.getPosition().getX() + this.getPosition().getY() +  (int)radius + (int)radius);
        g2.setColor(this.getColor());
        g2.fillOval(this.getPosition().getX(), this.getPosition().getY(), (int)radius,(int) radius);
        System.out.println("Circle added");
    }
}


/* Graphics2D g2 = (Graphics2D)canvas;
        g2.setColor(this.getColor());
        g2.drawOval(this.getPosition().getX(), this.getPosition().getY(), (int)radius,(int) radius);
        g2.setColor(this.getFillColor());
        g2.fillOval(this.getPosition().getX(), this.getPosition().getY(), (int)radius, (int)radius);
        System.out.println("Circle added");*/