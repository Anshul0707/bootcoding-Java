package com.bootcoding.Exercise;

public class ReturnValues
{
    public static void main(String[] args)
    {
       calculateArea(15);
//       double d= calculateArea(2);
//        System.out.println(d);
////        System.out.println(calculateArea(2));
    }

    public static double calculateArea(double radius)
    {
        double result= Math.PI * radius*radius;
        return result;
    }
}
