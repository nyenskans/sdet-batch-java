package com.syntax.class011;

public class RecapTask003 {

    public static void main(String[] args) {


        //	Create a 2D array of integer values. Print the sum of all numbers.

        int[][] array = {{1, 2, 3, 4},       // 10
                {44, 66},      // 110
                {6, 5, 4, 3, 2}, // 20
                {20, 30, 40}};// 90
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);


    }
}