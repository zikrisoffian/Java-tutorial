package com.MuhammadZikri;

public class test23_switch_statement {
    public static void main(String[] args) {
        // execute the code depending on the value of the expression

        String role = "admin";

        switch (role) { // same as if but more fancy
            case "admin":
                System.out.println("Your are an admin");
                break; // if we don't use the break statement here, Java will continue execute the code in this block

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
        }
    }
}
