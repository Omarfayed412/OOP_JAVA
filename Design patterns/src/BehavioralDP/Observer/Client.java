/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehavioralDP.Observer;

/**
 *
 * @author Omar Fayed
 */
public class Client {
    public static void main(String[] args) {
        WeatherPublisher p = new WeatherPublisher();
        PhoneSubscriber ph1 = new PhoneSubscriber();
        TVSubscriber t1 = new TVSubscriber();
        p.register(t1);
        p.register(ph1);
        
        p.newState(0, 0, 0);
        ph1.display();
        t1.display();
        
        p.unregister(t1);
        p.newState(3, 4, 2);
        ph1.display();
        t1.display();
        
    }
}
