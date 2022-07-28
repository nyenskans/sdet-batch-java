package com.syntax.class11;

import java.util.Scanner;

public class RecapTask002 {

	public static void main(String[] args) {

		/* Using Scanner create an array of countries. 
		 * When an array is created, retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of countries");
		int countriesLength=input.nextInt();
		String[] countries=new String[countriesLength];
		System.out.println("Enter the countries");
		
		for(int i=0; i<countriesLength; i++) {
			countries[i]=input.nextLine();	
		}


	for(String country:countries) {
		if(country.equalsIgnoreCase("USA")){
				System.out.println("Washington DC");
	}else if(country.equalsIgnoreCase("Sweden")) {
		System.out.println("Stockholm");
	}else if(country.equalsIgnoreCase("India")) {
		System.out.println("New Delhi");
	}else if(country.equalsIgnoreCase("Italy")) {
		System.out.println("Rome");
	}else if(country.equalsIgnoreCase("France")) {
		System.out.println("Paris");
	}else if(country.equalsIgnoreCase("Germany")) {
		System.out.println("Berlin");
	}else if(country.equalsIgnoreCase("Spain")) {
		System.out.println("Madrid");
	}else if(country.equalsIgnoreCase("Portugal")) {
		System.out.println("Lisbon");
	}else if(country.equalsIgnoreCase("UK")) {
		System.out.println("London");
	}else {
System.out.println("Country not supported by the program");
	}
	
	
	
	
	
	
	}
	input.close();

}
}