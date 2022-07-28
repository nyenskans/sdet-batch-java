package com.syntax.class030;

import java.util.LinkedHashMap;

public class HW1 {
    public static void main(String[] args) {

     /*Create a map of a building. Store floor number and its associated company name.(Example: 1= Google, 2=Syntax etc.).
     Insert 7 entries with duplicate keys and values.
     - Check how many entries you have?
     - Update company on a 4th floor
     - Remove company on the 7th floor
     - Print your map */

        // Best if we use LinkedHashMap to keep the order

        LinkedHashMap<Integer, String> building = new LinkedHashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Facebook");
        building.put(4, "Amazon");
        building.put(5, "Netflix");
        building.put(6, "Google"); // keeps value duplicates
        building.put(2, "Oracle"); // overrides value for key 2 but the order stays the same

        System.out.println(building.size());;
        System.out.println(building);
        building.replace(5, "Youtube");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(building);
        building.remove(5); // removes element based on key
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(building);

    }
}
