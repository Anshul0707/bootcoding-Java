package com.bootcoding.abstraction.loan;

public class EducationLoan extends Loan {
    @Override
    public void calculateInterest() {
        nameOfBank = "IDFC";
        amount = 98700;
        interestRate = 7.00;

        double interest = amount * interestRate * 10;
        System.out.println("Education Loan - Interest amount: " + interest);
    }
}
