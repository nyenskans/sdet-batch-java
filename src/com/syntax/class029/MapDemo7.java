package com.syntax.class029;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        // in this case we use method .entrySet() because we have conditions for both key and value
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Orange", 10.0);
        fruit.put("Kiwi", 34.0);
        fruit.put("Banana", 9.0);
        fruit.put("Apple", 12.0);
        fruit.put("Mango", 42.0);
        fruit.put("Watermelon", 27.0);

        // fruit.entrySet()--> all entries from a map

        // we're calling interface within an interface
        Set<Map.Entry<String, Double>> entries=fruit.entrySet();
        //if key contains letter 'e' and value is greater than 20
        entries.removeIf(entry-> entry.getKey().contains("e")&& entry.getValue()>10);
        System.out.println(fruit);

      // another way of writing the same command as line 23
        var entries1=fruit.entrySet();


    }
}
