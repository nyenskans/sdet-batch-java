package com.syntax.class007;

import java.util.Scanner;

public class LoopWithScanner {

    public static void main(String[] args) {

        /*
         * We will keep asking if you got a job until you say yes then we'll say -
         * Congratulations!
         */

        Scanner input = new Scanner(System.in);
        String job;

        do {
            System.out.println("Did you get a job?");

            job = input.nextLine();

        } while (job.equalsIgnoreCase("no"));
        System.out.println("Congratulations");


        // Same using while loop


        Scanner input1 = new Scanner(System.in);
        String job1 = "";

        System.out.println("Did you get a job?");
        job1 = input1.nextLine();


        while (!job1.equalsIgnoreCase("yes")) {

            System.out.println("Did you get a job?");
            job1 = input1.nextLine();

        }
        System.out.println("Congratulations");


    }

}
