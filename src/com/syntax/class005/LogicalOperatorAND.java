package com.syntax.class005;

public class LogicalOperatorAND {

    public static void main(String[] args) {


        //	To test one or more conditions in one statement
        //instead of nested if

        //	AND &&

        //	True && true 	-> TRUE
        //	True && false	-> FALSE
        //	False && true	-> FALSE
        //	False && false	-> FALSE


        boolean job = true;
        double salary = 100000;

        if (job && salary >= 100000) {
            System.out.println("I am happy");

        } else {
            System.out.println("I am sad");
        }


        System.out.println("-------------------------");


        boolean study = true;
        boolean homework = true;
        boolean practice = true;

        if (study && homework && practice) {
            System.out.println("You will successfully complete the course");
        } else {
            System.out.println("You need to put in more work");
        }


        System.out.println("-------------------------");


        /*Write a program to find largest number among 3 numers using nested if
         * Numbers must be distinct
         */
        int num1 = 65;
        int num2 = 69;
        int num3 = 323;

        if (num1 > num2 && num1 > num3) {

            System.out.println("The largest number is " + num1);

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("The largest number is " + num2);

        } else if (num3 > num1 && num3 > num2)
            System.out.println("The largest number is " + num3);


        System.out.println("----------------------------");


        boolean sunny = false;
        boolean hot = true;

        if (sunny && hot) {
            System.out.println("I'm going to the beach");
        }
    }
}
