package com.core.java.dateTimeApi;

import java.util.Date;

public class Test {

    public static void main(String args[]) {
        java.util.Date utilDate = new java.util.Date();
        System.out.println(utilDate);

        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        System.out.println(sqlDate);
    }
}
