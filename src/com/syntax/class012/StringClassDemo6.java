package com.syntax.class012;

public class StringClassDemo6 {

    public static void main(String[] args) {

        // This is how we use a method to get an index of a specific character within a string
        // or complete words within a string

        String str = "I am always confused";
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(' '));
        System.out.println(str.indexOf("am")); // output is index of the beginning of the word
        System.out.println(str.indexOf("always")); // output is index of the beginning of the word
        System.out.println(str.indexOf('z')); // output is always -1 when the character isn't present


        // If we want to use a part of one string in another string

        String str1 = "Java is easy";
        String str2 = str1.substring(0, 4); // starting and ending index we want to copy
        System.out.println(str2);


    }

}
