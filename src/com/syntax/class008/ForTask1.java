package com.syntax.class008;

public class ForTask1 {

    public static void main(String[] args) {


        // 1 to 100

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //100 to 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //Print even numbers from 20 to 1 (2 ways)
        for (int i = 20; i >= 1; i -= 2) {
            System.out.print(i + " ");

        }
        System.out.println("");

        //	Other way

        for (int i = 20; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");


        //Print odd numbers from 20 to 50 (2 ways)

        for (int i = 21; i <= 50; i += 2) {
            System.out.print(i + " ");

        }

        System.out.println("");

        // Other way

        for (int i = 21; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
