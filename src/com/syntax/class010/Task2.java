package com.syntax.class010;

public class Task2 {

    public static void main(String[] args) {

        //	Create an array to store char values and then print those in reverse order

        char[] characters = {'#', '$', '&', '^', 'a', '!', 'z'};

        char lastChar = ' ';
        for (int i = characters.length - 1; i >= 0; i--) {
            // starting point is the last element of array
            // last element's index is always .length-1
            // i>=0 is the condition because the lowest index is 0- first elements'index
            // i-- because we are going last to first

            lastChar = characters[i];

            System.out.print(lastChar + " ");

            // Or just System.out.print(characters[i] + " "); instead of lines 18 and 20

        }


    }
}