package com.syntax.class013;

public class StringDemo09 {

    public static void main(String[] args) {

        // from a string get a part which starts from symbol # and ends at # without them
        String str = "I am #confused#";


        System.out.println(str.substring(2, 4)); // output is index 2 and index 3

        str = "Asghar is great";
        System.out.println(str.substring(0, 6));


        String str1 = "Batch 13 is good, actually very good.";
        System.out.println(str1.replace("good", "great"));
        System.out.println(str1.replace("g", "G")); // replaces both g in the string
        System.out.println(str1.replaceFirst("g", "G")); // replaces only the first g in the string


    }

}
