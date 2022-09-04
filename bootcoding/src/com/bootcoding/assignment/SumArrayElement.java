package com.bootcoding.assignment;

public class SumArrayElement {

    public int [] getRunningSum(int []nums){
        int runningSum;
        for(int i=1;i<nums.length;i++){
            runningSum=nums[i]+nums[i-1];
            nums[i]=runningSum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int a[]={3,5,7,8,92,33};
        SumArrayElement e=new SumArrayElement();
        int [] nums=e.getRunningSum(a);
        for(int x:nums){
            System.out.println(x);
        }
    }
}
