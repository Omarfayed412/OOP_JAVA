/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

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
    
    
}
