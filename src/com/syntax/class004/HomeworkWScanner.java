package com.syntax.class04;

import java.util.Scanner;

public class HomeworkWScanner {

	public static void main(String[] args) {

	
		/*Create a java program in which using Scanner
		*you are going to capture user’s first name, last name and state where he/she lives.
		*/
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your first and last name");
		
		String name= input.nextLine();
		
		System.out.println(name+" what state do you live in?");
		
		String state=input.nextLine();
		
		System.out.println(name +" lives in the state of "+ state);
		
		input.close();
	}

}
