package com.core.java.Basics;

import java.util.Scanner;

public class Swap_Two_Number {
    public static void main(String args[])
    {
        int x, y,temp;
        System.out.println("Enter two numbers x and y");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping the number is "+x+"\ny = "+y);

    }
}
