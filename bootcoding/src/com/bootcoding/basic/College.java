package com.bootcoding.basic;

public class College {
    public static void main(String[] args) {
        String grade="B";
        if(grade=="A+"){
            System.out.println("ETC,CSE,MLE,AIE,ME,EE,CE");
        }
        if(grade=="A"){
            System.out.println("CSE,ETC,ME,EE,CE,MLE");
        }
        if(grade=="B+"){
            System.out.println("ETC,CSE,ME,EE");
        }
        if(grade=="B"){
            System.out.println("ETC,CSE,ME");
        }
    }
}
