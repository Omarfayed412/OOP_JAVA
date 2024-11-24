/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author Omar Fayed
 */
public class Shared {
    private int value = 0;
    private int limit = 0;
    private boolean finished = false;
    public Shared(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }

    public synchronized boolean isFinished() {
        return finished;
    }

    public synchronized void setFinished(boolean finished) {
        this.finished = finished;
    }
    
    
}
