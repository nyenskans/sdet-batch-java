package com.syntax.class012;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

//			Write a program that reads two people's first
//				names and if they expecting boy or girl? 
//			Based on the input suggests a name for a baby:
//			Example Output:
//			Mom's first name? Mary
//			Dad's first name? Daniel
//			Boy or Girl? boy
//			Suggested baby name: DANRY
//
//			Example Output:
//			Mom's first name? Mary
//			Dad's first name? Daniel
//			Boy or Girl? girl
//			Suggested baby name: MAIEL

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the parent's names- mother and then father");
        String mother = input.nextLine();
        String father = input.nextLine();
        System.out.println("Are you expecting a boy or a girl?");
        String baby = input.nextLine();
        int length1 = father.length();
        int length2 = mother.length();
        if (baby.equalsIgnoreCase("girl")) {
            System.out.println(mother.substring(0, 2) + father.substring(length1 - 3, length1 - 1));


        } else if (baby.equalsIgnoreCase("boy")) {
            System.out.println(father.substring(0, 3) + mother.substring(length2 - 2, length2));

        }

        input.close();
    }

}
