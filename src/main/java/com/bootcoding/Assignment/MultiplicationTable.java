package com.bootcoding.Assignment;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
     multiplication(10);
    }

    public static void multiplication(int num)
    {
        for (int i=1;i<=10;i++)
        {
            int res=num*i;
            System.out.println(res);
        }
    }
}
