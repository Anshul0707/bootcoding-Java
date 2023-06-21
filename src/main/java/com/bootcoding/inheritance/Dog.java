package com.bootcoding.inheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woof woof!");
    }
}
