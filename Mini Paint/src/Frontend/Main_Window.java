/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.AbstractShape;
import Backend.DrawingEngineMain;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Fayed
 */
public class Main_Window extends javax.swing.JFrame {
    DrawingEngineMain engine = new DrawingEngineMain();
    private int cout = 0, rout = 0, sout = 0, lout = 0;
    public Main_Window() {
        setTitle("Main Window");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circleBtn = new javax.swing.JButton();
        squareBtn = new javax.swing.JButton();
        rectangleBtn = new javax.swing.JButton();
        lineBtn = new javax.swing.JButton();
        colorBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resizeBtn = new javax.swing.JButton();
        moveBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        loadBtn = new javax.swing.JButton();
        boardPan = new DrawingCanvas(this.engine)
        ;
        components = new javax.swing.JComboBox<>();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        circleBtn.setBackground(new java.awt.Color(102, 204, 255));
        circleBtn.setForeground(new java.awt.Color(255, 255, 255));
        circleBtn.setText("Circle");
        circleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleBtnActionPerformed(evt);
            }
        });

        squareBtn.setBackground(new java.awt.Color(102, 204, 255));
        squareBtn.setForeground(new java.awt.Color(255, 255, 255));
        squareBtn.setText("Square");
        squareBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareBtnActionPerformed(evt);
            }
        });

        rectangleBtn.setBackground(new java.awt.Color(102, 204, 255));
        rectangleBtn.setForeground(new java.awt.Color(255, 255, 255));
        rectangleBtn.setText("Rectangle");
        rectangleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleBtnActionPerformed(evt);
            }
        });

        lineBtn.setBackground(new java.awt.Color(102, 204, 255));
        lineBtn.setForeground(new java.awt.Color(255, 255, 255));
        lineBtn.setText("Line segment");
        lineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineBtnActionPerformed(evt);
            }
        });

        colorBtn.setBackground(new java.awt.Color(102, 204, 255));
        colorBtn.setForeground(new java.awt.Color(255, 255, 255));
        colorBtn.setText("Colorize");
        colorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(102, 204, 255));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resizeBtn.setBackground(new java.awt.Color(102, 204, 255));
        resizeBtn.setForeground(new java.awt.Color(255, 255, 255));
        resizeBtn.setText("Resize");
        resizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeBtnActionPerformed(evt);
            }
        });

        moveBtn.setBackground(new java.awt.Color(102, 204, 255));
        moveBtn.setForeground(new java.awt.Color(255, 255, 255));
        moveBtn.setText("Move");
        moveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(102, 204, 255));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        loadBtn.setBackground(new java.awt.Color(102, 204, 255));
        loadBtn.setForeground(new java.awt.Color(255, 255, 255));
        loadBtn.setText("Load");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        boardPan.setBackground(new java.awt.Color(255, 255, 255));
        boardPan.setToolTipText("Board");

        javax.swing.GroupLayout boardPanLayout = new javax.swing.GroupLayout(boardPan);
        boardPan.setLayout(boardPanLayout);
        boardPanLayout.setHorizontalGroup(
            boardPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        boardPanLayout.setVerticalGroup(
            boardPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jLabel1.setText("File Name to be Saved: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(components, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(resizeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(colorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(moveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(loadBtn))
                                .addGap(0, 134, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(circleBtn)
                        .addGap(18, 18, 18)
                        .addComponent(squareBtn)
                        .addGap(18, 18, 18)
                        .addComponent(rectangleBtn)
                        .addGap(18, 18, 18)
                        .addComponent(lineBtn))
                    .addComponent(boardPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(circleBtn)
                            .addComponent(squareBtn)
                            .addComponent(rectangleBtn)
                            .addComponent(lineBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boardPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loadBtn)
                        .addGap(18, 18, 18)
                        .addComponent(components, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorBtn)
                            .addComponent(deleteBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resizeBtn)
                            .addComponent(moveBtn))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void circleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleBtnActionPerformed
        Circle_Window cWin = new Circle_Window(this.engine, boardPan, this.cout);
        cWin.setVisible(true);
        components.addItem("Circle_" + cout);
        cout++;
    }//GEN-LAST:event_circleBtnActionPerformed

    private void squareBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareBtnActionPerformed
        Square_Window sWin = new Square_Window(this.engine, boardPan, this.sout);
        sWin.setVisible(true);
        components.addItem("Square_" + sout);
        sout++;
    }//GEN-LAST:event_squareBtnActionPerformed

    private void rectangleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleBtnActionPerformed
        Rectangle_Window rWin = new Rectangle_Window(this.engine, boardPan, this.rout);
        rWin.setVisible(true);
        components.addItem("Rectangle_" + rout);
        rout++;
    }//GEN-LAST:event_rectangleBtnActionPerformed

    private void lineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineBtnActionPerformed
        Line_Window lWin = new Line_Window(this.engine, boardPan, this.lout);
        lWin.setVisible(true);
        components.addItem("Line_" + lout);
        lout++;
    }//GEN-LAST:event_lineBtnActionPerformed

    private void colorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBtnActionPerformed
        AbstractShape selected  = getItem();
        Coloring_Window colorWin = new Coloring_Window(selected, boardPan);
        colorWin.setVisible(true);
    }//GEN-LAST:event_colorBtnActionPerformed

    private void moveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBtnActionPerformed
        AbstractShape selected = getItem();
        Move_Window mvWin = new Move_Window(selected , boardPan);
        mvWin.setVisible(true);
    }//GEN-LAST:event_moveBtnActionPerformed

    private void resizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeBtnActionPerformed
        AbstractShape selected = getItem();
        System.out.println((selected.getID().split("_"))[0]);
        if ((selected.getID().split("_"))[0].equalsIgnoreCase("Square")) {
            Resize_Square_Window sWin = new Resize_Square_Window(selected, boardPan);
            sWin.setVisible(true);
        }
        else if ((selected.getID().split("_"))[0].equalsIgnoreCase("Circle")) {
            Resize_Circle_Window cWin = new Resize_Circle_Window(selected, boardPan);
            cWin.setVisible(true);
        }
        else if ((selected.getID().split("_"))[0].equalsIgnoreCase("Rectangle")) {
            Resize_Rectangle_Window rWin = new Resize_Rectangle_Window(selected, boardPan);
            rWin.setVisible(true);
        }
        else if ((selected.getID().split("_"))[0].equalsIgnoreCase("Line")) {
            Resize_Line_Window lWin = new Resize_Line_Window(selected, boardPan);
            lWin.setVisible(true);
        }
    }//GEN-LAST:event_resizeBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        AbstractShape selected = getItem();
        components.removeItem(selected.getID());
        this.engine.removeShape(selected);
        boardPan.repaint();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Choose Directory");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        ArrayList<AbstractShape> shapes = this.engine.getShapes();
        int choice = chooser.showSaveDialog(this);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File sleceted = chooser.getSelectedFile();
            if (sleceted != null) {
                try{
                    if (nameField.getText().isEmpty()) throw new NullPointerException();
                    File savedFile = new File(sleceted, nameField.getText() + ".ser");
                    try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(savedFile))) {
                        output.writeObject(shapes); 
                        JOptionPane.showMessageDialog(this, "Drawing saved successfully.");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error saving drawing: " + e.getMessage());
                    }
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Error: Empty file name field");
                    }
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select File");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int choice = chooser.showOpenDialog(this);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File sleceted = chooser.getSelectedFile();

            if (sleceted != null) {
                try (ObjectInputStream inputScan = new ObjectInputStream(new FileInputStream(sleceted))) {
                    ArrayList<AbstractShape> loadedShapes = (ArrayList<AbstractShape>) inputScan.readObject();
                    
                    this.engine.removeAll();
                    this.engine.addAll(loadedShapes);
                    
                    components.removeAllItems();
                    for (AbstractShape i : this.engine.getShapes()) {
                        components.addItem(i.getID());
                    }
                    repaint();
                    JOptionPane.showMessageDialog(this, "Drawing loaded successfully.");
                } catch (IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(this, "Error loading drawing: " + e.getMessage());
                }
            }
    }//GEN-LAST:event_loadBtnActionPerformed
    }
    public AbstractShape getItem() {
       ArrayList<AbstractShape> shapes = this.engine.getShapes();
       Object selected = components.getSelectedItem();
       if (selected == null)
           JOptionPane.showMessageDialog(null, "No Selected object");
       for (AbstractShape i : shapes) {
           if (i.getID().equalsIgnoreCase(selected.toString())) return (AbstractShape) i;
       }
       return null;
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPan;
    private javax.swing.JButton circleBtn;
    private javax.swing.JButton colorBtn;
    private javax.swing.JComboBox<String> components;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lineBtn;
    private javax.swing.JButton loadBtn;
    private javax.swing.JButton moveBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton rectangleBtn;
    private javax.swing.JButton resizeBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton squareBtn;
    // End of variables declaration//GEN-END:variables
}
