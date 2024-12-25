/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehavioralDP.Observer;

import java.util.ArrayList;

/**
 *
 * @author Omar Fayed
 */
public class WeatherPublisher implements IWeatherPublisher{
    private ArrayList<ISubscriber> subscribers = new ArrayList<>();
    private double temp, humidity, pressure;

    public WeatherPublisher() {
    }
    
    @Override
    public void register(ISubscriber s) {
        this.subscribers.add(s);
    }
    
    @Override
    public void unregister(ISubscriber s) {
        this.subscribers.remove(s);
    }
    
    @Override
    public void notifySubscribers() {
        for (ISubscriber i : this.subscribers) 
            i.update(this.temp, this.pressure, this.humidity);
    }
    
    @Override
    public void newState(double temp, double press,double humidity) {
        this.temp = temp;
        this.pressure = press;
        this.humidity = humidity;
        notifySubscribers();
    }
}
