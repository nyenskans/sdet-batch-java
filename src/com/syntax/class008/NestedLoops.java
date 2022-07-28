package com.syntax.class008;

public class NestedLoops {

    public static void main(String[] args) {


        // NESTED LOOPS - loop inside another loop


        for (int i = 1; i <= 3; i++) {    // outer loop
            System.out.println("Hello");

            for (int y = 1; y <= 2; y++) {    //nested loop
                System.out.println("Bye");
            }
        }


        System.out.println("---------------------------");


        for (int i = 1; i <= 3; i++) { //outer loop controls inner loop

            System.out.println(i);

            for (int y = 1; y <= 2; y++) { //inner loop depends on inner loop

                System.out.println(y);
            }
        }


        System.out.println("---------------------------");


        for (int i = 1; i <= 3; i++) {


            for (int y = 1; y <= 2; y++) {

                System.out.println(i + " " + y);
            }
        }


        System.out.println("---------------------------");


        for (int i = 1; i <= 3; i++) {

            System.out.println("Hello");

            for (int y = 1; y >= 2; y++) { // inner condition false, inner loop never gets executed

                System.out.println("Bye");
            }
        }

        System.out.println("---------------------------");


        for (int i = 1; i > 3; i--) { // outer condition false, code not executed

            System.out.println("Hello");

            for (int y = 1; y <= 2; y++) {

                System.out.println("Bye");
            }
        }


        // 	THE CODE WILL GET EXECUTED AS MANY TIMES AS THE OUTER LOOP CONDITION IS TRUE
        // IN THE CASES ABOVE, OUTER LOOP CONDITION IS TRUE 3 TIMES,
        //SO THE INNER LOOP GET A CHANCE 3 TIMES TO EVALUATE AS TRUE (OR NOT)
        int f = 0;
        int e;
        for (int i = 0; i <= 2; i++) {
            for (int x = 0; x < 4; x++) {
                for (e = 0; e <= 5; e++) {
                    for (f = 0; f <= 9; f++) {

                    }
                }
                System.out.println(i + x + ":" + e + f);
            }

        }


    }

}
