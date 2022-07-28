package com.syntax.class010;


public class TwoDimensionalArrays {

    public static void main(String[] args) {

//	TO CREATE 2D ARRAY WE SPECIFY NUMBERS OF ROWS AND COLUMNS

        int[][] numbers = new int[3][4];

        // 1st row
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;
        numbers[0][3] = 40;

        //2nd row
        numbers[1][0] = 1;
        numbers[1][1] = 2;
        numbers[1][2] = 3;
        numbers[1][3] = 4;

        // 3rd row
        numbers[2][0] = 9;
        numbers[2][1] = 8;
        numbers[2][2] = 7;
        numbers[2][3] = 6;

        System.out.println(numbers[1][3]);
        System.out.println(numbers[0][1]);


        System.out.println(numbers.length); //output is 3- 3 arrays with 4 elements


        int rows = numbers.length;
        //number of arrays
        System.out.println("Number of rows = " + rows);

        int colsOf1row = numbers[0].length;
        //numbers of elements in the first array
        System.out.println("Number of columns = " + colsOf1row);
		
		
	/*	
		int[][] numbers1= {
							{10,20,30,40},
							{1,2,3,4},
							{9,8,7,6}
										  };

		*/

        int[][] numbers1 = {{10, 20, 30, 40}, {1, 2, 3, 4}, {9, 8, 7, 6}};


        System.out.println("The length of array " + numbers1 + " is " + numbers1.length);


    }
}