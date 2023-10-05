package com.MuhammadZikri;

public class test22_ternary_operator {
    public static void main(String[] args){
        int income = 120_000; // assign to different class
        String className;
        if (income>100_000)
            className = "First";
        else
            className = "Economy";
        System.out.println(className);

        // we can make this simpler
        int income2 = 11_000;
        String className2 = "Economy";
        if (income2 > 100_000)
            className2 = "First";
        System.out.println(className2);

        // to use fancy simplifier
        int income3 = 150_000;
        String className3 = income > 100_000 ? "First" : "Economy";
        System.out.println(className3);




    }
}
