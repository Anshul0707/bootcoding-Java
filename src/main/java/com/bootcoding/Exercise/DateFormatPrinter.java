package com.bootcoding.Exercise;
public class DateFormatPrinter
{
    public static void main(String[] args)
    {
        printAmerican("Monday",07,"July",2022);
        printEuropean("Monday",07,"July",2022);
    }
    public static void printAmerican(String day, int date,String month,int year)
    {
       System.out.println("American Date Format : "+day+ ","+month+ " " +date+ "," +year);  //Monday, July 22, 2019
    }
    public static void printEuropean (String day, int date, String month, int year)
    {
        System.out.println("European Date Format : "+day+" "+date+" "+month+", "+year);
    }
}
