package com.syntax.class012;

public class StringClassDemo03 {

    public static void main(String[] args) {

        String str = "Batch 13 is Great";
        System.out.println(str.startsWith("Batch"));
        // Method to see if a string starts with a specific character or word
        //output is true/false
        System.out.println(str.endsWith("t"));
        // Method to see if a string starts with a specific character or word
        //output is true/false

        System.out.println(str.toLowerCase().endsWith("great"));
        // chaining methods--> using one method then another

        //the methods do not make permanent changes to original strings // String doesn't allow it
        // unless we reassign them

        System.out.println(str.toLowerCase().contains("13"));

        String name = "LOKAC";
        System.out.println(name.toLowerCase());
        System.out.println(name);
        name.toLowerCase();

        System.out.println("----------------------------");

        String query = "13";
        System.out.println(str.contains(query));
        System.out.println(str.contains("is"));

        System.out.println("----------------------------");


        String name1 = "kat";
        String name2 = "Kat";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));

        String userName = "admin";
        String password = "pass123";
        String confirmPassword = "pass123";


    }

}
