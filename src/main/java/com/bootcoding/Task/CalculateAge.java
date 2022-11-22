package com.bootcoding.Task;

import java.util.Calendar;
import java.util.Date;

public class CalculateAge
{
    public static void main(String[] args)
    {
        calAge();
    }

    public static void calAge()
    {
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1995,11,23);

        long years = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        long month = currentDate.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);
        long days = currentDate.get(Calendar.DAY_OF_MONTH) - birthDate.get(Calendar.DAY_OF_MONTH);
        System.out.println("Your Age is : "+years+" years"+" "+month+" months"+" "+days+" days");

    }
}
