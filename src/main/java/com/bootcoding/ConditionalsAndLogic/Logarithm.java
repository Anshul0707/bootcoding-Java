package com.bootcoding.ConditionalsAndLogic;

import java.util.Scanner;

public class Logarithm
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }

        double x = in.nextDouble();
        if (x > 0) {
            double y = Math.log(x);
            System.out.println("The log is " + y);
        } else {
            System.out.println("The log is undefined");
        }

    }


}
