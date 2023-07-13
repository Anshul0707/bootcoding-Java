package com.bootcoding.abstraction.loan;

public abstract class Loan {
    public String nameOfBank;
    public double amount;
    public double interestRate;

    public abstract void calculateInterest();
}
