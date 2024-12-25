/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehavioralDP.Observer;

/**
 *
 * @author Omar Fayed
 */
public interface IWeatherPublisher {
    public void register(ISubscriber s);
    public void unregister(ISubscriber s);
    public void notifySubscribers();
    public void newState(double temp, double press, double humidity);
}
