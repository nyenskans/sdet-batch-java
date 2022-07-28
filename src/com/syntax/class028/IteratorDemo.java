package com.syntax.class028;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList <String> words=new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("sentence");

        // Never use a loop if  are using methods that can change the size of the arrayList
//        for(String word:words){
//            if(word.endsWith("e")){
//                words.remove(word);
//            }
//        }

        Iterator<String> iterator=words.iterator(); //method that will return the object iterator
        System.out.println(iterator.hasNext());
        // hasNext() shows if there are any more elements in the list left to be iterated after the current position of the pointer
        //when we call iterator(), the pointer is placed before the first element

        // Iterator is a one time element

        System.out.println(iterator.next());

        //prints out the next element

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext()); //false
    //    System.out.println(iterator.next());  // no such element error
        System.out.println("====================================");

        //  THIS IS THE RIGHT WAY TO PERFORM REMOVING/ ADDING ELEMENTS FROM/ TO A LIST
        while(iterator.hasNext()){
       //     System.out.println(iterator.next());
            if(iterator.next().endsWith("e")){
                iterator.remove();
            }
        }


        //  THE BEST WAY--> LAMBDA EXPRESSION:

        // System.out.println(iterator.next());
        //   words.removeIf( nat -> nat.endsWith("e"));
        //  System.out.println(words);


    }

}
