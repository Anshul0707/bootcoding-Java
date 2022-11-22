package com.bootcoding.Assignment;

public class ShiftZero
{
    public static void main(String[] args)
    {
        int arr[]={0,1,0,3,12};
        shift(arr);
    }

    public static void shift(int arr[])
    {
        int length = arr.length;
        int count=0;

        for (int i=0;i<length;i++)
        {
            if (arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while (count<length)
        {
            arr[count++]=0;
        }
        for (int j=0;j<length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
