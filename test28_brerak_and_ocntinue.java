package com.MuhammadZikri;

import java.util.Scanner;

public class test28_brerak_and_ocntinue {
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);
     //   String input = "";
     //   while (!input.equals("quit"))  {
     //       System.out.println("Input: ");
     //       input = scanner.next().toLowerCase();
     //       if (!input.equals("quit"))
      //          System.out.println((input));
      //  }

        // another way to make this code
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true)  { //we must use pass and break to use while true.
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue; // when java see this it will move control to the beginning of the loop. pass will not get echoed
            if (input.equals("quit"))
                break; //when java see this the while loop will stop
            System.out.println((input));
        }


    }
}
