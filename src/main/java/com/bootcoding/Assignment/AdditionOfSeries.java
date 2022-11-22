package com.bootcoding.Assignment;

public class AdditionOfSeries
{
    public static void main(String[] args)
    {
        sum(10);
    }

    public static double sum(int num)
    {
        double add = 0.0;
        for (double i=1;i<=num;i++)
        {
           add=add+1/i;
        }
        System.out.println(add);
        return add;
    }
}
