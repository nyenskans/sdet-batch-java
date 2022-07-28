package com.syntax.class015;

public class ArrayUtils {

    // write a method that will print out all the elements of an array

    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }


}
