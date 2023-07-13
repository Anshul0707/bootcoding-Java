package com.bootcoding.OPP.polymorphism;

public class CompiledTime
{
    public static void main(String[] args) {
        int res = add(1, 3);
        System.out.println(res);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }
}
