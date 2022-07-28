package com.syntax.class004;

public class Task3 {

    public static void main(String[] args) {

        /*
         * Write a program to store a value whether user has diploma or not. If user has
         * a diploma, you should say congratulations, otherwise program should suggest
         * to get a degree. Then if user has a degree program should check a gpa score.
         * If gpa score is higher or equals to 3.5 → output should say “You are eligible
         * for scholarship”, otherwise → “You should have studied harder” .
         */

        boolean diploma = true;
        double gpaScore = 4;

        if (diploma) {
            System.out.println("Congratulations!");
            System.out.println("What is your gpa score?");

            if (gpaScore >= 3.5) {
                System.out.println("You are eligible for scholarship!");
            } else {
                System.out.println("You should have studied harder");
            }

        } else {
            System.out.println("You should get a degree");
        }
    }
}
