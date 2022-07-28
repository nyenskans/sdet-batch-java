package com.syntax.class006;

import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args) {

        //Ask a user where he is from
        //Based on the country define favorite food

        Scanner input = new Scanner(System.in);
        String country, favoriteFood;

        System.out.println("Where are you from");

        country = input.nextLine();

        switch (country) {
            case "Italy":
                favoriteFood = "Pasta";
                break;
            case "Mexico":
                favoriteFood = "Tacos";
                break;
            case "Serbia":
                favoriteFood = "Sarma";
                break;
            case "Turkey":
                favoriteFood = "Dolma";
                break;
            default:
                favoriteFood = "Not defined";
                break;    // break is optional within default
        }
        System.out.println("You are from " + country + " and your favorite food is " + favoriteFood);
    }

}
