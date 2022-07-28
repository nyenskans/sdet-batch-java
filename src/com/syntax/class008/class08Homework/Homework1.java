package com.syntax.class08Homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
/*
 * Write a program that reads a range of integers (start and end point), 
 * provided by a user and then from that range prints the sum of the even and odd integers.
 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num1=input.nextInt();
		System.out.println("Enter another number");
		int num2=input.nextInt();
		int evenSum=0;
		int oddSum=0;
					
		for(int i=num1; i<=num2; i++) {
			if(i%2==0) {
				 evenSum=evenSum+i;
			}else {
				 oddSum=oddSum+i;
			}
			
		}
		System.out.println("Sum of all even numbers from " + num1 + " to " + num2 + " is " + evenSum);
		System.out.println("Sum of all odd numbers from " + num1 + " to " + num2 + " is " + oddSum);
		
		input.close();
	}
}