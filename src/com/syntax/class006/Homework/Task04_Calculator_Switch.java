package com.syntax.class06.Homework;

import java.util.Scanner;

public class Task04_Calculator_Switch {

	public static void main(String[] args) {

		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Complete
		 * using switch case
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int num1 = input.nextInt();

		System.out.println("Enter one of the following operators: +, -, *, /");
		String operator = input.next();
		System.out.println("Enter another number");
		int num2 = input.nextInt();
		int result=0;
		
		switch (operator) {
		
		case "+":
		result=num1+num2;
		break;
		
		case "-":
			result=num1-num2;
			break;
			
		case "*":
			result=num1*num2;
			break;
			
		case "/":
			result=num1/num2;
			break;
			
			default:
				System.out.println("Invalid operator");
			
		
				// we can add a condition here : 
			}	if (operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")) {
			System.out.println("The result is " + result);
		}
		input.close(); //there can be leakage of Scanner values so we use the close method
	}

}
