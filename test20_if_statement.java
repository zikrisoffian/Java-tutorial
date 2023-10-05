package com.MuhammadZikri;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class test20_if_statement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("temperature :");
        int temperature = scanner.nextInt();

        if (temperature >30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temperature>20 ) {
            System.out.println("The weather is nice");
            System.out.println("Go out");
        }
        else {
            System.out.println("It's a cold day");
            System.out.println("Wear thick clothes");
        }

    }
}
