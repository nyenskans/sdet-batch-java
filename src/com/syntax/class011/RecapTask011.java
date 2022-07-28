package com.syntax.class011;

public class RecapTask011 {

    public static void main(String[] args) {

//		Write a program to print out duplicate elements from
//		an Array of Strings?


        // WE CAN USE NESTED FOR LOOPS FOR A 1D ARRAY BECAUSE WE ARE COMPARING ELEMENTS ON DIFFERENT INDEXES AT THE SAME TIME
        // AND WE CANT COMPARE INDEX I TO I

        String[] array = {"AA", "B", "C", "A", "B"};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) { // if we only want to print the element once: int j=i+1
                if (array[i].equalsIgnoreCase(array[j]) && i != j) { // i!=j because we don't want to compare same element with the same element
                    System.out.println(array[i]);
                }
            }

        }


    }
}