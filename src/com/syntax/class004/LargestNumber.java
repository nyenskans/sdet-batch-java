package com.syntax.class004;

public class LargestNumber {

    public static void main(String[] args) {


        /*3. Write a program to find largest number among three numbers using
         *nested if provided by a user (numbers must be distinct)
         */

        int num1 = 281;
        int num2 = 312395;
        int num3 = 34115;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the largest number among these three numbers");
            } else if (num1 < num3) {
                System.out.println(num3 + " is the largest number among these three numbers");

            }


        } else if (num2 > num1) {
            if (num2 > num3) {
                System.out.println(num2 + " is the largest number among these three numbers");
            } else if (num3 > num2) {
                System.out.println(num3 + " is the largest number among these three numbers");
            }

        }


    }
}