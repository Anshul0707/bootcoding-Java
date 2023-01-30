package com.bootcoding.Task;

public class CalSteps
{
    public static void main(String[] args)
    {
     stepsCalculator(10);
    }

    public static void stepsCalculator(int n)
    {
        int r;

        if (n%2==0)
        {
         r=n/2;
            r=n;
        }
        else
        {
            System.out.println("odd");
        }
    }
}
