package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {
		
	// Array is a data structure consisting of a collection of elements (values or variables)
		
		
		
		// CREATE AN ARRAY
		
		// int[] b; -> just declaring the array
		
		
		int[] b=new int[4]; // 4 elements
		
		// int[] b= {90,85,70,100};
		
		
		
		// 	STORE VALUES- they have to be of same type
		//	 Elements in arrays are stored based on indexes
		// The array has 4 elements, the indexes 0 to 3
		
		b[0] = 90; // element of array b with the index 0 is 90, the first element
		b[1] = 85;
		b[2] = 70;
		b[3] = 100;
		
		
		// ACCESS VALUES FROM MY ARRAY
		
		System.out.println(b[2]);
				
		System.out.println(b[2]+b[3]);	// Integer type values, so + is addition not concatenation	
				
				
			//	We need to create an array of classmates
		
		String[] classMates=new String[4]; 
		
		// we MUST always specify size of the array when initializing
		
		classMates[0]="Mary";
		classMates[1]="John";
		classMates[2]="Nick";
		classMates[3]="Ann";
		
		System.out.println("My classmate's name is " + classMates[3]);
		
		
		
		// Any type of data can be stored in arrays
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
