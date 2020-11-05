package com.example.bankapp.models;

import java.util.UUID;

public class Loan {
    private UUID id;

    private double balance; // 8 bytes can contain decimal

    private double interest;

    public Loan(
        UUID id,
        double balance,
        double interest) {
        this.id = id;
        this.balance = balance;
        this.interest = -5.5;
    }

    public UUID getId() {
        return id;
    }

    public void addToBalance(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseInterest(double amount) {
        if (amount <= 1 && amount >= -1) {
            this.interest += amount;
        } else {
            System.out.println("That is an invalid amount.");
        }
    }
    public double getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return "Savings{" +
            "id=" + id +
            ", balance=" + balance +
            ", interest=" + interest +
            '}';
    }
}
