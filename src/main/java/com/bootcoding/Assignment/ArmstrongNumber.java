package com.bootcoding.Assignment;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {

        armstrongOrNot();
    }

    public static void armstrongOrNot()
    {
        for (int i=1;i<=5000;i++)
        {
            int num = i;
            int x;
            int result=0;

            while(num!=0)
            {
                x=num%10;
                result=result+(x*x*x);
                num=num/10;
            }
            if (i==result)
            {
                System.out.println(result);
            }
        }

    }

}
