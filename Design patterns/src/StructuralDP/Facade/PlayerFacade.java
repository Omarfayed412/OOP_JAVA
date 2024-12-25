/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralDP.Facade;

/**
 *
 * @author Omar Fayed
 */
public class PlayerFacade implements IPlayerFacade{
    private Amp amp;
    private DVD dvd;
    private Projector proj;
    
    public PlayerFacade() {
        this.amp = new Amp();
        this.dvd = new DVD();
        this.proj = new Projector();
    }

    @Override
    public void play() {
        this.amp.turnOn();
        this.dvd.turnOn();
        this.proj.turnOn();
        System.out.println("System is turned On");
    }
}
