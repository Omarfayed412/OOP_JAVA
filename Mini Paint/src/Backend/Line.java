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
public class Line extends AbstractShape {
    private Point endingPoint;

    public Line() {
        super();
    }

    public void setEndingPoint(int x, int y) {
        this.endingPoint.setX(super.getProperties().get("X").intValue());
        this.endingPoint.setY(super.getProperties().get("Y").intValue());            
    }
    

    public Point getEndingPoint() {
        return endingPoint;
    }

    @Override
    void draw(javax.swing.JPanel canvas) {
        Graphics g = canvas.getGraphics();
        g.setColor(this.getColor());
        g.drawLine(this.getPosition().getX(), this.getPosition().getY(), endingPoint.getX(), endingPoint.getY());
    }
    
}
