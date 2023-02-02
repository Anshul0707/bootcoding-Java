package Exercise;

import java.util.Arrays;

public class FindMinMaxArray
{
    static int[] a ={1,2,5,6,3,2}; //Given Number

    private static void getMinNum()
    {
        int min=a[0];
        for (int i=1;i< a.length;i++)
        {
            if (min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Min value is :"+min);
    }

    private static void getMaxNum()
    {
        int max=a[0];
        for (int i=1;i< a.length;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("max value is :"+max);
    }

    public static void main(String[] args) {
        System.out.println("Given Number is" + Arrays.toString(a));
        getMinNum();
        getMaxNum();
    }

}
