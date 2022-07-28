package com.syntax.class007;

public class WhileLoopExamples {

    public static void main(String[] args) {

        //	Print numbers 1 to 10

        int num1 = 1;

        while (num1 <= 10) {
            System.out.print(num1 + " "); // same row with spaces
            num1++;
        }
        System.out.println();
        System.out.println("----------------");


        int num2 = 1;

        while (num2 <= 10) {

            num2++; //output is 2 to 11

            System.out.println(num2 + " "); // same row with spaces
        }
        System.out.println();
        System.out.println("----------------");


        //	Print numbers 10-100

        int a = 10;
        while (a <= 100) {
            System.out.print(a + " ");
            a++;
        }


        System.out.println();
        System.out.println("----------------");

        // Print numbers 10 to 1

        int b = 10;
        while (b <= 10 && b >= 1) {
            System.out.print(b + " ");

            b--;
        }
        System.out.println();
        System.out.println("----------------");


        //100 to 50

        int c = 100;
        while (c >= 50) {
            System.out.print(c + " ");

            c--;
        }

        System.out.println();
        System.out.println("----------------");


        // 1 to 20, only even numbers


        int d = 2;
        while (d <= 20) {
            System.out.print(d + " ");

            d += 2;
        }

        System.out.println();
        System.out.println("----------------------------------");


        // 1 to 20, only even numbers


        int e = 1;
        System.out.println();
        while (e <= 20) {
            if (e % 2 == 0) {
                System.out.print(e + " ");
            }
            e++;
        }


    }

}
