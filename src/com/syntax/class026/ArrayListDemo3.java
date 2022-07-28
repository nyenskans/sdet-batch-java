package com.syntax.class026;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {


        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A'); // add an element to the Array list
        chars.add('B');
        chars.add('C');
        chars.add('D');
        System.out.println(chars.get(0)); // this is how we access an element at a specific index

        System.out.println(chars); // print out the entire array list

      for(int i=0; i<chars.size();i++){
          System.out.println(chars.get(i)); // print out each element in a new row
      }
    }
}