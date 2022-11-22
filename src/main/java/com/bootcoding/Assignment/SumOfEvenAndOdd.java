package com.bootcoding.Assignment;

public class SumOfEvenAndOdd
{
    public static void main(String[] args)
    {
       getSum();
    }




    private static void getSum()
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 == 0)
            {
                even=even+arr[i];
            }
            else
            {
                odd =odd+arr[i];
            }

        }

        System.out.println("Sum of the Even " + even);
        System.out.println("sum of the Odd " + odd);
    }


}
