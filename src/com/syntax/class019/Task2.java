package com.syntax.class019;

public class Task2 {

    /*
        Create a method that will take a String as a parameter and returns reversed String.
        Method should be available to all classes within your project and accessible by class name.
        //this means
    */
    public static String reverseString(String str) {

        return new StringBuilder(str).reverse().toString(); //evaluate expression in debug mode
        // first convert to string builder
        //reverse the string builder
        //converting back to string
    }

    public static void main(String[] args) {
        String str = "Saturday";
        System.out.println(Task2.reverseString("Saturday"));
    }

}

