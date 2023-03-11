package com.core.java.innerClass;
class A
{
    class B
    {
        class C
        {
            public  void m1()
            {
                System.out.println("m1() of inner class");
            }
        }
    }
}
class Nesting {
    public static void main(String[] args)
    {
        A a =new A();
        A.B b= a.new B();
        A.B.C c=b.new C();
        c.m1();
    }
}
