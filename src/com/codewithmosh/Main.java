package com.codewithmosh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        String output = "";

        if (number % 5 == 0)
            output += "Fizz";
        if (number % 3 == 0)
            output += "Buzz";
        if (output.equals(""))
            output = String.valueOf(number);

        System.out.println(output);
    }
}
