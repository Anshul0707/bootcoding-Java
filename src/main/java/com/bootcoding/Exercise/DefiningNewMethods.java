package com.bootcoding.Exercise;

public class DefiningNewMethods
{
    public static void main(String[] args)
    {
        System.out.println("First Line");
        newLine();
        System.out.println("Second Line");
    }

    public static void newLine()
    {
        for ( int i=0;i<5;i++)//to print 5 times
        {
            System.out.println("New Line");
        }

    }
}
