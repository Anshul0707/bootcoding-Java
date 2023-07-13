package com.bootcoding.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // Inherited from Animal class
        dog.bark(); // Specific to Dog class

        Cat cat = new Cat("Whiskers");
        cat.eat(); // Inherited from Animal class
        cat.meow(); // Specific to Cat class
    }
}
