package com.syntax.class004;

public class MoreNestedIf {

    public static void main(String[] args) {

        /*Check if repl homework done
         *if >15+ is done, say "Great job"
         *>10 "good"
         *<10 "Try to do all"
         */
        boolean didRepl = true;
        int tasks = 10;

        if (didRepl) {
            System.out.println("How many assignments have you done?");
            if (tasks > 15) {
                System.out.println("Great job");
            } else if (tasks > 10) {
                System.out.println("Not bad");
            } else {
                System.out.println("Try to do more");
            }


        } else {
            System.out.println("Do your Repl homework");
        }
    }

}
