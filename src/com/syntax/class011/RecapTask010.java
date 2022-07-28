package com.syntax.class011;

import java.util.Arrays;

public class RecapTask010 {

    public static void main(String[] args) {

        // Write a java program to find the second largest number

        int[] array = {90, 88, 284, 424, 2, 5643, 67};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array); //method to sort an array's in elements in order
        System.out.println(array[0]); // 1st element in the sorted array
        System.out.println("Largest element is " + array[array.length - 1]); // largest (last element's index--> always length-1)
        System.out.println("Second largest element is " + array[array.length - 2]); // second largest

    }
}