package com.syntax.class006;

public class EnhancedLargestNumber {

    public static void main(String[] args) {

        /*
         *
         * When there is a Unresolved compilation problem- it means there is an issue
         * and the compiler is unable to translate the source code to the binary code
         *
         * * Compiler is the one who does implicit casting also
         *
         */

        // Find the largest number out of three

        int num1 = 200;
        int num2 = 200;
        int num3 = 2000;

        int largest = 0; // When numbers are equal -> error: The local variable largest may not have been
        // initialized

        //Compiler can initialize variables to it's default values
        // int=0; double=0.0; String=null; boolean=false


        if (num1 > num2 && num1 > num3) {

            largest = num1;

        } else if (num2 > num1 && num2 > num3) {

            largest = num2;

        } else if (num3 > num1 && num3 > num1) {

            largest = num3;

        } else {
            System.out.println("At least two out of three numbers are equal");
        }

        if (largest != 0) {

            // We have to add this condition to make sure this line doesn't print when all
            // the values are equal

            System.out.println(" The largest number of these three numbers is " + largest);
        }

    }
}