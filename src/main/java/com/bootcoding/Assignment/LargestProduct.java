package com.bootcoding.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class LargestProduct
{
    public static void main(String[] args)
    {
        maxProduct("234567898776",4); //1027839564
    }



    public static void maxProduct(String str, int n)
    {
        int size = str.length();
        char[] elements = str.toCharArray();
        List<Integer>  numbers = subString(elements, n);
        System.out.println(numbers);

        int max=0;
        for(Integer number : numbers)
        {
            Integer singleElement = number;
            int product = 1;
            while (singleElement != 0) {
                product = product * (singleElement % 10);
                singleElement = singleElement / 10;
            }
            System.out.println(product);
            if (product>max)
            {
                max=product;
            }


        }
        System.out.println("Higest Product is : "+max);
    }




    // elements = 1,2,3
    private static  List<Integer>  subString(char[] elements, int size) {
        List<Integer> numbers = new ArrayList<>();
        for(int j=0; j< (elements.length - (size - 1)); j++)
        {
            String subString = "";
            for (int i = j; i < (size+j); i++) {
                subString = subString + elements[i];
            }
            int number = Integer.parseInt(subString);
            numbers.add(number);
        }
            return numbers;
    }
}
