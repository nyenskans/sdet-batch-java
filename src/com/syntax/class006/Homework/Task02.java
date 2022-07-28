package com.syntax.class06.Homework;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("What is your grade?");
		
		String grade=scan.next();
		String gradeExplanation;
		
		switch (grade){
			case "A":
			gradeExplanation="Excellent";
			break;
			
			case "B":
			gradeExplanation="Good";
			break;
			
			case "C":
			gradeExplanation="Average";
			break;
			
			case "D":
			gradeExplanation="Bad";
			break;
			
			default:
			gradeExplanation="Not acceptable";
			break;
		
		} System.out.println("Your grade is " + grade + " and that is " + gradeExplanation);
		
	}

}
