package com.nology.numbergame;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your guess");
        int userGuess = myScan.nextInt();

        Random rand = new Random();
        int min = 1;
        int max = 100;
        int num = rand.nextInt((max - min) + 1) + min;

        int difference = Math.abs(userGuess - num);

        if (userGuess == num) {
            System.out.println("You have guessed correctly!");
            System.out.println("Actual number: " + num);
        }
        if (difference <= 3) {
            System.out.println("Very very warm");
            System.out.println("Try Again");
            int userGuess2 = myScan.nextInt();
        }
        if (difference <= 6) {
            System.out.println("Very warm");
            System.out.println("Try Again");
            int userGuess3 = myScan.nextInt();
        }
        if (difference <= 10) {
            System.out.println("Warm");
            System.out.println("Try Again");
            int userGuess4 = myScan.nextInt();
        }
        if (difference <= 16) {
            System.out.println("Cold");
            System.out.println("Try Again");
            int userGuess5 = myScan.nextInt();
        }
        if (difference <= 21) {
            System.out.println("Very Cold");
            System.out.println("Try Again");
            int userGuess6 = myScan.nextInt();
        }
        if (difference <= 25) {
            System.out.println("Freezing");
            System.out.println("Try Again");
            int userGuess7 = myScan.nextInt();
        }
        if (difference <= 30) {
            System.out.println("Artic");
            System.out.println("Try Again");
            int userGuess8 = myScan.nextInt();
        }
        else {
            System.out.println("No where near..");
            System.out.println("Try Again");
            int userGuess9 = myScan.nextInt();
        }

    }
}
