package com.syntax.class005;

import java.util.Scanner;

public class Task2CCLimitBoolean {

    public static void main(String[] args) {

        /*
         * Create a Java program that will ask if user has a credit card or not. If you
         * user does not have a credit card then offer them. If they do have one ask
         * what is balance on the card? If balance of the card is larger than 1000, tell
         * them to pay off immediately, otherwise you can tell them that they can spend
         * more.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a credit card?");
        boolean cc = input.nextBoolean();

        if (cc) {
            System.out.println("What is the balance on your credit card");
            int balance = input.nextInt();

            if (balance > 1000) {
                System.out.println("Pay the balance off immediately");
            } else {
                System.out.println("Your limit hasn't been met, you can spend more");
            }
        } else {
            System.out.println("We would like to offer you a credit card");
        }

    }
}
