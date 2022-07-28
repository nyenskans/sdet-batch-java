package com.syntax.class002;

public class OperatorsInJava {

    @SuppressWarnings("unused")
    public static void main(String[] args) {


        //Assignment operator =

        //Arithmetic operators +, -, *, /, %,

        /*
         * Addition +;
         * Subtraction -;
         *
         */


        int num1 = 100;
        int num2 = 20;
        int sum, sub, mult, div;
        System.out.println(num1 + num2);

        sum = num1 + num2;
        System.out.println(sum);


        sub = num1 - num2;
        System.out.println(sub);

        mult = num1 * num2;
        System.out.println(mult);

        div = num1 / num2;
        System.out.println(div);


        double num3 = 9.23;
        double num4 = 3.50;
        double sub1, sum1, mult1, div1;
        sum1 = num3 + num4;
        System.out.println(sum1);

        int a = 10;
        int b = 3;
        int result = a / b;
        System.out.println(result); //prints out just 3

        double c = 10.0;
        double d = 3.0;
        double result1 = c / d;
        System.out.println(result1);


    }

}
