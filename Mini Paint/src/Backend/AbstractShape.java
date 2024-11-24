/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.util.Map;

/**
 *
 * @author Omar Fayed
 */
public abstract class AbstractShape {
    private Point position;
    private Color color;
    private Color fillColor;
    private Map<String, Double> properties;
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public AbstractShape() {
    }

    public Point getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public Map<String, Double> getProperties() {
        return properties;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }
    
    abstract void draw(javax.swing.JPanel canvas);
}
