package com.syntax.class005;

public class LogicalOperatorNOT {

    public static void main(String[] args) {

        boolean boo = !true;

        System.out.println(boo); //output is false

        /*
         * If there is no traffic->
         * -> I will reach work on
         *
         */
        boolean traffic = false;
        if (!traffic) {
            System.out.println("I will reach work on time");
        }

        String name = "Marc";

        if (!name.equals("Mary")) {
            System.out.println("You are not Mary, and I need Mary");
        }


        //Real life example- if a user has checked the box (eg. Read terms of agreement)
        //boolean checkboxSelected=true;
        //if(!checkboxSelected) {
        //	click;
        //}

        boolean checkboxSelected = true;
        if (!checkboxSelected) {
            System.out.println("Click on checkbox");
        }


    }

}
