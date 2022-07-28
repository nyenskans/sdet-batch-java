package com.syntax.class013;

public class StringDemo08 {

    public static void main(String[] args) {

        String str = "Where is the little rabbit?";
        System.out.println(str.charAt(3)); //	Output is character at the given index
        System.out.println(str.charAt(21));
        System.out.println(str.indexOf("i")); //output is index of the given character

        System.out.println(str.indexOf("e", 4)); // after index 4 what is the index of the next letter 'e'


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                System.out.print(i + " ");
            }
        }

//		int counter=0;
//		for(int i=0; i<str.length(); i++) {
//			
//			if(str.charAt(i)=='e') {
//				counter++;
//			if(counter==4) {
//				System.out.println(i);
//			}
//			}		
//
//		}
//		

    }

}
