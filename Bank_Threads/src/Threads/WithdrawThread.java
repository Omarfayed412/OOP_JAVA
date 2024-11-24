/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import java.util.Random;

/**
 *
 * @author Omar Fayed
 */
public class WithdrawThread extends Thread{
    private double amount;
    Account account;

    public WithdrawThread(Account account) {
        this.account = account;
    }
    
    @Override
    public void run() {
        Random rand = new Random();
        int max = 100;
        int min = 10;
        int randNum;
        randNum = rand.nextInt(max - min + 1) + min;
        
        synchronized (this.account) {
            for (int i = 1; i <= 10; i++) { 
                randNum = rand.nextInt(max - min + 1) + min;
                if (randNum > this.account.getBalance()) {
                    System.out.println("Invalid withdraw!");
                }
                else {
                    this.account.setBalance(this.account.getBalance() + randNum);
                    try {
                        this.sleep(1000);
                        this.account.notify();
                        this.account.wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Withdraw: " + randNum);
                }
                this.account.notify();
            }
            
        }
        
    }
}
