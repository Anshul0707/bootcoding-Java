package com.bootcoding.java8.FunctionalInterfaces;

import java.util.function.Consumer;

//Consumer interface
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Consum {
    public static void main(String[] args) {
        Person person = new Person();
        Consumer<Person> setName=name->name.setName("Hello");
        setName.accept(person);
        System.out.println(person.getName());


        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello"); // Output: HELLO
    }
}
