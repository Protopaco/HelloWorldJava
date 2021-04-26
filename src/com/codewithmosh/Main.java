package com.codewithmosh;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float[] principleConditions = new float[]{0F, 100000000F};
        int principle = Math.round(input("Amount borrowed: ", principleConditions));

        float[] interestConditions = new float[]{0F, 100F};
        float interestResponse = input("Interest Rate: ", interestConditions);
        float interest = interestResponse / PERCENT / MONTHS_IN_YEAR;

        float[] termConditions = new float[]{0F, 100F};
        int term = Math.round(input("Term in Years: ", termConditions));
        int termInMonths = term * MONTHS_IN_YEAR;

        double paymentAmount = principle * ((interest * Math.pow(1+ interest, termInMonths)) / (Math.pow(1+interest, termInMonths) -1));
        String displayAmount = formatToDollars(paymentAmount);

        System.out.println("Payment: " + displayAmount);

    }

    private static Float input(String prompt, float[] conditions ) {
        Scanner scanner = new Scanner(System.in);
        float response;

        do{
            System.out.print(prompt);
            response = scanner.nextFloat();
        }

        while ((response < conditions[0]) && (response > conditions[1]));
        return response;
    }

    private static String formatToDollars(double input) {
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        return us.format(input);
    }
}
