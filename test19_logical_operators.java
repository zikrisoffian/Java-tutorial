package com.MuhammadZikri;

public class test19_logical_operators {
    public static void main(String[] args){

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isElligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // || is 'or' // && ! is 'not'
    }
}
