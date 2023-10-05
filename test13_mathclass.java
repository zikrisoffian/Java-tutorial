package com.MuhammadZikri;

public class test13_mathclass {

    public static void main(String[] args) {
        // math class to perform mathematical operation
        int result = Math.round(2.99F); //round the number
        System.out.println(result);

        int result2 = (int)Math.ceil(2.44F);
        System.out.println(result2);

        int result3 = (int)Math.floor(2.44F);
        System.out.println(result3);

        int result4 = Math.max(1,10);
        System.out.println(result4);

        int result5 = Math.min(1,10);
        System.out.println(result5);

        double random = Math.random();
        System.out.println(random);

        double random2 = Math.random() * 100;
        System.out.println(random2);

        int round_random = (int)Math.round(Math.random() * 100);
        System.out.println(round_random);
    }
}
