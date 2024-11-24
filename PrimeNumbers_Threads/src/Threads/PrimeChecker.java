/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;


/**
 *
 * @author Omar Fayed
 */
public class PrimeChecker extends Thread{
    Shared num;
    public PrimeChecker(Shared num) {
        this.num = num;
    }
    
    @Override
    public void run() {
        
            synchronized (this.num) {  
                while (true) { 
                    if (isPrime(this.num.getValue())) 
                        System.out.println("Prime : " + this.num.getValue());

                    else 
                        this.num.getValue();
                    this.num.notify();
                    
                    try {
                        this.num.wait();
                    }
                    catch(InterruptedException e) {
                        e.printStackTrace();  
                    }
                    if(num.isFinished()) {
                        break;
                    }
                }
                this.num.notify();
            }
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for(int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
}

