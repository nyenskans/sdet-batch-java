package com.syntax.class030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW7 {
    /*
Create a collection of integers in which you can keep duplicates.
  Write a logic to find sum of all integers
 */
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(10,20,30,40); // this makes the list non changeable
        Integer sum=0; // we can do int sum also
        for(Integer num:numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}
