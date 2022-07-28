package com.syntax.class008;

public class ForTask3 {

    public static void main(String[] args) {

        // Find sum of all even and all odd numbers from 1 to 70
        int sum = 0;
        for (int i = 1; i <= 70; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);

        int sum1 = 0;
        for (int i = 1; i <= 70; i++) {
            if (i % 2 != 0) {
                sum1 += i;
            }

        }
        System.out.println(sum1);


        // WITHOUT IF CONDITION

        int sum3 = 0;
        for (int i = 2; i <= 70; i += 2) {
            sum3 += i;

        }
        System.out.println(sum3);


        int sum4 = 0;
        for (int i = 1; i <= 70; i += 2) {
            sum4 += i;

        }
        System.out.println(sum4);


        // ANOTHER WAY USING IF ELSE

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= 70; i++) {

            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of even numbers is " + sumEven);
        System.out.println("Sum of odd numbers is " + sumOdd);


        System.out.println("-----------------------------------------");


    }

}
