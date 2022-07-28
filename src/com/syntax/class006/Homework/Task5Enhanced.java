package com.syntax.class06.Homework;

import java.util.Scanner;

public class Task5Enhanced {

	public static void main(String[] args) {

	/* Write a program to ask user to enter value for sale: yes or no if there is no
	 * sale --> you are not going shopping if there is sale ask user which item they
	 * want to buy and it’s price Based on the price you have to calculate the price
	 * of the item after the discount, discount rule: if price is less than $20 -->
	 * apply 10% if price is between $20 & $100 --> 20% if price between $100 & $500
	 * --> 30% otherwise apply 50% discount
	* "After discount ___ the price of the item reduce from __ to ___" */
	
		Scanner input = new Scanner(System.in);

		System.out.println("Is there a sale?");

		boolean sale = input.nextBoolean();
		if (sale) {

			System.out.println("Which item do you want to buy?");
			String item = input.next();
			System.out.println("What is the price of the item");

			double price = input.nextDouble();
			double discount = 0.0;
			double salePrice = 0.0;

			if (price < 20) {
				discount = 10;

			} else if (price >= 20 && price <= 100) {
				discount = 20;

			} else if (price >= 101 && price <= 500) {
				discount = 30;

			} else {
				discount = 50;
			}
			// discountAmount=price*discount/100
			// salePrice=price-discount amount
			
			salePrice = ((100 - discount) / 100 * price);

			System.out.println("After " + discount + " percent discount the price of the item was reduced from " + price
					+ " to " + salePrice);

		} else {
			
			System.out.println("There is no sale going on. You are not going shopping.");
		}

	}

}
