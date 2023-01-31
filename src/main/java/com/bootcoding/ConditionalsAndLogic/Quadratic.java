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
    public static void findRoots(int a,int b,int c) {
        double d = (b * b) - 4 * a * c;
        double root1;
        double root2;
        if (d > 0)
        {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if (d == 0)
        {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        else
        {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

    }
}
