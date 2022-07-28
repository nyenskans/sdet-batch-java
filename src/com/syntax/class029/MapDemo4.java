package com.syntax.class029;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        // put method inserts keys and values into a hashmap
        fruit.put("Apple", 20.0); // no auto upcasting, we have to write 20.0
        fruit.put("Orange", 10.0);
        fruit.put("Kiwi", 34.0);
        fruit.put("Banana", 9.0);
        fruit.put("Apple", 12.0); // overrides the original value for key Apple
        fruit.put("Mango", 42.0);
        fruit.put("Watermelon", 27.0);

        // Map entry contains a location for a pair key-value

        Set <Map.Entry<String, Double>> entries=fruit.entrySet();

        for(Map.Entry<String, Double>entry:entries){
            System.out.println("entry: "+entry);
        }


    }
}
