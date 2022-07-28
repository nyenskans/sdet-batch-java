package com.syntax.class027;

import java.util.ArrayList;


public class ListDemo2 {
    public static void main(String[] args) {


        ArrayList<String> legends = new ArrayList<>();
        legends.add( "Loki");
        legends.add( "Risi");

    ArrayList<String> moreStudents=new ArrayList<>() ;
        moreStudents.add( "Tedi");
        moreStudents.add( "Bobi");
        
        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(legends);
        System.out.println(allStudents);

        allStudents.addAll(moreStudents);
        System.out.println(allStudents);

        allStudents.removeAll(legends);
        System.out.println(allStudents);

        allStudents.clear(); // this methods removes all elements
        System.out.println(allStudents);

        System.out.println(moreStudents.get(0));
        moreStudents.add("Loki");
        moreStudents.add("Risko");
        moreStudents.set(0,"Neno"); // replaces an index
        moreStudents.add("Risko");

        System.out.println(moreStudents);

        System.out.println( moreStudents.indexOf("Loki")); //index of an element
        System.out.println(moreStudents.lastIndexOf("Risko"));



    }
}