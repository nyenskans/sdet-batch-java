package com.syntax.class003;

public class AdditionOrConcatenation {

    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        String c = "Hello";
        String d = "Hi";

        System.out.println(a + b + c + d); //30HelloHi
        System.out.println(a + c + b + d); //10Hello20Hi

        System.out.println(c + d + a + b); //HelloHi1020
        /*
         * Java executes code top down and left to right,
         * so for c+d+a+b it concatenates c(string)+d(string)=string + a(int)
         * = string + b(int) = string
         *
         */

        System.out.println(c + d + (a + b)); //HelloHi30


        boolean boo = true;
        System.out.println(c + boo);
        //As long as one variable is of String type, we can concatenate boolean to it


        // Operators
        /*
         * Assignment operator =
         */

        /*
         * Arithmetic operators
         * +, -, *,/, %
         */


        /*
         * Shorthand (compound) operators
         */


    }

}
