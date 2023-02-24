package com.core.java.innerClass;

public class Outer1 {

    int x=10;//instance vaiable
    static int y=20;//static variable

    class Inner
    {
        public void m1()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Main method of outer class");
        new Outer1().new Inner().m1();
    }
}
