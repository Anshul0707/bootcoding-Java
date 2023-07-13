package com.bootcoding.abstraction.loan;

public class HomeLoan extends Loan{

    @Override
    public void calculateInterest() {
        nameOfBank ="BOB";
        amount=5000;
        interestRate=7.00;

        double interest=amount*interestRate;
        System.out.println("Home Loan - Interest amount: " + interest);
    }
}
