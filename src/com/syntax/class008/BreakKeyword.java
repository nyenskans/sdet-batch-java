package com.syntax.class008;

public class BreakKeyword {

    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello");
        }


        // Infinite loop without break
        boolean summer = true;

        while (summer) {
            System.out.println("It is hot");
            break;
        }

        // With break the loop executes only once


        // Break statement stops the execution of the code
        // In this example it makes java exit the body of the loop


        // We mostly use break within a condition in a loop:


        for (int i = 1; i <= 5; i++) {

            System.out.println("Hi");

            if (i == 2) {
                break;
            }
        }

        System.out.println("--------------");

        boolean winter = true;
        int temp = 70;

        while (winter) {
            System.out.println("It is cold");
            if (temp > 65) {
                System.out.println("It is not cold anymore");
                break;
            }
            temp -= 10;
        }


    }

}
