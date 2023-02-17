package com.bootcoding.exercism;

public class BirdWatcher
{
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        getLastWeek(birdsPerDay);
    }
    public static void getLastWeek(int[] birdsPerDay) {
        System.out.println("LastWeek");
        for (int res: birdsPerDay) {
            System.out.println(res);
        }
    }
}
