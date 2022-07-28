package com.syntax.class013;

public class StringDemo07 {

    public static void main(String[] args) {

        String str = "Batch 13 is great but I say this to every batch.";

        str.length(); //has no output unlike void method we created
        int length = str.length();
        System.out.println(length);
        //or
        System.out.println(str.length());


        System.out.println(str.toUpperCase());

        // We see output but it doesn't change the value of the variable

        System.out.println(str); // output is original string in lower case

        str = str.toUpperCase(); // we reassign and now it is permanently changed to upper case
        System.out.println(str);


        // This behaviour is specific to String type variables --> they have to be reassigned first
        // String is inmutible


        System.out.println(str.isEmpty()); // output is boolean value --> false


        str = ""; // reassigned

        System.out.println(str.isEmpty()); //Output is true

        String str2 = "  Katarina   Susic   ";
        str2 = str2.trim();
        System.out.println(str2); // removes spaces before and after string


        str = "Batch 13 is great but I say this to every batch.";
        System.out.println(str.contains("b")); // Output is boolean value
        // values can be string or char

        System.out.println("------------------------------------------------------");

        System.out.println(str.startsWith("Batch"));
        System.out.println(str.endsWith("great"));


    }

}
