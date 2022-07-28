package com.syntax.class009;

public class Task2 {
    public static void main(String[] args) {


        String[] words = {"Java", "Saturday", "Day", "coding", "is"};
        System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);


        System.out.println("----------------------------------");

        // Retrieve length

        int elements = words.length;
        System.out.println("Length of array words is " + elements);


        System.out.println("----------------------------------");


        // Print out each element of array words

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " ");
        }
        System.out.println("The end");


    }
}
