package com.bootcoding.assignment;

public class DoubleArrayElement {

    public  int[] getConcatenation(int []nums){
        int []ans=new int[2*(nums.length)];
        int j=0;
        for(int i=0;i<ans.length;i++){
            if(i<nums.length){
                ans[j]=nums[i];
                j++;
            }
            else {
                ans[j]=nums[i-nums.length];
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={3,7,22,3,21,18,56};
        DoubleArrayElement t=new DoubleArrayElement();
        int []ans=t.getConcatenation(a);
        for(int k:ans){
            System.out.println(k);
        }
    }
}
