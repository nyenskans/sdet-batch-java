package com.syntax.class009;

public class Homework1 {

    public static void main(String[] args) {
        //	Create an array of animals and store 5 elements into it.
        // Using 2 different loops print all elements from the array.

        String[] animals = {"dog", "zebra", "cat", "elephant", "lion"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals);

        }
    }

}
