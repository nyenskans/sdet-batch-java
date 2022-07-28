package com.syntax.class005;

import java.util.Scanner;

public class Task2CCLimitString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a credit card");

        String creditCard = scan.next();

        if (creditCard.equalsIgnoreCase("no")) { // Takes both 'No' and 'no' for an answer

            System.out.println("We will offer you a credit card");

        } else if (creditCard.equals("yes")) {

            System.out.println("What is your balance");

            int balance = scan.nextInt();

            if (balance > 1000) {
                System.out.println("You have to pay off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }


    }
}
