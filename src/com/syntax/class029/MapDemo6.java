package com.syntax.class029;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo6 {
    public static void main(String[] args) {
        // How to remove the elements from a map based on values

        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Orange", 10.0);
        fruit.put("Kiwi", 34.0);
        fruit.put("Banana", 9.0);
        fruit.put("Apple", 12.0);
        fruit.put("Mango", 42.0);
        fruit.put("Watermelon", 27.0);

        // now we are making a collection of values from the HashMap
        Collection<Double> values=fruit.values(); //  values() method used for values
        values.removeIf(value -> value>20.0); // lambda expression with removeIf() method
        System.out.println(fruit);

        // the Iterator can be used as well
        Iterator<Double> iterator=values.iterator();


    }
    }

