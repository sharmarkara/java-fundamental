package com.core.java.serializ_Deser;

import java.io.*;

class Dog implements Serializable
{
    int i=10;
    int j=20;
}
public class TestApp {
    public static void main(String[] args) throws IOException {
        Dog d=new Dog();
        System.out.println("Serialization started");
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
        System.out.println("Serialization ended");

        System.out.println("---------");

        System.out.println("Deserialization started");
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        try {
            Dog d1=(Dog)ois.readObject();
            System.out.println(d1.i+"=====>"+d1.j);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deserialization ended");

    }
}
