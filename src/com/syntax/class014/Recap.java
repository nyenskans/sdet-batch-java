package com.syntax.class014;

public class Recap {

    public static void main(String[] args) {

        String str = "I never forget about recording";
        System.out.println(str.replace("never", "always"));
        System.out.println(str.replace("never", "always").replace("I", "Asghar")); // replace multiple things at once


        str = "fioro387443(*&^%$";

        System.out.println(str.replaceAll("[0-9]", "")); // removing all the numbers from the string

        String str2 = "Batch 13 is great. Batch 13 is the best. Batch 13 is excellent. ";

        // To print these sentences separate:

        String[] arr = str2.split("[.]"); // we split the array based on the dot. We can do it based on other things

        System.out.println(arr[0]); //sentence 1
        System.out.println(arr[1]); // sentence 2
        System.out.println(arr[2]); // sentence 3


        String[] arr2 = str2.split(" ");  // we split the array based on space
        System.out.println(arr2[0]); //word 1
        System.out.println(arr2[1]); // word 2
        System.out.println(arr2[2]); // word 3

        String str3 = "We #love# java";

        String[] arr3 = str3.split("[#]"); // we split the array based on #
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);


    }

}
