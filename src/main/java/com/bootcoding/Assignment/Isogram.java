package com.bootcoding.Assignment;

import java.util.Arrays;

public class Isogram
{
    public static void main(String[] args)
    {

        checkIsogram("orange");
    }


    public static void checkIsogram(String text){

        // Orange
        // O -> range
        // O -> r | o -> a | o -> n | o -> g | o -> e
        // r -> a | r -> n | r -> g | r -> e
        // a -> n | a -> g | a -> e
        // n -> g | n -> e
        // g -> e
        // [1, 2, 3]
        int size = text.length();

        text = text.toLowerCase();

        boolean isIsogram = true;

        for(int j = 0; j < size-1; j++)
        {
            for (int i = j; i < size - 1; i++)
            {
//                System.out.println("i = " + i + " j = " + j);
                if (text.charAt(j) == text.charAt(i + 1))
                {
                    isIsogram = false;
                }
            }
        }
        if(isIsogram)
        {
            System.out.println(text + " is an Isogram");
        }
        else
        {
            System.out.println(text + " is not an Isogram");
        }
    }
}
