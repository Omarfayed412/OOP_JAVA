/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralDP.Facade;

/**
 *
 * @author Omar Fayed
 */
public class Client {
    public static void main(String[] args) {
        IPlayerFacade player = new PlayerFacade();
        
        player.play();
    }
}
