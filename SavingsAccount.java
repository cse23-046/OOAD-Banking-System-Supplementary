package com.bank.model;

public class SavingsAccount extends Account {
    
    public SavingsAccount(String accountNumber, Customer customer, double initialBalance) {
        super(accountNumber, customer, initialBalance);
    }
    
    @Override
    public boolean withdraw(double amount) {
        System.out.println("Cannot withdraw from savings");
        return false;
    }
}