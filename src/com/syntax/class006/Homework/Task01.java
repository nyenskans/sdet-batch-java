package com.syntax.class06.Homework;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {


		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		Scanner input=new Scanner(System.in);
		
		String country;
		String language=null;
		
		System.out.println("What country are you from");
		
		country=input.nextLine();
		
		
		switch(country) {
		
		case "Italy":
			language="Italian";
			break;
		case "China":
			language="Chineese";
			break;
		case "France":
			language="French";
			break;
		case "Argentina":
			language="Spanish";
			break;
		case "England":
			language="English";
			break;
		}
		System.out.println("You are from " + country + " and you speak " + language);
			
		
		
	}

}
