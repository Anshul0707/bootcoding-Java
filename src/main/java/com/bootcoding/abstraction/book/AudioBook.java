package com.bootcoding.abstraction.book;

public class AudioBook extends Book{
    @Override
    void buy(double amount) {
        title = "Audio Book!";
        author = "Akash";
        year = 1995;
    }
}
