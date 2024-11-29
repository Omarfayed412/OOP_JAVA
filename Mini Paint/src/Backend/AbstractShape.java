/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Omar Fayed
 */
public abstract class AbstractShape implements Shape, Serializable{
    private Point position;
    private Color color;
    private Color fillColor;
    private Map<String, Double> properties;
    private String ID;

    @Override
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public AbstractShape() {
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }
    
    @Override
    public abstract void draw(Graphics canvas);
}
