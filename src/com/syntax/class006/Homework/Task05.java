package com.syntax.class06.Homework;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

	/* Write a program to ask user to enter value for sale: yes or no
	* if there is no sale --> you are not going shopping
	* if there is sale ask user which item they want to buy and it’s price
	* Based on the price you have to calculate the price of the item after the discount, discount rule:
	* if price is less than $20 --> apply 10%
	* if price is between $20 & $100 --> 20%
	* if price between $100 & $500 --> 30%
	* otherwise apply 50% discount
	"After discount ___ the price of the item reduce from __ to ___"
	*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Is there a sale?");
		
		String sale=input.next();
		
		if(sale.equalsIgnoreCase("yes")) {
			System.out.println("You are going shopping. What is the price of the item you want?" );
			
			double price=input.nextInt();
			
			double discPrice=0;
			
			if(price<20) {
				double discount=0.1;
				discPrice=price-(price*discount);
				
			}else if(price>=20&&price<=100) {
				
				double discount=0.2;
				discPrice=price-(price*discount);
				
			}else if(price>=101&&price<=500) {
				
				double discount=0.3;
				discPrice=price-(price*discount);
			}else {
				double discount=0.5;
				discPrice=price-(price*discount);
			}
			System.out.println("After discount the price of the item was reduced from " + price + " to " + discPrice);
			
			
		} else {
			System.out.println("You're not going shopping");
		}
		
		
		
		
	}

}
