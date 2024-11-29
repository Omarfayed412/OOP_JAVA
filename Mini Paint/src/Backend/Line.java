/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Map;

/**
 *
 * @author Omar Fayed
 */
public class Line extends AbstractShape {
    private Point endingPoint = new Point(0, 0);

    public Line() {
        super();
    }

    public void setEndingPoint() {
        this.endingPoint.setX(super.getProperties().get("X2").intValue());
        this.endingPoint.setY(super.getProperties().get("Y2").intValue());            
    }
    

    public Point getEndingPoint() {
        return endingPoint;
    }

    @Override
    public void draw(Graphics canvas) {
        this.setEndingPoint();
        canvas.setColor(Color.BLACK);
        canvas.drawLine(this.getPosition().getX(), this.getPosition().getY(), endingPoint.getX(), endingPoint.getY());
        System.out.println(this.getPosition().getX()+ this.getPosition().getY()+ endingPoint.getX()+ endingPoint.getY());
    }
    
}
