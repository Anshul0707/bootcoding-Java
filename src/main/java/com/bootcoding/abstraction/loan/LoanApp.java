package com.bootcoding.abstraction.loan;

public class LoanApp {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        CarLoan carLoan = new CarLoan();
        EducationLoan educationLoan = new EducationLoan();

        homeLoan.calculateInterest();
        carLoan.calculateInterest();
        educationLoan.calculateInterest();
    }
}
