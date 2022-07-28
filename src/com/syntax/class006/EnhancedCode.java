package com.syntax.class006;

import java.util.Scanner;

public class EnhancedCode {

    public static void main(String[] args) {


        ////////Enhanced code from Homework 6, class 05


        Scanner input = new Scanner(System.in);

        System.out.println("Enter scores for quiz, mid term and final score respectivelly");

        int quiz = input.nextInt();
        int midTerm = input.nextInt();
        int finals = input.nextInt();

        int avgScore = (quiz + midTerm + finals) / 3;


        System.out.println("Your average score is " + avgScore);

        char grade;

        if (avgScore >= 90) {
            grade = 'A';
            //In this example we are storing the value of grades in this variable, so we can use it later in code

        } else if (avgScore >= 70 && avgScore <= 90) {

            grade = 'B';

        } else if (avgScore >= 50 && avgScore < 70) {

            grade = 'C';

        } else {
            grade = 'F';
        }
        System.out.println("You are a " + grade + " student.");


        if (grade == 'A' || grade == 'B') {

            System.out.println("You are doing great");

        } else {

            System.out.println("You should try to do better");

        }


    }


}
