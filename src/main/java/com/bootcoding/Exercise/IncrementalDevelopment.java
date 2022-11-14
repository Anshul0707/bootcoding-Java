package com.bootcoding.Exercise;

public class IncrementalDevelopment
{
    public static void main(String[] args)
    {
        distance(2,4,4,8);

    }

    public static double distance(double x1,double x2,double y1,double y2)
    {
        double dx=x2-x1;
        double dy=y2-y1;
        System.out.println("dx is "+dx);
        System.out.println("dy is "+dy);

        double dsquared=dx * dx + dy * dy;
        System.out.println("dsquared is "+dsquared);

        double mathsq=Math.sqrt(dsquared);
        System.out.println("mathsq is "+mathsq);

        return mathsq;
    }
}
