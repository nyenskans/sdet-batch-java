package com.syntax.class008;

import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

		/*
		Declare a secret number
		Ask user to guess
		Your code should keep asking to guess until user gets it
		Once user guesses it, say You got it!
	*/


        Scanner input = new Scanner(System.in);
        int secretNum = 9;
        int guessedNum;
        do {
            System.out.println("Guess my secret number");
            guessedNum = input.nextInt();
        } while (guessedNum != secretNum);
        System.out.println("You got it!");

    }

}
