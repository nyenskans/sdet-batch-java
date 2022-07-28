package com.syntax.class010;

public class MoreExamples {

    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {199, 300, 588, 700},
                {1900, 4578, 98787}
        };



        /*
         * i loop iterates over rows
         * nums.length gives# of arrays inside 2D array=3
         * j loop iterates over columns
         */

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();

        }
        System.out.println("-------------------------");


        // ALL  VALUES USING ENHANCED for LOOP

        // outer for loop iterates over each array in 2D array
        // inner loop iterates over elements for each array


        for (int[] num : nums) {
            for (int n : num) {
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }
}