package com.MuhammadZikri;

import java.text.NumberFormat;

public class test14_formatting_numbers {

    public static void main(String[] args) {
        // 1,234,567 or 1.1
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result); // we get dollar sign, every three digit is separated and get two digit after decimal point

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2); // we get 10% for this code

        // Method chaining --> chain multiple method together

        String result4 = NumberFormat.getPercentInstance().format(0.55);
        System.out.println(result4);


    }
}
