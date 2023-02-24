package com.core.java.innerClass;

class Outer2 //public, default,final,abstract,strictfp
{

    int x=10;//Instance variable of Outer class
    class Inner //public, default,final,abstract,strictfp,private,static
    {
        int x=100;//Instance variable of Inner class
        public void m1()
        {
            int x=1000; //local variable of inner class method
            System.out.println(x);//1000
            System.out.println(this.x);//100
            System.out.println(Outer2.this.x);//10

        }
    }
    public static void main(String[] args)
    {
        System.out.println("Main method of Outer class");
        new Outer2().new Inner().m1();
    }
}
