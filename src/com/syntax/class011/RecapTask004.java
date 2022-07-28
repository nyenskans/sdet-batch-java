package com.syntax.class011;

public class RecapTask004 {

    public static void main(String[] args) {

//		Create a 2D array or integer type where you will store odd and even numbers.
        //	Develop a program which will identify/print the even numbers only.

        int[][] numbers = {{2, 4, 3, 1, 44}, {80, 5, 45, 23, 67}};


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println("Even number " + numbers[i][j]);
                } else {
                    System.out.println("Odd number " + numbers[i][j]);
                }
            }
        }

    }

}
