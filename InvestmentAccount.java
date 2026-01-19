package com.bank.model;

public class InvestmentAccount extends Account {
    private static final double MONTHLY_INTEREST_RATE = 0.05; // 5%
    private static final double MINIMUM_BALANCE = 500.00;
    
    // Constructor with 4 parameters
    public InvestmentAccount(String accountNumber, Customer customer, 
                            String branch, double initialBalance) {
        super(accountNumber, customer, branch, initialBalance);
        
        if (initialBalance < MINIMUM_BALANCE) {
            System.out.println("Warning: Investment account requires minimum BWP " + MINIMUM_BALANCE);
        }
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
        return balance * MONTHLY_INTEREST_RATE;
    }
    
    @Override
    public String getAccountType() {
        return "Investment Account";
    }
}