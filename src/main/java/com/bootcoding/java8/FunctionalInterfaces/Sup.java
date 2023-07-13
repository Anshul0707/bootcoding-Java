package com.bootcoding.java8.FunctionalInterfaces;

import java.util.function.Supplier;

//Supplier interface
public class Sup {
    public static void main(String[] args) {
        Supplier<Double> getRandom = () -> Math.random();
        for (int i = 0; i < 100; i++) {
            System.out.println(getRandom.get());//no input give output.
        }

    }
}
