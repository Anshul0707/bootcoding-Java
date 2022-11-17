package com.bootcoding.basic.maths;

import java.util.Arrays;

public class AverageMarks
{
    int x,total,av;
    public static void main(String[] args)
    {
        AverageMarks averageMarks = new AverageMarks();
        averageMarks.getAverageMarks("Rahul,75,40,50,80");
        averageMarks.getPercentage();
    }



    public float getAverageMarks(String text)
    {
         total=0;
        String[] array = text.split(",");
        System.out.println("Givaen String is : "+Arrays.toString(array));
        int length = array.length;
         x = length - 1;
        for (int i=1;i<length;i++)
        {
           total= total+  Integer.parseInt(array[i]);
        }
        System.out.println("Total marks = "+total);
         av=total/x;
        System.out.println("Average = "+av);
        return av;
    }
    public int getPercentage(){
        int per= av*100;
        System.out.println(per);
        return per;
    }
}
