package com.bootcoding.Assignment;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
    printFibonacciSeries(10);
    }

    public static void printFibonacciSeries(int n)
    {
        int first = 0;
        int second=1;
        int last;

        for (int i=2;i<=n;i++) {
            last=first+second;
            first=second;
            second=last;
            System.out.println(last);
        }
    }
}
