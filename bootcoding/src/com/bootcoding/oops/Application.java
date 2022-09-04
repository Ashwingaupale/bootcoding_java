package com.bootcoding.oops;

public class Application {
    public static void main(String[] args) {
        Marker m=new Marker();
        m.company="camlin";
        m.color="black";
        m.price=122.5;

        System.out.println(m.company+","+m.color+","+m.price);

        Marker m1=new Marker("natraj","red");
        System.out.println(m1.company+","+m1.color);

        System.out.println("------------------------------------------------------------------------------");
        Books b=new Books();
        b.author="j.c.nadda";
        b.color="white";
        b.bookname="math";
        b.price=122.5;
        b.pageno=300;
        System.out.println(b.author+","+b.color+","+b.bookname+","+b.price+","+b.pageno);

        Books b2=new Books("ashwin","black","physics",132.5,200);
        System.out.println(b2.author+","+b2.color+","+b2.bookname+","+b2.price+","+b2.pageno);

        System.out.println("------------------------------------------------------------------------------");

        Cycle c=new Cycle();
        c.companyname="hero";
        c.price=3200;
        c.type="gear cycle";
        c.color="redblack";
        c.waranty="5 yrs";
        System.out.println(c.companyname+","+c.price+","+c.type+","+c.color+","+c.waranty);

        Cycle c1=new Cycle("herculers",3333,"ladies cycle","black","3yrs");
        System.out.println(c1.companyname+","+c1.price+","+c1.type+","+c1.color+","+c1.waranty);
        System.out.println("------------------------------------------------------------------------------");

        Fan f=new Fan();
        f.speed="low";
        f.color="white";
        f.price=1200.50;
        f.waranty="2yrs";
        f.type="ceiling";
        System.out.println(f.speed+","+f.color+","+f.price+","+f.waranty+","+f.type);

        Fan f1=new Fan("high","blue",1500,"3 yrs","table fan");
        System.out.println(f1.speed+","+f1.color+","+f1.price+","+f1.waranty+","+f1.type);

    }
}
