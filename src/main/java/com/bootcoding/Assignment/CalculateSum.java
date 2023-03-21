package com.bootcoding.Assignment;

public class CalculateSum
{
    public static void main(String[] args) {
        sum();
    }

    private static void sum() {
        int sum=1;
        for (int i=1;i<=10;i++) {
             sum=sum+i;
        }
        System.out.println(sum);

    }
}
