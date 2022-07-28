package com.syntax.class017;

public class IntellijFeatures {
    public static void main(String[] args) {
        int number = 10;
        if (number == 10) {
            System.out.println("Number is 10");
        } else if (number == 20) {
            System.out.println("Number is 20");
        } else {
            System.out.println("Invalid number");
        }

        boolean flag = true;
        if (!flag) { //hover over condition--> simplify --> option+shift+enter
            System.out.println("True");
        } else {
            System.out.println("Help");
        }

        int[] arr = {10, 30, 33, 400};
        for (int i = 0; i < arr.length; i++) { // hover over for--> offers to switch from for loop to enhanced
            System.out.println(arr[i]);
        }
        //HELP-->Keybord Shortcuts PDF


        // TOOLS : CODE WITH ME
    }
}
