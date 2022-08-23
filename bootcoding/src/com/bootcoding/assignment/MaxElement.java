package com.bootcoding.assignment;

public class MaxElement {
    public void max(int a[]) {
        int max = 0;
        max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max elemet in array is :" + max);
    }

    public static void main(String[] args) {
        MaxElement e=new MaxElement();
        int a[]={10,15,205,105,35,75,802,95};
        e.max(a);
    }
}
