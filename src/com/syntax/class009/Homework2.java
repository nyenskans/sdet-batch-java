package com.syntax.class009;

public class Homework2 {

    public static void main(String[] args) {


        //	Create an array to store double values and then
        // print all elements using 2 different loops


        Double[] nums = {2.3, 4.5, 14.3, 45.2, 145.65};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (double num : nums) {
            System.out.println(num);
        }
    }

}
