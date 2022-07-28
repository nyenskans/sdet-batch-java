package com.syntax.class012;

public class StringClassDemo04 {

    public static void main(String[] args) {

//	 	STRINGS ARE ARRAYS OF CHARACTERS

        String str = "Sameer is gulbodin";
			
	/*		System.out.println(str.charAt(2)); // charAt method to access the string array of characters
			
			
			To print out all the characters in String str:
			
			for(int i=0; i<str.length(); i++) {
				str.charAt(i);
				System.out.print(str.charAt(i));		
			}
			System.out.println();
			
			
	*/
        //	To count  how many times a specific shows up in a String:

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('s' == str.charAt(i)) {
                counter++;
            }
        }
        System.out.println("S appeared " + counter + " times");


        int counter1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('s' == str.charAt(i) || 'S' == str.charAt(i) || 'a' == str.charAt(i) || 'A' == str.charAt(i)) {
                counter1++;
            }
        }
        System.out.println("S and A appeared " + counter1 + " times in total");


    }
}