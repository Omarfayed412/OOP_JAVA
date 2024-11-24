/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar Fayed
 */
public class NumberGenerator extends Thread{
    private Shared num;
    
    public NumberGenerator(Shared num) {
        this.num = num;
    }
    
    @Override
    public void run() {
        synchronized (this.num) { 
            for (int i = 1; i <= this.num.getLimit(); i++) { 
                this.num.setValue(i);
                //System.out.println("Set num: " + this.num.getValue());
                this.num.notify();
                try {
                    this.num.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NumberGenerator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.num.setFinished(true);
            this.num.notify();
                try {
                    this.num.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NumberGenerator.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}
