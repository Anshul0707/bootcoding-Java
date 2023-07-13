package com.bootcoding.java8.FunctionalInterfaces;

import java.util.function.Function;

//Function interface
public class Fun {
    public static void main(String[] args) {
        Function<Integer, String> getInt = i -> i + " multiplied by 10 is  " + i * 10;
        System.out.println(getInt.apply(2));
    }
}
