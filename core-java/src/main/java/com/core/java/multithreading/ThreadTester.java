package com.core.java.multithreading;

public class ThreadTester {
    public static void main(String[] args)
    {
        System.out.println("Main is starting");
        Thread thread1=new Thread1();
        thread1.start();
        System.out.println("Main is existing");
    }
}
