package com.bootcoding.Assignment;

public class PrintNum
{
    public static void main(String[] args)
    {
    numPrinter(1000);
    }

    public static void numPrinter(int num)
    {
        System.out.println("Numbers : ");
        for (int i=1; i<=num;i++)
        {
            System.out.println(+i);
        }
    }
}
