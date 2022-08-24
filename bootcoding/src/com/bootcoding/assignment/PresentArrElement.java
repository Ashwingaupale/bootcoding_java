package com.bootcoding.assignment;

public class PresentArrElement {
   static int temp=80;
    boolean b=false;
    public boolean check(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==temp){
                b=true;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        PresentArrElement t=new PresentArrElement();
        int a[]={10,15,20,25,35,75,808,95};
       boolean found= t.check(a);
       if(found){
           System.out.println(temp+":present in array");
       }
       else {
           System.out.println(temp+":not present in array");
       }
    }
}
