package com.bank.model;

public class ChequeAccount extends Account {
    
    // Constructor with 4 parameters
    public ChequeAccount(String accountNumber, Customer customer, 
                        String branch, double initialBalance) {
        super(accountNumber, customer, branch, initialBalance);
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: BWP " + amount);
            return true;
        }
        System.out.println("Insufficient funds");
        return false;
    }
    
    @Override
    public double calculateMonthlyInterest() {
        return 0.0;
    }
    
    @Override
    public String getAccountType() {
        return "Cheque Account";
    }
}