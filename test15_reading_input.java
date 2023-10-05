package com.MuhammadZikri;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test15_reading_input {

    public static void main(String[] args) {
        // read input from the user
        System.out.println("test"); // System.out to print to terminal. println method add new line after the label
        System.out.print("Age: "); // print to avoid new line
        Scanner scanner = new Scanner(System.in); // System.in is to read from terminal
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Your name is :");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine(); // return full strings
        System.out.println("Hi " + name );
    }
}
