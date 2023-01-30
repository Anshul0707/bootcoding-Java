package com.bootcoding.arrayAssignment;
//WAP to print positive number if number is 3 digit and above and
// print negative number if number is 2 digit only of given array
//a = [10,-22, 23, 222]
//o/p=-22, 222
public class PositiveNegativeArray
{
    public static void main(String[] args)
    {
        int [] aa={-10,-222, 23, 2222};
        positiveNegativeArray(aa);
    }
    public static  void positiveNegativeArray(int [] aa)
    {

        for (int i = 0; i < aa.length; i++)
        {
            int count=0;
            int n=aa[i];
            if (n>0)
            {
                while (n != 0)
                {
                    n = n / 10;
                    count++;
                }
                if (count>=3)
                {
                    System.out.println(aa[i]);
                }
            }
            else
            {
                while (n != 0)
                {
                    n = n / 10;
                    count++;
                }
                if (count==2)
                {
                    System.out.println(aa[i]);
                }
            }
        }
    }
}
