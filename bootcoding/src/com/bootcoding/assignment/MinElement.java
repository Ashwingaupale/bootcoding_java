package com.bootcoding.assignment;

public class MinElement {
    public int min(int a[]){
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinElement e=new MinElement();
        int a[]={10,15,205,105,35,5,802,95};
        System.out.println("min element of array is:"+e.min(a));
    }
}
