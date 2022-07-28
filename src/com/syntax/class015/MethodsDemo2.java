package com.syntax.class015;

public class MethodsDemo2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        // we want to print all the elements

        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.printArray(arr);


        int sum = arrayUtils.sumArray(arr);
        System.out.println(sum);
    }

}
