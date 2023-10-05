package com.MuhammadZikri;

public class test12_casting {

    public static void main(String[] args) {
        // Implicit casting --> automatic conversion
        // for example below, byte is automatically converted to short . the order can be used is byte > short > int > long > float > double . There is no chance for data loss

        short x = 1; // short has 2 bytes , int has 4 bytes
        int y = x + 2; // we are adding short to the integer
        System.out.println(y); // we get 3

        // Java automatically cast the integer 2 to double --> 2.0
        // Explicit casting

        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);

        String c = "1";
        Integer.parseInt(c); // the methods parse string change string to an integer
        System.out.println(c);

        String d = "1.1";
        double e = Double.parseDouble(d) + 1; // parse string as double
        System.out.println(e);
    }
}
