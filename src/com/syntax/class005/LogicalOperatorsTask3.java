package com.syntax.class005;

import java.util.Scanner;

public class LogicalOperatorsTask3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*Ask user to enter a number and then define if number is small, medium or large
         *Small number is value between 1 and 10
         *Medium number is value between 11 and 100
         *Large number is value between 101 and 1000
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number from 0 to 1000");

        int num = input.nextInt();

        if (num >= 1 && num <= 10) {
            System.out.println("The number is small");
        } else if (num > 10 && num <= 100) {
            System.out.println("The number is medium");
        } else if (num > 100 && num <= 1000) {
            System.out.println("The number is large");
        }
    }

}
