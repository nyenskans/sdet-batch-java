package com.syntax.class002;

public class KeywordsAndIdentifiers {

    @SuppressWarnings("unused")
    public static void main(String[] args) {


        /* Rules for identifiers
         * 1.no space
         * 2. no keywords
         * 3.can't start w numbers (but numbers can be used within the names)
         */

        //String break = "Hello"; - break is a keyword, error
        //int 1number=10; error
        int number1 = 10;

        //int num%=10; error
        double $price = 2.99; //allowed
        float f_ = 2.09f; //allowed



        /*
         *
         * Preferences= Naming conventions
         *
         *
         *
         */

        //Follow Camel Casing
        //Variable names should start wirh lowercase and then follow Camel Casing
        //Class names should start with uppercase


        String mycity = "Tucson"; //will work but the preferred name is myCity


    }

}
