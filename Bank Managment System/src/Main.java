
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omar Fayed
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Managmnet system (\\__/)");
        BankAccount account1 = createAccount();
        routine(account1);
    }
    
    //Method used to create accounts
    static BankAccount createAccount() {
        Scanner scanner = new Scanner(System.in);
        String number;
        String name;
        
        System.out.println("Create your account: ");
        
        while (true) { 
            System.out.print("Enter the Account holder's name: ");
            name = scanner.nextLine();
            if (!BankAccount.checkAccName(name)) 
                System.out.println("Error: Account name shouldn't contain numeric values.");
            else
               break;
        }
        
        while (true){
            System.out.print("Enter the account number: ");
            number = scanner.nextLine();
            if (!BankAccount.checkAccNum(number)) 
                System.out.println("Error: Account number shouldn't contain non-numeric values.");
            else             
                break;

        }
        
         //Creating an instance
        BankAccount account = new BankAccount(number, name);
        
        return account;
    }
    
    //A method that holds main routine
    static void routine(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        char option;
        double amount;
        System.out.print("D -> deposit a positive amount\n");
        System.out.println("W -> withdraw a positive amount\nB -> balance check");
        System.out.println("I -> Complete account information\nH -> help\nE -> Exit\n");
        
        do{
            System.out.print("Please select the operation: ");
            option = scanner.next().charAt(0); //Reading a character
            switch(option) {
                case 'D':
                case 'd':
                    System.out.print("Enter the amount to deposit: ");
                    amount = scanner.nextDouble();
                    if (BankAccount.checkInputAmount(amount)) {
                        account.deposit(amount);
                    }
                    break;
                case 'W':
                case 'w':
                    System.out.print("Enter the amount to withdraw: ");
                    amount = scanner.nextDouble();
                    if (BankAccount.checkInputAmount(amount)) {
                        if(!account.withdraw(amount)) {
                            System.out.println("Error: Insufficient funds. Withdrawal failed.");
                        }
                    }
                    break;
                case 'B':
                case 'b':
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 'I':
                case 'i':
                    account.retrieve();
                    break;
                case 'H':
                case 'h':
                    System.out.print("D -> deposit a positive amount\n");
                    System.out.println("W -> withdraw a positive amount\nB -> balance check");
                    System.out.println("I -> Complete account information\nH -> help\nE -> Exit\n");
                default:
                    break;
            }
        }while (option != 'E' && option != 'e' );
        
        System.out.println("Thanks for using (*-*)");
    }
}
