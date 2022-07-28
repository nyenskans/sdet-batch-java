package com.syntax.class004;

public class Task2 {

    public static void main(String[] args) {

//Write a program that checks whether the number is positive or negative

        int i = 8;
        if (i < 0) {
            System.out.println("Number " + i + " is negative");
        } else if (i == 0) {
            System.out.println("Number is equal to zero");
        } else {
            System.out.println("Number " + i + " is positive");

        }

        System.out.println("-------------------------");

        String browser = "chrome";
        if (browser.equals("chrome")) {
            System.out.println("All tests are run in Chrome");
        } else {
            System.out.println("No tests will be run");
            System.out.println("Reason- Wrong browser");

        }
    }
}
