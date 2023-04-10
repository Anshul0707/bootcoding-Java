package com.bootcoding.Assignment;
//Return index of element present in an array and if element exists at multiple indexes
// then return highest index of an element
//For ex: array is [-23, 45, 5, -4, 34, 45] and input number is 45,
//output: 5

//use methods in this assignment to findIndex of an input element
public class FindIndex
{
    public static void main(String[] args)
    {
        int [] arr={23, 45, 5, -4, 34, 45};
        System.out.println(findIndex(arr,45));
    }

    public static int findIndex(int arr[], int n)
    {
        if (arr==null)
        {
            return -1;
        }
        int length = arr.length;

        for (int i=0;i<length;i++)
        {
            if (arr[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
}
