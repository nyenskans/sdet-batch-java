package com.syntax.class029;

import java.util.HashMap;

public class MapDemo1 {
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

        System.out.println(fruit);
        // doesn't maintain insertion order
        // doesn't store duplicate values

        System.out.println(fruit.get("Kiwi")); // output is the value of key Kiwi
        fruit.remove("Orange");
        System.out.println(fruit);
        System.out.println( fruit.containsKey("Mango"));
        System.out.println(fruit.containsValue(28));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit);

        // we can insert null value if we need a space but not sure about the values
        fruit.put(null, null);
        System.out.println(fruit);
    }
}
