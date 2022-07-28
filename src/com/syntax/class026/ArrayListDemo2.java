package com.syntax.class026;

import java.util.ArrayList;

public class ArrayListDemo2 {
    // Create an arrayList of numbers
    // Store all odd numbers from 1-10 in it
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(); // we get an error for int- it has to be integer
        // doesn't allow
        // arrayList is a class from Collection Framework which doesn't support primitive data type
        // for int primitive we have a class Integer
        // for double primitive we have a class Double, etc for all primitive data types

        for (int i = 1; i < 10; i+=2) {
         numbers.add(i);
        }
        System.out.println(numbers); // we don't need a loop to print out all the elements
    }


}
