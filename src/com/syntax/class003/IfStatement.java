package com.syntax.class003;

public class IfStatement {

    public static void main(String[] args) {

        /*
         * declare a variable rate If the mortgage rate is more than 5% -->I'm not
         * buying a house
         */
        double mortgageRate = 5.5;

        if (mortgageRate > 5) {
            System.out.println("I'm not buying a house");
        }

        double mortgageRate1 = 4.5;

        if (mortgageRate1 > 5) {
            System.out.println("I'm not buying a house");
        }
        // Does not execute the code because the condition is false


        System.out.println("-------------------------------");


        int num1 = 99;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        }

        int num3 = 99;
        int num4 = 100;
        if (num3 > num4) {
            System.out.println(num1 + " is bigger than " + num2);
        }
        // Condition is false so the code in If block of code is not being executed


        System.out.println("-------------------------------");


        // declare temperature, if >75, I'll go for a walk
        int temp = 100;
        if (temp > 75) {
            System.out.println("I'll go for a walk");
        }
        int temp1 = 60;
        if (temp1 > 75) {
            System.out.println("I'll go for a walk");
            // Condition is false so the code in If block of code is not being executed

        }

        // Condition true- executes if code
        int temp2 = 78;
        if (temp2 > 75) {
            System.out.println("I'll go for a walk");
        } else {
            System.out.println("I'm going to study");
        }

        // Condition false- executes else code
        temp2 = 68;
        if (temp2 > 75) {
            System.out.println("I'll go for a walk");
        } else {
            System.out.println("I'm going to study");
        }


        System.out.println("-------------------------------");


        char gender = 'f';
        if (gender == 'f') { // condition true, execute if block of code
            System.out.println("You like shopping");
        } else {
            System.out.println("You like watching sports");
        }

        gender = 'm';
        if (gender == 'f') { // condition false, execute else block of code
            System.out.println("You like shopping");
        } else {
            System.out.println("You like watching sports");
        }

        System.out.println("-------------------------------");

        //
        String browser = "chrome";
        if (browser.equals("chrome")) {
            System.out.println("All test cases will be executed in Chrome");
        } else {
            System.out.println("Not executing any test cases");
        }
        System.out.println("-------------------------------");

        browser = "Chrome";
        if (browser.equals("chrome")) {
            System.out.println("All test cases will be executed in Chrome");
        } else {
            System.out.println("Not executing any test cases");
        }
        System.out.println("-------------------------------");

        ////// cmnd+shift+f to format code //////////////

        String time = "Morning";
        if (time.equals("Morning")) {
            System.out.println("Good morning");

        } else {
            System.out.println("Good day");
        }
        System.out.println("End of code");

    }

}
