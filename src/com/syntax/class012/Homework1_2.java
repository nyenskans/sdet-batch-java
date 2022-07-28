package com.syntax.class012;

public class Homework1_2 {

    public static void main(String[] args) {

        // Without scanner


        String father = "Sameer";
        String mother = "Taylor Swift";

        boolean gender = false; // if true girl else boy

        if (gender = false) { // boy case
            String firstHalf = father.substring(0, father.length() / 2);
            String secondHalf = mother.substring(mother.length() / 2);
            System.out.println(firstHalf + secondHalf);

        } else {
            String firstHalf = mother.substring(0, mother.length() / 2);
            String secondHalf = father.substring(father.length() / 2);
            System.out.println(firstHalf + secondHalf);
        }


/*
 * String father = "Sameer";
		String mother = "Taylor Swift";
		boolean boy = false; // if true boy otherwise girl
		if (boy) {
			String firstHalf = father.substring(0, father.length() / 2);
			String secondHalf = mother.substring(mother.length() / 2);
			System.out.println(firstHalf.trim() + secondHalf.trim());
		} else {
			String firstHalf = mother.substring(0, mother.length() / 2);
			String secondHalf = father.substring(father.length() / 2);
			System.out.println(firstHalf.trim() + secondHalf.trim());
		}
 */


    }

}
