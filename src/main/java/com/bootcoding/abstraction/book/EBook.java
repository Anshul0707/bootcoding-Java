package com.bootcoding.abstraction.book;

public class EBook extends Book{
    @Override
    void buy(double amount) {
        title = "EBook";
        author = "Anshul";
        year = 2000;
    }
}
