package com.MuhammadZikri;

public class test05_strings {

    public static void main(String[] args){
        String message = "Hello World" + "!!";
        message.endsWith("!!");

        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("He"));
        System.out.println(message.startsWith("Hi"));
        System.out.println(message.length()); // we have 13 characters
        System.out.println(message.indexOf("H")); // index of H is 0, index of e is 1 , -1 for non existing value

        System.out.println(message.replace("!","*")); //! and * are argument (actual value), target and replacement are parameters
        // this method do not alter original string
        // in java string is immutable
        System.out.println(message.toLowerCase()); //change to lower case
        System.out.println(message.toUpperCase());
    }
}
