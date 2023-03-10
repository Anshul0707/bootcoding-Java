package com.bootcoding.Exercise;

import java.util.Arrays;

public class Program4
{

    public static void main(String[] args) {
            getSecondLargNum();
    }

    private static void getSecondLargNum() {
        int a[] = { 12, 35, 1, 10, 34, 1 };
        int length = a.length;
        System.out.println(length);
        Arrays.sort(a);
        System.out.println("Sorted Array is"+Arrays.toString(a));
        int result = a[length - 2];
        System.out.println("Second Largest Number is " +result);
    }
}
