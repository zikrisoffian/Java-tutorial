package com.MuhammadZikri;

public class test21_simplify_if_statement {
    public static void main(String[] args){
        // simplify if statement
        int income = 99_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
        System.out.println(hasHighIncome);

        // another way to simplify if statement
        int income2 = 120_000;
        boolean hasHighIncome2 = (income2 > 100_000); // the left hand side is boolean and the right side return the boolean
        System.out.println(hasHighIncome2);
    }
}
