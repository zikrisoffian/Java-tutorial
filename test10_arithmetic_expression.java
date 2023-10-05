package com.MuhammadZikri;

public class test10_arithmetic_expression {

    public static void main(String[] args) {
        int result = 10 + 3;
        int result2 = 10 / 3;
        double result3 = (double)10 / (double)3; // to get float(double) answer
        int x = 1;
        x++; // increment
        int y = x++; // y will be 2 and x will increase by 3
        System.out.println(result);
        System.out.println(result2); // In Java, the division of whole number is the whole number
        System.out.println(result3); // In java, this is how we calculate the double
        System.out.println(x);
        System.out.println(y);
        int a = 1;
        int b = ++a; // a and b will both be 2
        System.out.println(a);
        System.out.println(b);
        int c= 1;
        c = c + 2;
        System.out.println(c);

    }
}
