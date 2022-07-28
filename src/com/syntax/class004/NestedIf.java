package com.syntax.class004;

public class NestedIf {

    public static void main(String[] args) {

        /*
         * if(boolean expression-condition){ code A; if(boolean expression-condition2){
         * code b; } }
         *
         * Both codes will be executed only if both conditions are true
         *
         *
         * In nested if block of code we can have 0,1 or 2 lines of code executed
         *
         * If the first condition is false, none will be executed If the first condition
         * is true and second false, only code A will be executed If the first contition
         * is true and second is true, both codes A and B will be executed
         *
         */

        boolean vaccine = true;
        int dose = 2;
        if (vaccine) {
            System.out.println("How many doses have you received?");
            if (dose == 1) {// inner/nested if
                System.out.println("You need another shot");
            } else {// inner/nested else
                System.out.println("You are fully vaccinated");
            }
        } else {// outside of nested if
            System.out.println("You are not vaccinated");
        }

        System.out.println("----------------------------------");

        String month = "July";
        int day = 22;
        if (month.equals("May")) {
            System.out.println("Check today's date");
            if (day == 8) {
                System.out.println("Today is May 8th");
            } else {
                System.out.println("It is May " + day);
            }
        } else if (month.equals("June")) {
            System.out.println("Check today's date");
            if (day == 21) {
                System.out.println("Today is summer solstice");
            } else {
                System.out.println("It is June " + day);
            }
        } else {
            System.out.println("It is " + month + " " + day);
        }

    }

}
