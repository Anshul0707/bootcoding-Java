package com.bootcoding.Task;

import java.util.Scanner;

public class LoanDept
{


    public static void main(String[] args)
    {
        calInterest(100,5,10);

    }

       public static double calInterest(int amount,int years,double interestRate)
    {

//
//      Formula to Calculate interestRateMultiplier
        double interestRateMultiplier = 1 + interestRate / 100;
        System.out.println("Interest Rate Multiplier : "+interestRateMultiplier);
        double totalAmountPayable = amount;
        for (int i = 0; i <years; i++)
        {
             totalAmountPayable = totalAmountPayable * interestRateMultiplier;
        }
        System.out.println(totalAmountPayable);

       return totalAmountPayable;
    }
}
