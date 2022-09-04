package com.bootcoding.assignment;

public class StartFirstToHalf {

    public  int [] shuffle(int []nums){
        int b[]=new int[nums.length];
        int n=nums.length/2;
        int temp;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                b[i]=nums[i-k];
                k++;
            }
            else {

               b[i]=nums[n];
               n++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        StartFirstToHalf f=new StartFirstToHalf();
        int []nums=f.shuffle(a);
        for(int x:nums){
            System.out.println(x);
        }
    }
}
