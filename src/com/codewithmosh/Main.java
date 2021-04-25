package com.codewithmosh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        System.out.print("Principle: ");
         Scanner scanner = new Scanner(System.in);
         int principle = scanner.nextInt();
        System.out.print("Interest Rate: ");
        float interest = scanner.nextFloat() / PERCENT / MONTHS_IN_YEAR;
        System.out.print("Term in Years: ");
        int payments = scanner.nextInt() * MONTHS_IN_YEAR;
        double paymentAmount = principle * ((interest * Math.pow(1+ interest, payments)) / (Math.pow(1+interest, payments) -1));
        System.out.println(paymentAmount);
    }
}
