package com.core.java.innerClass;

public class MthodInner {
    public void m1()
    {
        class Inner
        {
            public void sum(int x , int y)
            {
                System.out.println("The sum is :"+(x+y));
            }
        }
        Inner i1=new Inner();
        i1.sum(10,20);
        Inner i2=new Inner();
        i2.sum(30,40);
    }
    public static void main(String[] args)
    {
        new MthodInner().m1();
    }
}
