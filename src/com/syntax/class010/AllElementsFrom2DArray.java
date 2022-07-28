package com.syntax.class010;

public class AllElementsFrom2DArray {

    public static void main(String[] args) {

        String[][] usa = {{"NYC", "Syracuse", "Albany"},
                {"San Diego", "Santa Monica", "San Jose", "LA", "San Francisco"},
                {"Palm Beach", "Miami", "Tampa", "Sarasota"},
                {"Richmond", "Leesburg", "McLean"},
        };

        // We use for nested loops to print out all elements

        //Outer loop iterates over rows->arrays
        //Inner loop iterates over columns->

        for (int row = 0; row < usa.length; row++) {
            for (int column = 0; column < usa[row].length; column++) {
                System.out.print(usa[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        for (String[] state : usa) {
            for (String city : state) {
                System.out.print(city + " ");
            }
            System.out.println();
        }

    }

}
