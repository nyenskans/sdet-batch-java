package com.syntax.class026;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Loki");
        names.add("Risko");
        names.add("Tedi");
        names.add("Bobiska");
        names.remove("Risko"); // remove a name - String
        System.out.println(names);
        names.remove(2); // remove an element from a certain index
        System.out.println(names);

        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual testing");
        subjects.add("Java");
        subjects.add("GIT");
        subjects.add("Selenium");

        subjects.indexOf("GIT"); // we weren't able to find the index of an element in an array,
                                // but we can do it in ArrayList
                                // we used this method in String class
        System.out.println("subjects = " + subjects); //soutv is the shortcut to print out array/arraylist/variables
// shift shift-->live templates


    }
}
