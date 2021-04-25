package com.codewithmosh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Age: 20");
         Scanner scanner = new Scanner(System.in);
         byte age = scanner.nextByte();
        System.out.println("You are " + age);
    }
}
