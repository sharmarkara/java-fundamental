package com.core.java.collections;
import java.util.ArrayDeque;
public class ArrDeque {

    public static void main(String[] args)
    {
        ArrayDeque ad=new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add("Sharma");
        ad.add("Bengaluru");

        System.out.println(ad);
        ad.addFirst(100);
        ad.addLast(200);
        ad.add(10);
        System.out.println(ad);
    }
}
