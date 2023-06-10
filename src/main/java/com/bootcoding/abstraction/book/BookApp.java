package com.bootcoding.abstraction.book;

public class BookApp {
    public static void main(String[] args) {
        TextBook textBook = new TextBook();
        EBook eBook = new EBook();
        AudioBook audioBook = new AudioBook();

        textBook.buy(100);
        eBook.buy(200);
        audioBook.buy(240);

        print(textBook);
        print(eBook);
        print(audioBook);
    }

    public static void print(Book book) {
        book.display();
    }
}
