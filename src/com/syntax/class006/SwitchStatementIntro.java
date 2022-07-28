package com.syntax.class006;

public class SwitchStatementIntro {

    public static void main(String[] args) {


        //	CONDITIONAL STATEMENTS:

        // 1. IF STATEMENT
        // 2. SWITCH STATEMENT

        //  SWITCH SYNTAX

        /*
         *
         * switch(variable/expression){
         * case value1;
         * 		code a;
         *		break;
         *	case value2;
         *		code b;
         *		break;
         *		.....
         */

        //SWITCH doesn't allow duplicate cases, while in if-else if we can do it even though it's redundant

        //Alternative to if-else if code block

        int day = 9;
        String name;

        if (day == 1) {

            name = "Monday";

        } else if (day == 2) {
            name = "Tuesday";
        } else if (day == 3) {
            name = "Wednesday";
        } else if (day == 4) {
            name = "Thursday";
        } else if (day == 5) {
            name = "Friday";
        } else if (day == 6) {
            name = "Saturday";
        } else if (day == 7) {
            name = "Sunday";
        } else { // optional
            name = "Invalid";
        }
        System.out.println(name);

        System.out.println("-------------");

        //	Alternative with switch statement:


        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:            //////Substitutes else{ }
                name = "Invalid";
                break;
        }

        System.out.println(name);

    }

}
