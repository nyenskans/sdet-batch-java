package com.syntax.class012;

public class StringClassDemo02 {

    public static void main(String[] args) {

        String captain = "LOKI";
        System.out.println(captain.toLowerCase());
        captain = "I love Java";
        System.out.println(captain.toUpperCase());

        String firstName = "Loki";
        String lastName = "Pecikoza";
        String fullName = firstName + lastName;

        String fullName2 = firstName.concat(lastName); // never use this
        System.out.println(fullName);
        System.out.println(fullName2);

        String name = "";
        System.out.println(name.isEmpty());
        // output is true/ false

        // System.out.println(name.isBlank()); // it doesn't work in older version of
        // eclipse

        String str = " never ";
        System.out.println(str.trim()); // it removes spaces only before and after 'never'

    }

}
