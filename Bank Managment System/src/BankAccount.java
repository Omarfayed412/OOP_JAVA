/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omar Fayed
 */
public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double currentBalance = 0;
    
    //public constructor 
    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;            
        this.accountName = accountName;        
    }
    
    //Method to get the balance data within the class
    public double getBalance() {
        return this.currentBalance;
    }
    
    //Method to get the acciunt name
    public String getName() {
        return this.accountName;
    }
    
    //Method to get the account number
    public String getAccNumber() {
        return this.accountNumber;
    }
    
    //Method to set the balance within the class
    public void setBalance(double amount) {
        this.currentBalance = amount;
    }
    
    //Methid to print the current balance attribute
    public void checkBalance() {
        System.out.println("Current Balance: " + getBalance());
    }
    
    //Withdrawing amount from current balance
    public boolean withdraw(double amount) {
        if (checkInputAmount(amount)) {
            if (amount > getBalance()) {
                System.out.println("Error: Insufficient funds. Withdrawal failed.");
                return false;
            }

            else {
                setBalance(getBalance() - amount);
            }
            return true;
        }
        else {return false;}
        
    }
    
    //Method to deposit an amount of money
    public void deposit(double amount) {
        if (checkInputAmount(amount)) {
            setBalance(getBalance() + amount);
        }
    }
    
    //Method to print all the holder's data
    public void retrieve() {
        System.out.println(" ");
        System.out.println("Account Number: " + getAccNumber());
        System.out.println("Acount Holder Name: " + getName());
        System.out.println("Current Balance: " + getBalance());
        System.out.println(" ");
    }
    
    //Method to check some test cases on the imput amount
    static boolean checkInputAmount(double amount) {
        if (amount < 0) {
            System.out.println("Error: Entered amount less than zero.");
            return false;
        }
        else if (amount == 0) {
            System.out.println("Error: Entered amount equals zero.");
            return false;
        }
        return true;
    }
    
    //Method to check the input account number
    static boolean checkAccNum(String accNum) {
        char[] array = accNum.toCharArray();
        for (char i : array) {
            if (!(Character.isDigit(i))) {
                System.out.println("Error: Account number shouldn't contain non-numeric values.");
                return false;
            }
        }
        return true;
    }
    
    //Method to check the input account number
    static boolean checkAccName(String accName) {
        char[] array = accName.toCharArray();
        for (char i : array) {
            if (Character.isDigit(i)) {
                System.out.println("Error: Account name shouldn't contain numeric values.");
                return false;
            }
        }
        return true;
    }
}
