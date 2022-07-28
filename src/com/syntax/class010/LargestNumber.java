package com.syntax.class010;

public class LargestNumber {

    public static void main(String[] args) {

        //	From an array of integer elements find the largest number.

        int[] numbers = {4, 29, 653, 18, 44, 69, 1763, 98};


        int maxNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (maxNum < numbers[i]) {
                maxNum = numbers[i];

            }
        }
        System.out.println(maxNum);

        System.out.println("-------------------------");


        // Done with enhanced for loop


        int max = numbers[0];
        for (int num : numbers) {

            if (max < num) {
                max = num;
            }
        }
        System.out.println(max);


    }
}


