package com.bank.model;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected Customer customer;
    
    public Account(String accountNumber, Customer customer, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    public abstract boolean withdraw(double amount);
    
    public double getBalance() { 
        return balance; 
    }
}