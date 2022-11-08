package com.bootcoding.basic.maths;

import java.util.Arrays;

public class AverageMarks
{
    public static void main(String[] args)
    {
        AverageMarks averageMarks = new AverageMarks();
        averageMarks.getAverageMarks("Rahul,75,40,50,80");
    }

    public float getAverageMarks(String text)
    {
        int total=0;
        String[] array = text.split(",");
        System.out.println("Givaen String is : "+Arrays.toString(array));
        int length = array.length;
        int x = length - 1;
        for (int i=1;i<length;i++)
        {
           total= total+  Integer.parseInt(array[i]);
        }
        System.out.println("Total marks = "+total);
        float av=total/x;
        System.out.println("Average = "+av);
        return av;
    }
}
