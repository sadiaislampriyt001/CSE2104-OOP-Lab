/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

/**
 *
 * @author Lenovo
 */
public class BankAccount {
    int accountNumber ;
    double balance;
    
public BankAccount(int accountNumber, double balance){ 
    this.accountNumber=accountNumber;
    this.balance=balance;

}
public static void main(String[] args) {
    BankAccount A=new BankAccount (45367,900);
    BankAccount B=new BankAccount(23156,4000);
    
    A.deposit(2000);
    A.withdraw(900);
    
    B.deposit(43000);
    B.withdraw(4000);
}
public void deposit(double money){
    if(money>0){
        balance=balance+money;
        System.out.println("Added Money Succesfully");
        System.out.println("Account Balance : "+balance);
    }
    else{
        System.out.println("Invalid Amount");
    }
}
public void withdraw(double money){
    if(money>0&&money<balance){
        balance=balance-money;
         System.out.println("Withdraw Money Succesfully");
         System.out.println("Account Balance : "+balance);
    }
    else{
        System.out.println("Invalid Amount");
    }
    }
}