package com.syntax.class05;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		/*
		 * Write a program that will ask user to input inputs the current time (use 24
		 * hour format). Based on the given time define:
		 * 
		 * if hour is between 1-11 --> Morning if hour between 12-15 --> Afternoon if
		 * hour between 16-20 --> Evening if hour between 21-24 --> Night
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("What is the current hour in military time?");

		int hour = input.nextInt();

		if (hour >= 1 && hour < 12) {
			System.out.println("It is Morning");
		} else if (hour >= 12 && hour < 16) {
			System.out.println("It is Afternoon");
		} else if (hour >= 16 && hour < 20) {
			System.out.println("It is Evening");
		} else if (hour >= 21 && hour < 24) {
			System.out.println("It is Night");
		}else {
			System.out.println("Invalid time entry");
		}
	}

}
