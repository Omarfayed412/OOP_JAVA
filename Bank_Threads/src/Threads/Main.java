/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import java.io.IOException;

/**
 *
 * @author Omar Fayed
 */
public class Main {
    public static void main(String[] args) {
        Account acc = new Account(0);
        
        DepositThread depositTh = new DepositThread(acc);
        WithdrawThread withdrawTh = new WithdrawThread(acc);
        
        depositTh.start();
        withdrawTh.start();
        
        try {
            depositTh.join();
            withdrawTh.join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Account Balance: " + acc.getBalance());
        
    }
}
