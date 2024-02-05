package com.bootcoding.method_hiding;

// Abstract class with public access modifier
public abstract class AbstractExample extends Exception{


    // Field with default (package-private) access modifier
     int defaultField;

    // Field with private access modifier
    private int privateField;

    // Abstract method with protected access modifier
    protected abstract void protectedMethod();

    // Concrete method with public access modifier
    public void publicMethod() {
        System.out.println("Public method in abstract class");
    }
}

