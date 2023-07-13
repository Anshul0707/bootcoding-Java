package com.bootcoding.java8.StreamAPi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anshul");
        list.add("Akash");
        list.add("Rahul");
        list.add("Rajat");
        list.add("Raj");
        list.add("Pranit");

        Stream<String> stream = list.stream();
        Stream<String> a = stream.filter(s -> s.startsWith("A"));
        a.forEach(n-> System.out.println(n));
    }
}
