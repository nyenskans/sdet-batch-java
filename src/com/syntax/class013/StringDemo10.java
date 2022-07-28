package com.syntax.class013;

public class StringDemo10 {

    public static void main(String[] args) {

        String str = "457Anh%#$%fregb346kren&%$^^&*JBD33";

        System.out.println(str.replaceAll("[0-9]", "#")); // replace all numbers by #

        System.out.println(str.replaceAll("[a-z]", "#")); // replace all lowercase by #

        System.out.println(str.replaceAll("[A-Z]", "#")); // replace all uppercase by #


        System.out.println(str.replaceAll("[A-Za-z0-9]", "#")); //replace all letters and numbers

        System.out.println(str.replaceAll("[^a-z]", "_")); // replace all except lowercase letters

        System.out.println(str.replaceAll("[^A-Z]", "*")); // replace all except uppercase letters

        System.out.println(str.replaceAll("[^A-Za-z0-9]", "_")); // replace all special characters

        String str2 = "abfccdegtrewfghihjklmnoyxpqr";

        System.out.println(str2.replace("[a-f]", "*")); // replace the range a to f


    }

}
