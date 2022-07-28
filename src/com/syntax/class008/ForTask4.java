package com.syntax.class008;

import java.util.Scanner;

public class ForTask4 {

    public static void main(String[] args) {

		
		/*
		
		1. Print numbers from 1 to 50 except those that are divisible by 3


2. Create a program that will keep asking user to apply for a credit card.
 As soon you get “yes” from a user program should stop asking.

		
		*/


        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0) {
                System.out.println();
                continue;
            }
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("-----------------");

        do {
            System.out.println("Apply for a credit card");
            answer = input.next();
        } while (answer.equalsIgnoreCase("no"));
        ;


    }


}
