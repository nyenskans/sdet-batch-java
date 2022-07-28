package com.syntax.class009;

public class Homework0 {

    public static void main(String[] args) {

        //	Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.


        String[] cars = {"Toyota", "VW", "Lexus", "Mazda", "Ford", "BMW"};
        for (String car : cars) {
            System.out.println(car);
        }


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars);

        }
    }

}
