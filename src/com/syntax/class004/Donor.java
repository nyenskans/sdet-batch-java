package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		//Task2
		/*2. Create a Java program and call it a Donor.
		 * In order to be eligible to donate your blood you have to be 18 years old. 
		 * Also once you identify age eligibility then we have to see if person matches weight requirements. 
		 * If person weight it more than 110 lbs → then he/she is eligible, 
		 * otherwise we cannot accept such a patient.
		*/
		int age=33;
		int weight=105;
		if(age>18) {
			System.out.println("You are old enough to be a donor");
			System.out.println("Enter your weight");

			if(weight>110) {
				System.out.println("You fulfill all the conditions to be a donor");
			}else {
				System.out.println("You are not eligible");
			}
			
		}else {
			System.out.println("You are too young to be a donor");
		}
		
		
	}

}
