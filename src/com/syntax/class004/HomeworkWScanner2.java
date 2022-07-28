package com.syntax.class04;

import java.util.Scanner;

public class HomeworkWScanner2 {
	
	public static void main(String[] args) {
	
		
		/*Task 2. Create a java program in which using Scanner you are going to capture 2 numbers.
		*And once you capture 2 numbers, please check which one is the largest.
		*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int num1=input.nextInt();
		
		System.out.println("Enter another number");

		int num2=input.nextInt();
		
		if(num1>num2) {
			System.out.println("First number is larger than the second number");
		}else if(num1==num2){
			System.out.println("First number is equal to the second number");
		}else {
			System.out.println("The second number is larger than the first number");
		}
		input.close();
	}
	

}
