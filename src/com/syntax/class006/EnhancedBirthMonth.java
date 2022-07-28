package com.syntax.class006;

import java.util.Scanner;

public class EnhancedBirthMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth month");

        String birthMonth = input.next();
        String season;

        if (birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")) {

            season = "Spring";

        } else if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {

            season = "Summer";

        } else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {

            season = "Fall";

        } else if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")) {
            season = "Winter";

        } else {
            season = "Invalid";
            System.out.println("Invalid month");
        }

        if (!season.equals("Invalid")) {
            System.out.println("You were born in " + season);
        }
    }

}
