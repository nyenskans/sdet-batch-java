package com.syntax.class011;

public class RecapTask009 {

    public static void main(String[] args) {

        // Min & Max num in the array

        int[] array = {10, 9, 20, 30, 29186, 45};

        int maxNum = array[0];
        int minNum = array[0];

        for (int num : array) {
            if (num > maxNum)
                maxNum = num;
        }
        System.out.println("Maximum number of the array is " + maxNum);


        for (int num : array) {
            if (num < minNum) {
                minNum = num;
            }
        }
        System.out.println("Minimum number of the array is " + minNum);


// 		we can just use if else if to combine both cases in one for loop:

//		for(int num:array) {
//			if(num>maxNum)
//				maxNum=num;
//		}else if(num<minNum){
//				minNum=num;
//		}
//	}
//		System.out.println("Maximum number of the array is "+maxNum);
//		System.out.println("Minimum number of the array is "+maxNum);


    }

}
