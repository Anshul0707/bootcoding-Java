package com.bootcoding.ConditionalsAndLogic;

public class Quadratic
{
    public static void main(String[] args)
    {
     findRoots(4,6,9);
    }
        //if d > 0, roots are real and different
        //if d == 0, roots are real and equal
        //if d < 0, roots are complex complex and different
    public static void findRoots(int a,int b,int c)
    {
    double d=(b*b)-4*a*c;
    if (d>0)
    {
      double  root1 = (-b + Math.sqrt(d)) / (2 * a);
       double root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println(root1);
        System.out.println(root2);
    }
    }
}
