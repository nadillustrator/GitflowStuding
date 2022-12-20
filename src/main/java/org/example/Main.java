package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static Random random = new Random();
    public static void main(String[] args) {
        int guess = random.nextInt(10);
        System.out.println("Enter number from 0 to 9: ");
        int num = scanner.nextInt();
        while (num != guess) {
            System.out.println("Try one more time: ");
            num = scanner.nextInt();
        }
            System.out.println("Congratulations! You guessed! Number " + guess);
    }
}