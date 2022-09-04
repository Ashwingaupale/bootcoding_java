package com.bootcoding.oops;

public class Books {
    String author;
    String color;
    String bookname;
    double price;
    int pageno;

    public Books() {
        System.out.println("object of book is created");
    }

    public Books(String author, String color, String bookname, double price, int pageno) {
        this.author = author;
        this.color = color;
        this.bookname = bookname;
        this.price = price;
        this.pageno = pageno;
    }
}
