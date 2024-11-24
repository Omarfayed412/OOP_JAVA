/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.Circle;
import Backend.AbstractShape;
import javax.swing.JFrame;
import Backend.DrawingEngineMain;
import Backend.Line;
import Backend.Rectangle;
import Backend.Shape;
import Backend.Square;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Omar FAyed
 */
public class MainWindow extends javax.swing.JFrame {
    DrawingEngineMain engine = new DrawingEngineMain();
    private int cCount = 0;
    private int rCount = 0;
    private int sCount = 0;
    private int lCount = 0;
    //Canvas canvas = new Canvas();
    
    public MainWindow() {
        setTitle("Main Window");
        initComponents();
        
    }

   
       private void initComponents() {

        shapeLbl = new javax.swing.JLabel();
        colorizeBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        CircleBtn = new javax.swing.JButton();
        squareBtn = new javax.swing.JButton();
        rectangleBtn = new javax.swing.JButton();
        lineBtn = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        shapesCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shapeLbl.setText("Shape");

        colorizeBtn.setBackground(java.awt.SystemColor.inactiveCaption);
        colorizeBtn.setText("Colorize");
        colorizeBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.SystemColor.activeCaptionBorder, java.awt.SystemColor.activeCaptionBorder, null, null));
        colorizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(java.awt.SystemColor.inactiveCaption);
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.SystemColor.activeCaptionBorder, java.awt.SystemColor.activeCaptionBorder, null, null));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        CircleBtn.setBackground(java.awt.SystemColor.inactiveCaption);
        CircleBtn.setText("Circle");
        CircleBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.SystemColor.activeCaptionBorder, java.awt.SystemColor.activeCaptionBorder, null, null));
        CircleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleBtnActionPerformed(evt);
            }
        });

        squareBtn.setBackground(java.awt.SystemColor.inactiveCaption);
        squareBtn.setText("Square");
        squareBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.SystemColor.activeCaptionBorder, java.awt.SystemColor.activeCaptionBorder, null, null));
        squareBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareBtnActionPerformed(evt);
            }
        });

        rectangleBtn.setBackground(java.awt.SystemColor.inactiveCaption);
        rectangleBtn.setText("Rectangle");
        rectangleBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.SystemColor.activeCaptionBorder, java.awt.SystemColor.activeCaptionBorder, null, null));
        rectangleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleBtnActionPerformed(evt);
            }
        });

        lineBtn.setBackground(java.awt.SystemColor.inactiveCaption);
        lineBtn.setText("Line Segment");
        lineBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.SystemColor.activeCaptionBorder, java.awt.SystemColor.activeCaptionBorder, null, null));
        lineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               lineBtnActionPerformed(evt);
            }
        });

        shapesCombo.setBackground(java.awt.SystemColor.activeCaption);
        shapesCombo.setModel(new javax.swing.DefaultComboBoxModel<>());
        shapesCombo.setToolTipText("Choose Shape");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shapeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorizeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn))
                    .addComponent(shapesCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CircleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(lineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(squareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rectangleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CircleBtn)
                    .addComponent(lineBtn)
                    .addComponent(rectangleBtn)
                    .addComponent(squareBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(shapeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shapesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(colorizeBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
            board = new javax.swing.JPanel(){
            protected void paintComponent (Canvas g) {
                super.paintComponent(g.getGraphics());
                engine.refresh(board);
        }            
    };
           board.setBackground(Color.WHITE);
           add(board);
           pack();
                   }

    private void CircleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleBtnActionPerformed
        // TODO add your handling code here:
        Circle_Window cWin = new Circle_Window();
        cWin.setVisible(true);
        Circle c = cWin.getC();
        if (!cWin.isActive()) {
            shapesCombo.addItem("Circle_" + (cCount++));
            c.setID("Circle_" + (cCount++));
            engine.addShape(c);
            engine.refresh(board);
        }        
    }//GEN-LAST:event_CircleBtnActionPerformed

    private void colorizeBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        String s = (String) shapesCombo.getSelectedItem();
        AbstractShape[] s_arr = engine.getShapes();
        for(AbstractShape i : s_arr) {
            if (s.equalsIgnoreCase(i.getID())) {
                Coloring color = new Coloring(i);
                color.setVisible(true);
                engine.refresh(board);
            }
        }
        
    }
    private void squareBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareBtnActionPerformed
        // TODO add your handling code here:
        Square c = null;
        Square_Window cWin = new Square_Window();
        cWin.setVisible(true);
        shapesCombo.addItem("Square_" + (sCount++));
        c.setID("Square_" + (sCount++));
        engine.refresh(board);
    }//GEN-LAST:event_squareBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        String s = (String) shapesCombo.getSelectedItem();
        AbstractShape[] s_arr = engine.getShapes();
        for(AbstractShape i : s_arr) {
            if (s.equalsIgnoreCase(i.getID())) {
              shapesCombo.removeItem(i.getID());
              engine.removeShape(i);
              engine.refresh(board);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void lineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineBtnActionPerformed
        // TODO add your handling code here:
        Line c = null;
        Line_Window lWin = new Line_Window();
        lWin.setVisible(true);
        shapesCombo.addItem("Line_" + (lCount++));
        c.setID("Line_" + (lCount++));
        engine.refresh(board);
    }//GEN-LAST:event_lineBtnActionPerformed

    private void rectangleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleBtnActionPerformed
        // TODO add your handling code here:
        Rectangle c = null;
        Rectangle_Window cWin = new Rectangle_Window();
        cWin.setVisible(true);
        shapesCombo.addItem("Rectangle_" + (lCount++));
        c.setID("Rectangle_" + (lCount++));
        engine.refresh(board);
    }//GEN-LAST:event_rectangleBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CircleBtn;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton colorizeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton lineBtn;
    private javax.swing.JButton rectangleBtn;
    private javax.swing.JLabel shapeLbl;
    private javax.swing.JComboBox<String> shapesCombo;
    private javax.swing.JButton squareBtn;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel board;
}
