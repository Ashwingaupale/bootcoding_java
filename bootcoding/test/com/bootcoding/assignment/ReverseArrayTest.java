package com.bootcoding.assignment;

import org.junit.Assert;
import org.junit.Test;


public class ReverseArrayTest {


    @Test
    public void reverseTest(){
        int a[]={10,15,20,25,35,75,808,95};
    //    int e[]={10,15,20,25,35,75,808,95};
        ReverseArray y=new ReverseArray();
    //    int c[]={11,33,20,25,35,75,808,95};
        int[] reverse = y.reverse(a);
        Assert.assertArrayEquals(a,reverse);

    }

}
