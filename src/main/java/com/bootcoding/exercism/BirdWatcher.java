package com.bootcoding.exercism;

public class BirdWatcher
{
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        getLastWeek(birdsPerDay);
        getToday(birdsPerDay);
        incrementTodayCount(birdsPerDay);
    }
    public static void getLastWeek(int[] birdsPerDay) {
        System.out.println("LastWeek");
        for (int res: birdsPerDay) {
            System.out.println(res);
        }
    }
    public static int getToday(int[] birdsPerDay){
        int res=birdsPerDay[birdsPerDay.length-1];
        return res;
    }
    public static int incrementTodayCount(int[] birdsPerDay) {
        int res=birdsPerDay[birdsPerDay.length-1]+1;
        return  res;
    }
}
