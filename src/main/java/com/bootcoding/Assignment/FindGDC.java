package com.bootcoding.Assignment;

public class FindGDC
{
    public static void main(String[] args)
    {
        calGDC(98,56);

    }

    public static void calGDC(int a, int b)
    {
        int result = Math.min(a, b);
        System.out.println(result);
    }
}
