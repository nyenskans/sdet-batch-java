package com.syntax.class015;

public class Task3 {
    //Create a program that will print whether a string is a palindrome or not

    void printIsPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString(); // convert StringBuilder back to a string so we can compare it with original string
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args) {

        Task3 isPalindrome = new Task3();
        isPalindrome.printIsPalindrome("Dad");
    }


}
