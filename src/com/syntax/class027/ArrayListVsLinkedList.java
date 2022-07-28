package com.syntax.class027;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String> names1=new ArrayList<>();
        long startTime1=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            names1.add(0, "Loki koki");
        }
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
        // this way we calculate the time it takes for the code to execute adding the element into array list


        // this way we calculate the time it takes for the code to execute adding the element into linked list:
        List<String> names2=new LinkedList<>();
        long startTime2=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            names2.add(0, "Loki koki");
        }
        long endTime2=System.currentTimeMillis();
        System.out.println(endTime2-startTime2);
        //output shows a huge difference in amount of times it takes to execute the addition of an element
    }
}
