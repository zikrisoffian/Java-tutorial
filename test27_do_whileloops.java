package com.MuhammadZikri;

import java.util.Scanner;

public class test27_do_whileloops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit"))  {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println((input));
        }

        do {System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println((input));
        } while(!input.equals("quit"));

    }
}
