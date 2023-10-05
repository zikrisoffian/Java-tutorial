package com.MuhammadZikri;

public class test29_for_each_loop {
    public static void main(String[] args) {
        //iterate over arrays or collections
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        // we can do the same thing using for each loop
        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
