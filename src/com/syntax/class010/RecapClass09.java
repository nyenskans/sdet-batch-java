package com.syntax.class010;

public class RecapClass09 {

    public static void main(String[] args) {

        String[] disney = {"Ariel", "Cinderella", "Belle", "Mulan"};
        System.out.println(disney[1]);

        // To get all elements from an array
        // Using regular for loop

        for (int i = 0; i < disney.length; i++) {
            System.out.println(disney[i]);
        }


        System.out.println("---------------------------------");

        // To get all elements from an array
        // Using enhanced for loop


        for (String character : disney) {
            System.out.println(character);
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < disney.length; i++) {
            if (disney[i].equals("Belle")) {
                System.out.println("This is my favorite character: " + disney[i] + " ");
            } else {
                System.out.println(disney[i] + ", ");

            }
        }
        System.out.println(" ");
        System.out.println("---------------------------------");


        for (String character : disney) {

            if (character.equals("Belle")) {
                continue;
            } else {
                System.out.print(character + ", ");

            }
        }


    }

}
