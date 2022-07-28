package com.syntax.class026;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // we want to store name variables
        // as the information grows, we need a better way to store
        // if it's a lot of same data type values we can use an array
        String name="Aladin";
        String name2="Marko";
        String name3="Biba";
        String[] names={"Aladin", "Marko", "Biba"};
        // *max num of elements in an array is int
        // String[] names=new String[size]; size cannot be long or float

        // We can add elements to an array but it takes a lot of code
        System.out.println(names.length);
        names=new String[4];
        names[0]="Aladin";
        names[1]="Marko";
        names[2]="Biba";
        names[3]="Loki";

        System.out.println(names.length);

        // this is a way to create a larger array, but it is a lot of typing, and it's not manageable for
        // a large amount of data
        // Solution to this problem are arraylists
        // When we create them, we do not need to specify the size
        // Array list is a class, and we create an object of that class:

     //   Syntax:

        ArrayList<String>syntaxStudents=new ArrayList<>();
        // class name ArrayList <data type> list name=new Class name ArrayList

        // In array lists we use .size() instead .length()
        syntaxStudents.add( "Lokac");
        syntaxStudents.add("Risko");

        System.out.println(syntaxStudents.size());




    }
}
