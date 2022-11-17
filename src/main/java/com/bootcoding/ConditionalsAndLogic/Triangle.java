package com.bootcoding.ConditionalsAndLogic;

public class Triangle
{
    public static void main(String[] args) {
        isTriangle(10,12,14);
    }

    public static void isTriangle(int length1, int length2, int length3) {
        if (length1 <= 0 || length2 <= 0 || length3 <=0)
        {
            System.out.println("ERROR : Lengths Not be negative or zero");
            return;
        }
        if (length1 > (length2 + length3))
        {
            System.out.println("Can not Form Triangle");
        }
        else if (length2 > (length1 + length3))
        {
            System.out.println("Can not Form Triangle");
        }
        else if (length3 > (length1 + length2))
        {
            System.out.println("Can not Form Triangle");
        }
        else
        {
            System.out.println("Form Triangle");
        }
    }
}
