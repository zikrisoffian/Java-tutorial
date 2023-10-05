package com.MuhammadZikri;

import java.awt.*;

public class test04_reference_type {

    public static void main(String[] args){
        // we have two different variables x and y. These two have different memory location
        // they are completely independent of each other
        // eg: if we change the value of x, y wil not be affected

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(x);
        System.out.println(y);

        //  in Java we have Point class that is defined in the package java.awt
        // when java execute the below, it allocate some memory to store this point object
        // this is the difference between primitive and reference type
        // when we declare primitive like a byte, the value that is assigned to the variable will be stored in that memory
        // when we declare reference like Point, our variable is going to reference the value of that point object in memory

        //From the programmer's perspective, a primitive variable's information is stored as the value of that variable,
        //whereas a reference variable holds a reference to information related to that variable. reference variables are practically always objects in Java.

        Point point1 = new Point(1, 1);
        Point point2 = point1; //these two are dependent of each other, each referencing to the same object
        point1.x = 2;
        System.out.println(point2);

    }
}
