package com.core.java.stramAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String args[])
    {
        List<Integer> nums= Arrays.asList(6,5,2,8,1,7);
       /* int sum=0;
        for(int n: nums)
        {
            if(n%2==1){
                //n=n*2;
                sum=sum+n;
            }

        }
        System.out.println(sum);*/

       /* for(int i=0;i<nums.size();i++)
        {
            System.out.println(nums.get(i));
        }*/

        /*for(int i:nums)
        {
            System.out.println(i);
        }*/

        nums.forEach(n ->System.out.println(n));

    }
}
