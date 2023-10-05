package com.MuhammadZikri;

import java.util.Arrays; // array package imported

public class test07_arrays {

    public static void main(String[] args) {
        // by default , when we print an array, java return the string which is calculated based on the address of this object in memory
        // if we don't specify array value it will by default change to 0

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        // new way to initialize the array
        // in java have a fixed size, once you create the array you cant add or remove any items into the array
        // use collection class to add/remove items

        int[] numbers2 = {2, 3, 4 , 1, 2}; //the length of this array will be five
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        Arrays.sort(numbers2); // sort the value from small to big
        System.out.println(Arrays.toString(numbers2));

    }
}
