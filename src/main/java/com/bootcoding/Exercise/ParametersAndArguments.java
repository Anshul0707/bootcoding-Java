package com.bootcoding.Exercise;

public class ParametersAndArguments
{
    public static void main(String[] args)
    {
        printTwice("Good Morning..");//for Strings
        printFourTime(77);//for Integers

    }

    public static void printFourTime(int n)
    {
        System.out.println(n);
        System.out.println(n);
        System.out.println(n);
        System.out.println(n);
    }

    public static void printTwice(String s)
    {
        System.out.println(s);
        System.out.println(s);
    }
}
