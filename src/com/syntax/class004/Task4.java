package com.syntax.class004;

public class Task4 {

    public static void main(String[] args) {

        /*
         * Create a Java program and store values of mortgage rate and mortgage price.
         * First, program should check if rate is higher than 4.5 user will not buy a
         * house, otherwise user will consider buying. Once user decides to buy a house,
         * if price of the house is larger than 50000 than user will take a loan,
         * otherwise user will pay cash.
         *
         */

        double mortgageRate = 4.8;
        int price = 55000;

        if (mortgageRate > 4.5) {
            System.out.println("Buyer will not buy a house");

        } else {
            System.out.println("Buyer will consider buying");
            if (price > 50000) {
                System.out.println("Buyer will take a loan");
            } else {
                System.out.println("Buyer will pay cash");
            }
        }

    }

}
