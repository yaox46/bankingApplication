/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication3;

/**
 *
 * @author Student
 */
public class Account {
    private int number;
    private String name ;
    private double balance ;
    
    public Account(int number , String name , double balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    public int getNumber(){
        return this.number;
    }
    public String  getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
}
