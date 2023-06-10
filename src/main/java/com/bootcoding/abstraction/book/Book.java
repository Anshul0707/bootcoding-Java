package com.bootcoding.abstraction.book;

public  abstract class Book {
    public String title;
    public String author;
    public int year;

    abstract void buy(double amount);

    public void display(){
        System.out.println("Parent said--- ");
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
    }
}
