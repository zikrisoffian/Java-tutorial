package com.MuhammadZikri;

public class test18_logical_operators {
    public static void main(String[] args){
        int temperature = 26;
        boolean isWarm = temperature > 25 && temperature < 30; //both most be true to print true
        System.out.println(isWarm);

        int income = 120000;
        boolean hasHighIncome = income > 100000;
        System.out.println(hasHighIncome);
    }
}
