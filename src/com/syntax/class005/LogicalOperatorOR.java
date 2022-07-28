package com.syntax.class005;

import java.util.Scanner;

public class LogicalOperatorOR {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //		OR	||

        //True  || true	  -> TRUE
        //True  || false   -> TRUE
        //false || true	  -> TRUE
        //False || false  -> FALSE

        //At least one condition has to be true (satisfied)




        /* Monday&Friday- no class
         * Tuesday&Wednesday-Manual testing
         * Thursday- review
         * Sat&Sun- Java
         */
        System.out.println("Enter any day of the week");
        String day = input.next();

        if (day.equalsIgnoreCase("Monday") || day.equals("Friday")) {
            System.out.println("Today we have no class");

        } else if (day.equalsIgnoreCase("Tuesday") || day.equals("Wednesday")) {
            System.out.println("Today we have Manual testing class");

        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Today we have Review class");

        } else if (day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
            System.out.println("Today we have Java class");

        } else {
            System.out.println("Invalid entry");
        }


        System.out.println("------------------------------");


        int num1 = 20;
        int num2 = 10;
        int num3 = 30;

        if (num1 > num2 || num1 > num3) {

            System.out.println("The larger number is " + num1);

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("The larger number is " + num2);

        } else if (num3 > num1 && num3 > num2)
            System.out.println("The larger number is " + num3);

        System.out.println("-------------------");


        boolean cloudy = false;
        boolean cold = true;

        if (cloudy || cold) {
            System.out.println("I'm not going to the beach");
        }


    }

}
