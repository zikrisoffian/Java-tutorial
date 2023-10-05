package com.MuhammadZikri;

import java.util.Arrays;

public class test08_multidimensional_array {

    public static void main(String[] args) {
        // we can use multi-dimensional array to store a matrix
        // use 3d array to store data for cube

        int[][] numbers = new int[2][3]; //two rows and 3 columns array
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        System.out.println(Arrays.deepToString(numbers)); // to print multi dimensional array

        // new syntax

        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers2));



    }
}
