package com.syntax.class011;

public class RecapTask010AnotherWay {

    public static void main(String[] args) {

        // Write a java program to find the second largest number


        int[] array = {10, 9, 20, 30, 29186, 45};

        int maxNum = array[0];
        int secondLargest = array[0];

        for (int num : array) {
            if (num > maxNum) {
                maxNum = num;

            }
            if (num > secondLargest && secondLargest < maxNum && num < maxNum) {
                secondLargest = num;
            }
        }
        System.out.println("Maximum number of the array is " + maxNum);
        System.out.println("Second max number of the array is " + secondLargest);


    }
}