package com.bootcoding.exercism;

public class BirdWatche {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        System.out.println(getCountForFirstDays(4,birdsPerDay));
        System.out.println(getBusyDays(birdsPerDay));
        System.out.println(hasDayWithoutBirds(birdsPerDay));
        System.out.println(incrementTodayCount(birdsPerDay));
        System.out.println(getToday(birdsPerDay));
        getLastWeek(birdsPerDay);
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

    public static boolean hasDayWithoutBirds(int[] birdsPerDay)
    {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i]==0)
            {
                return true;
            }
        }
        return false;
    }

    public static int getCountForFirstDays(int num,int[] birdsPerDay)
    {
        int sum=0;
        for (int i = 0; i <num; i++) {
            sum=sum+birdsPerDay[i];
        }
        return sum;
    }

    public static int getBusyDays(int[] birdsPerDay) {
        int count=0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i]>=5) {
               count++;
            }
        }
        return count;
    }
}