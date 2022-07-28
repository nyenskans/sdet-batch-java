package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules:
		 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
		 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
		 * grade=F
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter scores for quiz, mid term and final score respectivelly");

		int quiz = input.nextInt();
		int midTerm = input.nextInt();
		int finals = input.nextInt();

		int avgScore = (quiz + midTerm + finals) / 3;

		if (avgScore >= 90) {
			
			System.out.println("Your grade is A"); //we're just printing, not saving
			
		} else if (avgScore >= 70 && avgScore < 90) {
			
			System.out.println("Your grade is B");
			
		} else if (avgScore >= 50 && avgScore < 70) {
			
			System.out.println("Your grade is C");
			
		} else if (avgScore < 50) {
			
			System.out.println("Your grade is F");
		}

		//* If you are Student w grade A or B, you are doing great
		// Otherwise, try to do better
		
//Continue in class 6, Enhanced code		
		
	}

}
