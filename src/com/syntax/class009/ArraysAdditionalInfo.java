package com.syntax.class09;

public class ArraysAdditionalInfo {

	public static void main(String[] args) {

		String[] fruits= {"mango", "apple", "strawberry", "kiwi", "watermelon", "pear", "plum"};
		
		System.out.println(fruits[3]);
		fruits[2]="peach";
		System.out.println(fruits[2]);
		
		System.out.println("My favorite fruit is "+fruits[0]);
		
		
		
		// How to find a size of an array/ how many elements?
		
		int size=fruits.length;
		System.out.println(size);
		
		
		
		
		/*
		  
		ENHANCED FOR LOOP/ ADVANCED FOR LOOP/ FOR EACH LOOP
		
		CAN ONLY BE USED WITH ARRAYS or COLLECTIONS
		
		
		*/
		
		// We have to know how many times we need to run For loop
		
		String[] colors= {"Pink", "Blue", "White", "Yellow", "Green"};
	
		
		
		for(String color:colors) { // take element from array colors and store it in new variable color
			
			System.out.print(color+" ");
			
		}
		
		
		
		
		System.out.println("");
		System.out.println("----------------------------------");
		
		int[] numbers= {10,20,30,40};
		for(int number:numbers) {
			System.out.print(number+" ");
		}
		
		
		
		
		
		
	}

}
