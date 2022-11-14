package com.bootcoding.arrayAssignment;

public class Array1 {
    public static void main(String[] args)
    {
        storeIntArrayVal();

    }


    public static void storeIntArrayVal()
    {
        int[] array = {1, 2, 3, 4, 5};

        for (int element : array)
        {
            System.out.println(element);
        }
    }
}
