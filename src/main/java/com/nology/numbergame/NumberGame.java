package com.nology.numbergame;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        int lives = 9;

        Random rand = new Random();
        int min = 1;
        int max = 100;
        int num = rand.nextInt((max - min) + 1) + min;

        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Enter your guess");
            int userGuess = myScan.nextInt();
            int difference = Math.abs(userGuess - num);
            System.out.println("lives remaining: " + lives);
            if (userGuess == num) {
                System.out.println("You have guessed correctly!");
                System.out.println("Actual number: " + num);
                i=10;
            } else if (difference <= 3) {
                System.out.println("Very very warm");
                lives -= 1;
            } else if (difference <= 6) {
                System.out.println("Very warm");
                lives -= 1;
            } else if (difference <= 10) {
                System.out.println("Warm");
                lives -= 1;
            } else if (difference <= 16) {
                System.out.println("Cold");
                lives -= 1;
            } else if (difference <= 21) {
                System.out.println("Very Cold");
                lives -= 1;
            } else if (difference <= 25) {
                System.out.println("Freezing");
                lives -= 1;
            } else if (difference <= 30) {
                System.out.println("Artic");
                lives -= 1;
            }
            else {
                System.out.println("No where near..");
                lives -= 1;
            }
        }

    }
}
