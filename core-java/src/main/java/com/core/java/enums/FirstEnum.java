package com.core.java.enums;

enum Result
{
    PASS,FAIL,NR;
}

public class FirstEnum {
    public static void main(String[] args)
    {
        Result r=Result.PASS;
        System.out.println(r);
    }
}
