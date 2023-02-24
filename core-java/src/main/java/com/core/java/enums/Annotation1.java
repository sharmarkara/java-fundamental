package com.core.java.enums;
//Its functional interface don't add more method
@FunctionalInterface
interface Addition
{
    void add();
    //int sub(int a);
}
public  abstract class Annotation1 implements Addition {
    public static void main(String[] args) {
       Addition a = new Addition() {
           @Override
           public void add() {
               System.out.println("Addition");
           }
       };
       a.add();
    }


}
