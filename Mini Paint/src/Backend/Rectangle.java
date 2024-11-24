/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Map;

/**
 *
 * @author Omar Fayed
 */
public class Rectangle extends AbstractShape {
    private int length, width;

    public Rectangle() {
        super();
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = super.getProperties().get("L").intValue();
    }

    public void setWidth(int width) {
        this.width = super.getProperties().get("W").intValue();
    }
    
   
    @Override
    void draw(javax.swing.JPanel canvas) {
        Graphics g = canvas.getGraphics();
        g.setColor(this.getColor());
        g.drawRect(this.getPosition().getX(), this.getPosition().getY(), width, length);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(this.getFillColor());
        g2.fillRect(this.getPosition().getX(), this.getPosition().getY(), width, length);
    }
    
}
