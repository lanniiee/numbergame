package com.nology.numbergame;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        int lives = 10;

        Random rand = new Random();
        int min = 1;
        int max = 100;
        int num = rand.nextInt((max - min) + 1) + min;

        ArrayList<Integer> guessedNumbers = new ArrayList<>();

        for (int i = 10; i > 0 ; i--) {
            System.out.println("Enter your guess");
            int userGuess = myScan.nextInt();
            int difference = Math.abs(userGuess - num);

            if (!guessedNumbers.contains(userGuess)) {
                guessedNumbers.add(userGuess);
                if (userGuess == num) {
                    System.out.println("You have guessed correctly!");
                    System.out.println("Actual number: " + num);
                    i = 0;
                } else if (difference <= 3) {
                    lives -= 1;
                    System.out.println("Very very warm");
                    System.out.println("lives remaining: " + lives);
                } else if (difference <= 6) {
                    lives -= 1;
                    System.out.println("Very warm");
                    System.out.println("lives remaining: " + lives);
                } else if (difference <= 10) {
                    lives -= 1;
                    System.out.println("Warm");
                    System.out.println("lives remaining: " + lives);
                } else if (difference <= 16) {
                    lives -= 1;
                    System.out.println("Cold");
                    System.out.println("lives remaining: " + lives);
                } else if (difference <= 21) {
                    lives -= 1;
                    System.out.println("Very Cold");
                    System.out.println("lives remaining: " + lives);
                } else if (difference <= 25) {
                    lives -= 1;
                    System.out.println("Freezing");
                    System.out.println("lives remaining: " + lives);
                } else if (difference <= 30) {
                    lives -= 1;
                    System.out.println("Artic");
                    System.out.println("lives remaining: " + lives);
                }
                else {
                    lives -= 1;
                    System.out.println("No where near..");
                    System.out.println("lives remaining: " + lives);
                }
                if (lives == 0) {
                    System.out.println("Game over! The number was " + num);
                }
            }
            else {
                System.out.println("You have already used this number! Try Again.");
            }
        }
    }
}
