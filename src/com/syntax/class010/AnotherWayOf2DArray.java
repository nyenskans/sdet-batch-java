package com.syntax.class010;

public class AnotherWayOf2DArray {

    public static void main(String[] args) {
// 2D array of us

        String[][] usa = {{"NYC", "Syracuse", "Albany"},
                {"San Diego", "Santa Monica", "San Jose", "LA", "San Francisco"},
                {"Palm Beach", "Miami", "Tampa", "Sarasota"},
                {"Richmond", "Leesburg", "McLean"},
        };


        usa[0][0] = "NYC";
        usa[0][1] = "Syracuse";

        System.out.println(usa[1][2]); // San Jose
        System.out.println(usa[2][1]); //Miami


        System.out.println("Number of arrays within array usa is " + usa.length); // 4 -> number of arrays within usa array

        System.out.println("The number of elements in New York array is " + usa[0].length);

        int elements2array = usa[1].length;
        System.out.println("The number of elements in California array is " + elements2array);


    }

}
