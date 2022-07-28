package com.syntax.class029;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

     /*   // we are converting array list to linkedHashSet to remove duplicates

        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>(); //creating a set
        linkedHashSet.addAll(numbers);                              //adding all elements from arraylist to the set
        numbers=new ArrayList<>();                  // we create another array(not to mix it with the previous arraylist)
        numbers.addAll(linkedHashSet);              // adding unique elements--> linkedHashSet gets rid of duplicates while keeping the
                                        //insertion order
        */

        //This is a preferred way  of doing it:
        // passing a list into a constructor of the set and java makes a set out of that list
        // we can use the same approach to convert it back
          numbers=new ArrayList<>(new LinkedHashSet<>(numbers));


    }
}
