/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehavioralDP.Observer;

/**
 *
 * @author Omar Fayed
 */
public interface ISubscriber {
    public void update(double temp, double press, double humidity);
    public void display();
}
