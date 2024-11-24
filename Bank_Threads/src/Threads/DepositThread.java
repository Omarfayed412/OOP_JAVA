/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import static java.lang.Double.max;
import java.util.Random;

/**
 *
 * @author Omar Fayed
 */
public class DepositThread extends Thread{
    private double amount;
    private Account account;

    public DepositThread(Account account) {
        this.account = account;
    }
    
    @Override
    public void run() {
        Random rand = new Random();
        int max = 100;
        int min = 10;
        int randNum;
        
        synchronized (this.account) {
            for (int i = 1; i <= 10; i++) { 
                randNum = rand.nextInt(max - min + 1) + min;
                this.account.setBalance(this.account.getBalance() + randNum);
                try {
                    this.sleep(1000);
                    this.account.notify();
                    this.account.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Deposit: " + randNum);
            }
            try {
                this.account.notify();
                this.account.wait();
                }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
