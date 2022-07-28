package com.syntax.class009;

public class ArraysExamples {

    public static void main(String[] args) {


        // Store prices in an array

        double[] price = new double[6];

        price[1] = 1.99;
        price[2] = 3;

        System.out.println(price[0]);

        // We never specified the element with index 0 so it cannot print it
        // Output is 0.0
        // We specified the size of the array (which is fixed) ->  4 elements
        // By default compiler is filling up the empty space
        // and it always fills it up with a default value for each type
        // default value for double is always 0.0

        System.out.println("--------------------");

        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 12;
        //	numbers[3]=13;
        //	error: java.lang.ArrayIndexOutOfBoundsException - Index 3 out of bounds for length 3 ; when we run the code


        // Arrays are fixed in size
        // During runtime Java cannot increase/decrease a size of an array


    }

}
