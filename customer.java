package com.bank.model;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    
    public Customer(String customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFullName() { 
        return firstName + " " + lastName; 
    }
}