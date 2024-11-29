/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;

/**
 *
 * @author 20112
 */
import Backend.DrawingEngineMain;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;

public class DrawingCanvas extends javax.swing.JPanel{
    private DrawingEngineMain engine;

    public DrawingCanvas(DrawingEngineMain engine) {
        this.engine = engine;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        engine.refresh(g);
    }
}
