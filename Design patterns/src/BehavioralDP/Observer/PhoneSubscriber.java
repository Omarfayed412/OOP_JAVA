/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehavioralDP.Observer;

/**
 *
 * @author Omar Fayed
 */
public class PhoneSubscriber implements ISubscriber{
    private double temp, humidity, pressure;

    public PhoneSubscriber() {
        
    }
    
    @Override
    public void update(double temp, double press, double humidity) {
        this.temp = temp;
        this.pressure = press;
        this.humidity = humidity;
    }

    @Override
    public void display() {
        System.out.println("From phone: ");
        System.out.println("Temp: " + this.temp);
        System.out.println("Humidity: " + this.humidity);
        System.out.println("Pressure: " + this.pressure);
    }
    
}
