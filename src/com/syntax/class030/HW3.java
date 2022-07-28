package com.syntax.class030;

import java.util.HashMap;
import java.util.Map;

public class HW3 {
    /*
    Create a map of bestBuy store. place item id and item name into it. Retrieve all keys and values using EntrySet
     */
    public static void main(String[] args) {

        Map<Integer, String> items = new HashMap<>();
        items.put(7664847, "Printer");
        items.put(123456, "iPhone");
        items.put(7879885, "TV");
        items.put(7664855, "Refrigerator");
        items.put(1234567, "iPad");

        for(Map.Entry<Integer, String> entry : items.entrySet()){

        }
    }
}
