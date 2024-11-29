/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.AbstractShape;
import Backend.Shape;

/**
 *
 * @author Omar Fayed
 */
public class Coloring_Window extends javax.swing.JFrame {
    private AbstractShape s;
    private javax.swing.JPanel board;
    
    public Coloring_Window(AbstractShape s, javax.swing.JPanel board) {
        setTitle("Color chooser Window");
        initComponents();
        this.s = s;
        this.board = board;
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorChooser = new javax.swing.JColorChooser();
        returnBtn = new javax.swing.JButton();
        chooseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorChooser.setToolTipText("Choose Color");

        returnBtn.setBackground(new java.awt.Color(102, 204, 255));
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        chooseBtn.setBackground(new java.awt.Color(102, 204, 255));
        chooseBtn.setForeground(new java.awt.Color(255, 255, 255));
        chooseBtn.setText("Choose");
        chooseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(chooseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnBtn)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBtn)
                    .addComponent(chooseBtn))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBtnActionPerformed
        // TODO add your handling code here:
        s.setColor(colorChooser.getColor());
        s.setFillColor(colorChooser.getColor());
        board.repaint();
        dispose();
    }//GEN-LAST:event_chooseBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_returnBtnActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseBtn;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JButton returnBtn;
    // End of variables declaration//GEN-END:variables
}
