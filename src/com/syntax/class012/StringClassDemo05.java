package com.syntax.class012;

public class StringClassDemo05 {

    public static void main(String[] args) {

        // We use for loop to access all the elements of the String str (since that is
        // an array of characters)
        // We use if condition to count the appearance a specific characters in that
        // (array of characters) String

        String str = "123456411651678415";

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                counter++;
            }
        }
        System.out.println(counter);

    }
}