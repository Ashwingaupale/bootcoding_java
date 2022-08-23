package com.bootcoding.assignment;
import java.lang.*;

public class MonthAraay {
   static void storeMonths(String []a){
       for (String x:a) {
           System.out.println(x);
       }
    }

    public static void main(String[] args) {
        String[] a;
        a = new java.lang.String[]{"jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
        storeMonths(a);
    }
}
