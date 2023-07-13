package com.bootcoding.abstraction.book;

public class TextBook extends Book {
    @Override
    void buy(double amount) {
        title = "TextBook";
        author = "Yash";
        year = 2001;
    }
}
