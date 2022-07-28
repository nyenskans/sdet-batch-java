package com.syntax.class002;

public class Variables {

    public static void main(String[] args) {

        //a)

        String name = "Katarina";
        String lastName = "Susic";
        char grade = 'A';
        String city = "Miami";
        String state = "Florida";
        String phoneNumber = "123-456-7890";

        System.out.println("My name is " + name + " and my last name is " + lastName + ".");
        System.out.println("I am an " + grade + " student.");
        System.out.println("I live in " + city + " and state " + state);
        System.out.println("And my phone number is " + phoneNumber);

        name = "Anna";
        lastName = "Smith";
        grade = 'B';
        city = "NYC";
        state = "NY";
        phoneNumber = "098-765-4321";
        System.out.println("My name is " + name + " and I moved to new city " + city + " and new state " + state);
        System.out.println("And my new phone number is " + phoneNumber);


    }

}
