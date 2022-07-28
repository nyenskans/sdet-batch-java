package com.syntax.class020;

import com.syntax.class015.ArrayUtils;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 40}; // array with duplicate elements
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] removeDuplicates(int[] arr) { // arr is a parameter being passed into this method
        int[] duplicateElementsArray = new int[arr.length]; // creating a new array of the duplicates ( storing the duplicates we found in it
                                                             // we don't know the new length so we use the original's length
                                                              // we are including the counter to count the duplicates
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // so that it wouldn't take 1st element and compare it to first element
                if (arr[i] == arr[j]) { // we are looking for duplicates
                    duplicateElementsArray[i] = arr[i];
                    counter++;
                }
            }
        }
        int[] arr2 = new int[arr.length - counter]; // this is the length of the new array without duplicates
        int counter2=0;
        for(int e:arr){
        if(!isPresent(e,duplicateElementsArray)){
          arr2[counter2++]=e;

        }
    }
    return arr2;
    }

// now we check if an element is present in the array
    static boolean isPresent(int element, int[] arr) {
        for (int el : arr) {
            if (element == el) {
                return true;
            }
        }
            return false;
    }
}

