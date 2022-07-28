package com.syntax.class029;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        // How to remove/add the elements from a map based on both keys and values

        HashMap<String, Double> fruit=new HashMap<>();
        // put method inserts keys and values into a hashmap
        fruit.put("Apple", 20.0); // no auto upcasting, we have to write 20.0
        fruit.put("Orange", 10.0);
        fruit.put("Kiwi", 34.0);
        fruit.put("Banana", 9.0);
        fruit.put("Apple", 12.0); // overrides the original value for key Apple
        fruit.put("Mango", 42.0);
        fruit.put("Watermelon", 27.0);
        Collection<String> keys=fruit.keySet();  // keySet() method used for keys

        // Can't use for loop with .remove() because remove() changes the size of the Map
    /*    for(String key:keys){
            if(key.contains("e")) {
                fruit.remove(key);
            }
        }*/

        // Alternative is Iterator:
        Iterator<String> iterator=fruit.keySet().iterator();


        keys.removeIf(key -> keys.contains("e"));

     }
}
