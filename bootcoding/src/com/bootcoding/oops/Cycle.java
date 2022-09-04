package com.bootcoding.oops;

public class Cycle {
    String companyname;
    double price;
    String type;
    String color;
    String waranty;

    public Cycle() {
        System.out.println("object of cycle is created");
    }

    public Cycle(String companyname, double price, String type, String color, String waranty) {
        this.companyname = companyname;
        this.price = price;
        this.type = type;
        this.color = color;
        this.waranty = waranty;
    }
}
