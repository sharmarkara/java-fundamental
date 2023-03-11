package com.core.java.innerClass;

public class TestAnonymous {
    public static void main(String[] args)
    {
//        int[] arr={10,20,30,40,50,60};
//        display(arr);
        display(new int[]{10,20,30,40});//instance use of an object
    }
    static void display(int[] a)
    {
        int sum=0;
        for(int ele:a)
            sum+=ele;
        System.out.println("The sum of array is "+sum);
    }
}
