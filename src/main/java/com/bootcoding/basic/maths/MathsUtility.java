package com.bootcoding.basic.maths;

import java.util.Scanner;

public class MathsUtility
{
    public static void main(String[] args)
    {
        MathsUtility m = new MathsUtility();
        m.getASquareMinusBSquare(8,2);
        m.getAPlusBWholeSquare(8,2);
        m.getASquarePlusBSquare(8,2);
        m.getAMinusBWholeSquare(8,2);
        m.getAPlusBPlusCWholeSquare(8,2,4);
        m.getAMinusBMinusCWholeSquare(8,2,4);
        m.getAPlusBCube(8,2);
    }

    public  int getASquareMinusBSquare(int a,int b)
    {
        a=a*a;
        b=b*b;

        int result=a-b;
        System.out.println(" The Output of a^2 – b^2 = (a – b)(a + b) is : "+result);
        return result;
    }

    public  int getAPlusBWholeSquare(int a,int b)
    {
        int add=a+b;
        int sq=add*add;

        int result=sq;
        System.out.println(" The Output of (a + b)^2 = a^2 + 2ab + b^2 is : "+result);
        return result;
    }

    public  int getASquarePlusBSquare(int a,int b)
    {
        a=a*a;
        b=b*b;
        int add=a+b;

        int result=add;
        System.out.println(" The Output of a^2+ b^2 = (a + b)^2 – 2ab is : "+result);
        return result;
    }

    public  int getAMinusBWholeSquare(int a,int b)
    {
        int sub=a-b;
        int sq=sub*sub;

        int result=sq;
        System.out.println(" The Output of (a – b)2 = a2 – 2ab + b2. is : "+result);
        return result;
    }

    public  int getAPlusBPlusCWholeSquare(int a,int b,int c)
    {
        int add=a+b+c;
        int sq=add*add;

        int result=sq;
        System.out.println(" The Output of (a + b + c)^2 = a^2 + b^2 + c^2 + 2ab + 2bc + 2ca is : "+result);
        return result;
    }

    public  int getAMinusBMinusCWholeSquare(int a,int b, int c)
    {
        int sub=a-b-c;
        int sq=sub*sub;

        int result=sq;
        System.out.println(" The Output of (a – b – c)^2 = a^2 + b^2 + c^2 – 2ab + 2bc – 2ca is : "+result);
        return result;
    }

    public  int getAPlusBCube(int a,int b)
    {
        int add=a+b;
        int sq=add*add*add;

        int result=sq;
        System.out.println(" The Output of (a + b)3 = a3 + 3a2b + 3ab2 + b2 is : "+result);
        return result;
    }


}
