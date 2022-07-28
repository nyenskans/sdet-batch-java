package com.syntax.class011;

public class RecapTask007 {

    public static void main(String[] args) {

//		Write a java program to check whether a given number is prime or not?

        int x = 12;
        boolean isPrime = true; //initializing

        if (x > 1) {

            for (int i = 2; i < x; i += 2) {
                if (x % i == 0) { // if the number user has provided is divisible by any other number without remainder, it is not prime
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
        } else {
            isPrime = false;
        }

        // This is what we do after we check if it is prime or no:


        if (isPrime) {
            System.out.println(x + " is Prime");

        } else {
            System.out.println(x + " is not Prime");
        }


    }

}
