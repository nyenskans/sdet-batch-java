package com.syntax.class009;

public class Homework3 {

    public static void main(String[] args) {

        //	 Create an array of integers and calculate the sum of all elements in an array

        int sum = 0;

        int[] array = {2, 5, 41, 30, 11, 22, 67, 10};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);


    }
}
