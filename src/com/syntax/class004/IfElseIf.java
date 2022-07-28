package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * if(condition){ code A; }
		 */
		// -------------------------

		/*
		 * if(condition){ code A; } else { code B; }
		 */

		// -------------------------

		/*
		 * if(condition){ code A; } else if { code B; } else if { code c; } else if {
		 * code d; }
		 */

		// -------------------------

		/*
		 * if(condition){ code A; } else if { code B; } else if { code C; } else if {
		 * code D; }else{ code E }
		 */

		// Declare 2 numbers and verify the largest
		// always check the code by testing with different values
		int num1 = 30;
		int num2 = 20;
		if (num1 > num2) { // true, executes
			System.out.println(num1 + " is larger than " + num2);
		} else {
			System.out.println(num2 + " is larger than " + num1);

		}

		System.out.println("------------------------------------");

		int num3 = 30;
		int num4 = 30;
		if (num3 > num4) { // false
			System.out.println(num3 + " is larger than " + num4);
		} else { // executes
			System.out.println(num4 + " is larger than " + num3);
		}

		/*
		 * This logically makes no sense because none of the conditions will be true but
		 * the code is correct so we get output 20 is larger than 20
		 */

		// We fix that by adding else if code block

		// When we test multiple conditions, we have to use ELSE IF statement

		// Only one code will be executed in if statements, never multiple codes

		num1 = 30;
		num2 = 30;
		if (num1 > num2) { // false
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 < num1) { // false
			System.out.println(num2 + " is larger than " + num1);
		} else { // has to execute this block of code
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("------------------------------------");

		int day = 7;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else { // optional
			System.out.println("Invalid entry");
		}

		/*
		 * Java tests the conditions in If block of code, and as soon as it finds a
		 * condition that is true it executes the code for that condition and then it
		 * exits Only one code executes
		 */

		int month = 4;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid entry");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
