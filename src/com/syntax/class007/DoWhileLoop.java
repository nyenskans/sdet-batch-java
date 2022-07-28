package com.syntax.class007;

public class DoWhileLoop {

    public static void main(String[] args) {


        // WHILE LOOP CHECKS THE CONDITION FIRST
        // AND THEN ENTERS THE CODE IF THE CONDITION IS TRUE
        // USED A LOT MORE OFTEN


        int num = 1;

        while (num <= 3) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        System.out.println("-----------------");


        // DO LETS YOU ENTER THE BLOCK OF CODE AND EXECUTE THE BLOCK OF CODE
        //AND AFTER THAT CHECKS THE CONDITION

        int num1 = 1;

        do {
            System.out.print(num1 + " ");
            num1++;
        } while (num1 <= 3);


        System.out.println();
        System.out.println("-----------------");

        int num2 = 10;

        do {
            System.out.print(num2 + " ");
            num1++;
        } while (num2 <= 3);

        // Enters the block of code and executes the System.out.println
        // Increments the value of num1
        // Checks the condition
        // evaluates to false, doesn't go back to loop


        System.out.println();
        System.out.println("-----------------");


        // Print numbers 1 to 30 using Do while loop


        int num3 = 1;

        do {
            System.out.print(num3 + " ");
            num3++;
        } while (num3 <= 30);

        System.out.println();
        System.out.println("-----------------");

        // Even numbers from 70 to 30

        int num4 = 70;

        do {
            System.out.print(num4 + " ");
            num4 -= 2;
        } while (num4 >= 30);

        System.out.println();
        System.out.println("-----------------");


    }

}
