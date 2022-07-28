package com.syntax.class011;

public class StringClassDemo1 {

    public static void main(String[] args) {

        String name = new String("Katarina"); // Propper way of creating an object from a class
        // Whatever is in the parentheses is assigned to var name

        String name2 = "Katarina";
        // Shorter way of creating an object because string class is heavily used in java programming

        // All the classes in java can be treated as datatypes
        //If a class is present inside the same package or if a class belongs to java.lan package

        name.length();
        // name of the object . name of the method ()

        System.out.println(name.length());
        // This is a method length, unlike .length property within arrays


        name2 = "Nemanja";
        System.out.println(name2.length());


    }

}
