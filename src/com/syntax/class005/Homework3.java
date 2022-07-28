package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("How long have you worked for the company");

		int yearsWorked = input.nextInt();

		if (yearsWorked >= 5) {

			System.out.println("What is your salary?");
			int salary = input.nextInt();

			if (salary > 50000) {
				System.out.println("Congratulations, you got a $5000 bonus");
			} else {
				System.out.println("Congratulations, you got a $3000 bonus");
			}

		} else {
			System.out.println("You are not eligible for the bonus yet");
		}
	}

}
