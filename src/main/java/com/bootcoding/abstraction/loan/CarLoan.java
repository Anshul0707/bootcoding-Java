package com.bootcoding.abstraction.loan;

public class CarLoan extends Loan{
    @Override
    public void calculateInterest() {
        nameOfBank ="Kotak Mahindra Bank";
        amount=8000;
        interestRate=7.00;

        double interest = amount+interestRate*6;
        System.out.println("Car Loan - Interest amount: " + interest);
    }
}
