package com.syntax.class008;

public class ContinueKeyword {

    public static void main(String[] args) {

        // Continue can be used in any loop

        // skips current execution/iteration

        for (int i = 1; i <= 5; i++) {

            if (i == 2) {

                continue; // skips the execution of code when i=2

            }

            System.out.print(i + " ");
        }


        System.out.println("");


        // Print numbers 1 to 10 except numbers 5&7


        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }


    }
}