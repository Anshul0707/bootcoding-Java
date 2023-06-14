package com.bootcoding.Constructor;
//Constructor chaining in Java refers to the process of calling
// one constructor from another constructor within the same class
// or between parent and child classes.
// It allows code reuse and helps in initializing object states.
public class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
        this("Toyota", "Corolla", 2023); // Calls the parameterized constructor with default values
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

//In the above code, we have a Car class with two constructors.
// The first constructor Car() is a default constructor
// that calls the parameterized constructor Car(String make, String model, int year) with default values.
//By using this(), we can call another constructor within the same class.
// In this case, the default constructor sets the default values by invoking the parameterized constructor.
