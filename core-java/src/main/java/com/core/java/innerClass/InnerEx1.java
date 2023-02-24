package com.core.java.innerClass;

public class InnerEx1 {
    class Inner
    {
        public void m1()
        {
            System.out.println("Inside inner class instance method");
        }
        public void m2()
        {
            Inner i=new Inner();
            i.m1();
        }

    }
    public static void main(String[] args)
    {
        System.out.println("main method of Outer class");
        InnerEx1 outer=new InnerEx1();
        Inner inner= outer.new Inner();
        inner.m1();
    }
}
