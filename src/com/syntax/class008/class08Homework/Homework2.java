package com.syntax.class08Homework;
import java.util.Scanner;
public class Homework2 {
	public static void main(String[] args) {
/*  Write a program to ask a user to enter the item they want to buy and the price of that item.
 *  Every time user enters money, accumulate the amount and tell the user how much is left to pay off.
 *  If user give more money program should return a change. 
 *  Whenever a user is done with payments, program should say “Thank you for shopping!” */
	
		Scanner input=new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item=input.nextLine();
		System.out.println("What is the price of the item?");
		int price=input.nextInt();
		int payment=0;
		int balance=price-payment;
		
		do {
			System.out.println("How much do you want to pay?");
			payment=input.nextInt();
			
			balance=balance-payment;
			
		} while(balance>0);
		
		if(balance==0) {
			System.out.println("Your balance is paid off. Thank you for shopping!");

		} else if(balance<0) {
			System.out.println("Thank you for shopping! Your change is "+ balance*(-1)+" dollars.");

		}
		input.close();
	}

}
