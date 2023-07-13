package com.bootcoding.java8.FunctionalInterfaces;

import java.util.function.Predicate;

//Predicate interface
public class Pre {
    public static void main(String[] args) {
        Predicate<String> checkLength = str->str.length()>5;
        System.out.println(checkLength.test("hello"));
    }
}
