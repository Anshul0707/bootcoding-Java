package com.bootcoding.Assignment;

public class FindFactorialOfN
{
    public static void main(String[] args)
    {
        int n=12;
        for (int i=(n-4);i<=n;i++)
        {
            getFact(i);
        }
    }

    public static void getFact(int num)
    {
        if (num<=0)
        {
            System.out.println("Number should be positive or greater than zero");
        }
        else
        {
            long fact = 1;
            for (int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }

    }
}
