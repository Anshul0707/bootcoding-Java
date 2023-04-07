package com.bootcoding.Exercise;

public class Program2
{
    static int[] a ={1,2,5,6,3,2,8,8}; //Given Number
    private static void getEvenNum()
    {
        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 != 0)
            {
                System.out.println(a[i]);
            }
        }

    }
    private static void getOddNum()
    {
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        getEvenNum();
        getOddNum();
    }

}
