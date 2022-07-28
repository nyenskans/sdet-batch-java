package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("What city are you in currently?");
		String city = input.nextLine();
		System.out.println("What is the temperature in Farenheit in " + city + "?");
		int tempFahr = input.nextInt();

		int tempCels = (tempFahr - 32) * 5 / 9;

		System.out.println("The temperature in " + city + " is " + tempCels + "C.");

	}

}
