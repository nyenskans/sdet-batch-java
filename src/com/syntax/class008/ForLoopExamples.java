package com.syntax.class008;

public class ForLoopExamples {

    public static void main(String[] args) {


        // Print numbers from 1 to 90

        for (int i = 1; i <= 90; i++) {
            System.out.print(i + " ");
        }

        /*
         * starting point;
         * ending point;
         * increment or decrement
         */

        System.out.println("");
        System.out.println("-----------------------------------------------");

        // 60 to 10

        for (int i = 60; i >= 10; i--) {
            System.out.print(i + " ");
        }


        for (int i = 5; i <= 40; i += 5) {
            System.out.println(i + " ");
        }
        // Output is every fifth number from 5 to 40


    }

}
