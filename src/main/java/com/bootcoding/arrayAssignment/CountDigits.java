package com.bootcoding.arrayAssignment;

public class CountDigits
{
    public static void main(String[] args) {
        int n =12345;
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
