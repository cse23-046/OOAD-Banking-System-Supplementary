package com.bank.model;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== BANKING SYSTEM ===");
        
        // Create customer
        Customer john = new Customer("C001", "John", "Doe");
        System.out.println("Customer: " + john.getFullName());
        
        // Create account
        SavingsAccount account = new SavingsAccount("SAV001", john, 1000);
        
        // Deposit money
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
        
        // Try to withdraw
        account.withdraw(200);
        
        System.out.println("=== PROGRAM END ===");
    }
}