/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankingApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("xyz");
        int option = 0;
        String name;
        int number;
        double balance,amount;
        
        Account account ;
        
        while(option!= 6  ){
        System.out.println("Main Menu");
        System.out.println("1. Display All Accounts");
        System.out.println("2. Open new Accounts");
        System.out.println("3. Close existing accounts ");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");
        System.out.println();
        
            System.out.print("ENTER your Choice: ");
            option = scan.nextInt();
            scan.nextLine();
            System.out.println();
            
            switch(option ) {
                case 1:
                    bank.listAccount();
                    break;
                case 2:
                    number = generatedAccountNumber();
                    System.out.print("Enter Account Name : ");
                    name = scan.nextLine();
                    System.out.print("Enter initial Balance : ");
                    balance = scan.nextDouble();
                    account = new Account(number , name , balance);
                    bank.openAccount(account);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    number = scan.nextInt();
                    bank.closeAccount(number);
                    break;
                case 4:
                    System.out.print("Enter Account Number ");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter Amount :");
                    amount = scan.nextDouble();
                    bank.depositMoney(account, amount);
                    break;
                case 5:
                    System.out.print("Enter ACcount Number : ");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter Amount :");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(account, amount);
            }
           
        }
    }
    
    public static int generatedAccountNumber(){
        Random random = new Random();
        int accNumber  = 100000 + random.nextInt(900000);
        return accNumber;
    }
}
