package com.syntax.class029;

import java.util.*;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> fruit=new HashMap<>();
        fruit.put("Lemon", 10);
        fruit.put("Apple", 23);
        fruit.put("Peach",11);
        fruit.put("Strawberry",11);

    //   We are storing all the keys from the HashMap in the form of a Set
         Set<String> keys=fruit.keySet();

    for(String key:keys){
        System.out.println("key = " +key );
    }
     //   ArrayList<Integer> values=fruit.values(); //error: fruit is a collection; we cannot downcast automatically to ArrayList
     //   ArrayList<Integer> values=(ArrayList<Double>) fruit.values();  // we can do it this way if we explicitly downcast

        //we are making a collection of all the values from the HashMap in the form of a Collection
        Collection<Integer> values=fruit.values();
        for(Integer value:values){
            System.out.println("value = " + value);
        }

    }
}
