/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author Omar Fayed
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shared num = new Shared(11);
        NumberGenerator numGen = new NumberGenerator(num);
        PrimeChecker prime = new PrimeChecker(num);
        
        numGen.start();
        prime.start();
        
        numGen.join();
        prime.join();
    }
}
