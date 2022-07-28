package com.syntax.class028;

public class ListDemo1 {
    public static void main(String[] args) {

        //Class Object is the root of the class hierarchy.
        // Every class has Object as a superclass.
        // All objects, including arrays, implement the methods of this class

        // we can store different data type in a same array of objects,
        // although it's not a good practice
        Object[] arr = {"Hamid", 10.2, "Name"}; // bad programming
        // we shouldn't do this

        for (Object obj : arr) {
            //instanceof keyword checks if a variable contains a specific type of object

            //verifying if the object is of type string before performing an operation:
            if (obj instanceof String)
                System.out.println(((String) obj).length());
            // we have to cast the object back into string

        }
    }
}
