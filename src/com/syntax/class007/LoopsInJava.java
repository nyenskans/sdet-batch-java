package com.syntax.class007;

public class LoopsInJava {

    public static void main(String[] args) {

        //	Loops

        // Statement that executes a block of code n number of times based on a condition

        // We use them to eliminate redundancy

        /*
         * WHILE, DO WHILE, FOR, ENHANCED FOR LOOPS
         */


        // Say hello 5 times

        //While loop: repeats a block of code based on condition
        // Executes the block of code while a condition is true

        int time = 10;
		
		/* while (time<12) {
			System.out.println("Morning");
			This is infinite loop
		}
		*/

        while (time < 12) {
            System.out.println("Morning");
            time++;
        }


        // The code is repeated until the condition is true, then goes back and checks the condition again
        //Once it's false, it will not go back into the loop
        // but continue to the next line after the loop block of code


        /////	DO WHILE LOOP


    }

}
