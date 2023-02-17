package com.core.java.enums;

enum Gender
{
    MALE,FEMALE,OTHERS;
    //final static Gender MALE=new Gender();
}

public class ThirdEnums {
    public static void main(String[] args)
    {
       Gender g= Gender.MALE;
        System.out.println(g);

        //Here we can use any variables from enums male,gemale,others
        Gender[] gr=Gender.MALE.values();
        for(Gender gg:gr)
        {
            System.out.println(gg +" "+gg.ordinal());//ordinal means indexing
        }
    }
}

