package com.syntax.class007;

public class Task01 {

    public static void main(String[] args) {

        // 1 to 100

        int num1 = 1;
        while (num1 <= 100) {
            System.out.print(num1 + " ");
            num1++;
        }

        System.out.println(" ");
        System.out.println("--------------------------------");

        // 100 to 1


        int num2 = 100;
        while (num2 >= 1) {
            System.out.print(num2 + " ");
            num2--;
        }

        System.out.println(" ");
        System.out.println("--------------------------------");

        //even numbers 20 to 100

        int num3 = 20;
        while (num3 <= 100) {
            System.out.print(num3 + " ");
            num3 += 2;
        }

        System.out.println(" ");
        System.out.println("--------------------------------");


        // Odd numbers 100 to 1

        int num4 = 99;
        while (num4 >= 1) {
            System.out.print(num4 + " ");
            num4 -= 2;
        }

        System.out.println(" ");
        System.out.println("--------------------------------");

        // OR WITH IF STATEMENT

        int num5 = 100;
        while (num5 >= 1) {
            if (num5 % 2 != 0) {
                System.out.print(num5 + " ");
            }
            num5--;
        }

    }

}
