package com.bootcoding.ConditionalsAndLogic;

public class IfStatement
{
//    Exercise 5.1 Rewrite the following code by using a single if statement
    public static void main(String[] args)
    {
        cheakIf(10);
    }

    public static void cheakIf(int x)
    {
        if (x>0)
        {
            if (x<10)
            {
              System.out.println("positive single digit number.");
            }
        }
    }
}
