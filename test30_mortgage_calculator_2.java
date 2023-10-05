package com.MuhammadZikri;

import java.text.NumberFormat;
import java.util.Scanner;

public class test30_mortgage_calculator_2 {
    public static void main(String[] args){

        final int MONTH_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal<1_000 || principal>1_000_000)
                System.out.println("Enter a number between 1,000 and 1,000,000");
            else
                break;
        }

        double annualInterest = 0;
        while (true) {
            System.out.print("Annual Interest Rate :");
            annualInterest = scanner.nextDouble();
            if (annualInterest <= 0 || annualInterest > 30)
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            else
                break;
        }

        int annualPeriod = 0;
        while (true) {
            System.out.print("Period (Years): ");
            annualPeriod  = scanner.nextInt();
            if (annualPeriod <= 0 || annualPeriod >30)
                System.out.println("Enter value between 1 and 30 (years)");
            else
                break;
        }

        double monthlyInterest = annualInterest / MONTH_IN_YEAR / PERCENT;
        int monthlyPeriod = annualPeriod * MONTH_IN_YEAR;

        double mortgage = principal
                        * (monthlyInterest * Math.pow(1 + monthlyInterest , monthlyPeriod))
                        / (Math.pow(1 + monthlyInterest, monthlyPeriod) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage payment per month :" + mortgageFormatted);

        double totalLoan = principal * monthlyInterest * monthlyPeriod
                            / ( 1 - Math.pow(1 + monthlyInterest, - monthlyPeriod));
        String totalLoanFormatted = currency.format(totalLoan);
        System.out.println("Total Loan: " + totalLoanFormatted);

        NumberFormat percent = NumberFormat.getPercentInstance();
        double interestPercentage  = (totalLoan - principal) / totalLoan;
        String interestPercentageFormatted = percent.format(interestPercentage);
        System.out.println("Interest Percentage: " + interestPercentageFormatted);

        double principalPercentage = principal / totalLoan;
        String principalPercentageFormatted = percent.format(principalPercentage);
        System.out.println("Principal Percentage: " + principalPercentageFormatted);


    }
}
