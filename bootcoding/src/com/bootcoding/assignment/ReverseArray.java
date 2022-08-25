package com.bootcoding.assignment;

public class ReverseArray {
    public int [] reverse(int b[]){

        int count=0;
        int temp;
        for (int i=b.length-1;i>0;i--){
            if(i==(b.length-1)/2){
                break;
                                 }
            else {
                temp = b[count];
                b[count] = b[i];
                b[i] = temp;
                count++;
                }
                                    }


        return b ;
    }
}
