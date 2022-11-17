package com.bootcoding.ConditionalsAndLogic;

import java.util.Random;
import java.util.Scanner;

public class guessNumber
{
        //    I'm thinking of a num between 1 and 100
        //(including both). Can you guess what it is?
        //Type a num: 45
        //Your guess is: 45
        //The num I was thinking of is: 14
        //You were off by: 31

        //    import java.util.Random;
        //public class GuessStarter {
        //public static void main(String[] args) {
        //// pick a random num
        //Random random = new Random();
        //int num = random.nextInt(100) + 1;
        //System.out.println(num);
        //}
        //}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;
//        System.out.println(num);
        int num2;
        System.out.print("Type a num:  ");
        num2 = in.nextInt();
        if (num2==num)
        {
            System.out.println("You're right");
        }
        else if (num2>num)
        {
            higher(num,num2);
        }
        else
        {
            lower(num, num2);
        }
    }

    private static void lower(int num , int num2)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Given Num is Too Low , try again  ");
        num2 = in.nextInt();
        if (num2==num)
        {
            System.out.println("You're right");
        }
        else if (num2>num)
        {
            higher(num, num2);
        }
            else
        {
            lower(num, num2);
        }
    }

    private static void higher(int num , int num2)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Given Num Too is high , try again  ");
        num2 = in.nextInt();
        if (num2==num)
        {
            System.out.println("You're right");
        }
        else if (num2>num)
        {
            higher(num, num2);
        }
        else
        {
            lower(num, num2);
        }
    }
}
