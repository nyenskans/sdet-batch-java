package com.syntax.class011;

import java.util.Arrays;
import java.util.Scanner;

public class RecapTask001 {

    public static void main(String[] args) {

        // Using Scanner create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that
        // array.

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements do you want to store in the array");
        int arrayLength = input.nextInt();
        System.out.println("The length of the array is " + arrayLength);
        int[] array = new int[arrayLength];

        // Enhanced loop in this case we can't use
        // Because that one is used only for reading/retrieving and not for storing the values in an array
        int sum = 0;
        System.out.println("Enter the numbers to be stored");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();
            sum = sum + array[i];

        }
        // When we use Arrays.toString we only print the elements out, we don't store them in an array

        System.out.println("Your array is : " + Arrays.toString(array));
        System.out.println("The sum of all the elements of the array is " + sum);


// 		We could now use enhanced loop to calculate the sum instead of doing all in the previous for loop

//		int sum=0;
//		for(int element:array) {
//			sum+=element;
//		}
//		System.out.println("The sum of all the elements of the array is "+sum);

        input.close();


    }

}
