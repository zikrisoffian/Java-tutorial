package com.MuhammadZikri;

import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;

public class test16_mortgage_calculator {
    public static void main(String[] args) {
        final int MONTH_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int monthlyPeriod = period * MONTH_IN_YEAR;

        //mortgage monthly payment
        double mortgage = principal
                            * (monthlyInterest * Math.pow(1 + monthlyInterest, monthlyPeriod))
                            / (Math.pow(1 + monthlyInterest, monthlyPeriod) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage payment by month: " + mortgageFormatted);

        double totalLoan = principal * monthlyInterest * monthlyPeriod
                        / (1 - Math.pow(1 + monthlyInterest, - monthlyPeriod));
        String totalLoanFormatted = currency.format(totalLoan);
        System.out.println("Total Loan: " + totalLoanFormatted);

        NumberFormat percent = NumberFormat.getPercentInstance();
        double interestPercentage = (totalLoan - principal)/totalLoan;
        String interestPercentageFormatted = percent.format(interestPercentage);
        System.out.println("Interest Percentage: " + interestPercentageFormatted);

        double principalPercentage = principal / totalLoan;
        String principalPercentageFormatted = percent.format(principalPercentage);
        System.out.println("Principal Percentage: " + principalPercentageFormatted);
    }
}
