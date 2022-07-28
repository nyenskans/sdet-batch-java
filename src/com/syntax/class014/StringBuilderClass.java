package com.syntax.class014;

public class StringBuilderClass {

    public static void main(String[] args) {


        String s1 = new String("I am a student");
        System.out.println(s1.toUpperCase());
        StringBuilder st = new StringBuilder("I am a syntax student");
        System.out.println(st.reverse());

        //String and string builder are both classes which we can use to store and manipulate characters



        /*
         * How would you reverse a String word by word? for example // input=>This is
         * sentence i want to reverse // output=>sihT si ecnetnes i tnaw ot esrever
         */

        String str = "This is sentence I want to reverse";

        String[] arr = str.split(" "); // split method creates an array where each word is at a separate index

        // advanced for loop
        // we create new variable String s(each element of array arr

        for (String s : arr) {
            System.out.print(new StringBuilder(s).reverse() + " "); // reverses words but leaves them in order


        }

    }
}