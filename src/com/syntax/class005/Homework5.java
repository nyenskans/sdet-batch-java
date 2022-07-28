package com.syntax.class05;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =“Spring” if user is born in June, July, August → season =“Summer” etc … At
		 * the end of the program we should see output as “You were born is season ______“.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your birth month");

		String birthMonth = input.next();

		if (birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")) {

			System.out.println("You are born in Spring");

		} else if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {

			System.out.println("You are born in Summer");

		} else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {

			System.out.println("You are born in Fall");

		} else if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")) {
			System.out.println("You are born in Winter");

		}
	}

}
