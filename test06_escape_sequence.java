package com.MuhammadZikri;

import java.sql.SQLOutput;

public class test06_escape_sequence {

    public static void main(String[] args) {

        String message = "Hello \"Zikri\""; //use \" to add double quote
        String message2 = "\\Windows\\c\\user\\";
        System.out.println(message);
        System.out.println(message2);

    }
}
