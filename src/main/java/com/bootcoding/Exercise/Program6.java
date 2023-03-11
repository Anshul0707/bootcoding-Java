package com.bootcoding.Exercise;

import java.util.Scanner;

//    Reverse a Given String
public class Program6
{
    public static void main(String[] args)
    {
        reverseString();
    }

    private static void reverseString()
    {
        System.out.println("Enter a String..");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev=" ";
        String[] s =str.split("");
        for (String word:s)
        {
            rev=word + " " + rev;
        }
        System.out.println("Reverse String is ="+rev);

    }

}
