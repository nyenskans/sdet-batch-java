package com.syntax.class08Homework;

public class Homework3 {

	public static void main(String[] args) {

/*
 * Using nested loop, create a 24 hour clock 
 * that will display 2 digits for an hour and 2 digits for a minute.
 */
		
		for(int i=0; i<24; i++) {
			for(int j=0; j<60; j++) {
				
				if(i<=9&&j<=9) {
					System.out.println("0"+i+":0"+j);
				}else if(i>=9&&j<=9) {
					System.out.println(i+":0"+j);

				}else if(i<=9&&j>=9) {
					System.out.println("0"+i+":"+j);

				}else if(i>=9&&j>=9) {
					System.out.println(i+":"+j);
					
			}
				
		}
	}
		
		
System.out.println("------------------------------------------------");
		
	
		// ANOTHER WAY 
		
		
		
		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 3; b++) {
				for (int c = 0; c <= 5; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(a + "" +  b + ":" + c + d);
					}
				}
			}
		}
		
		
		System.out.println("------------------------------------------------");

		
		
		
		// ANOTHER WAY
		
		String time=null;
		
		
		for(int hours=0; hours<24; hours++) {
			for(int min=0; min<60; min++) {
				
				
				if(hours<10 &&min<10) {
					time="0"+hours+":"+":0"+min;
				
				}else if(hours>10 && min<10) {
					time=hours+":0"+min;
				
				}else if(hours<10&&min>10) {
					time="0"+hours+":"+min;

				}else if(hours>10&&min>10) {
					time=hours+":"+min;
					System.out.println(time);
			}
		}
	}
		
		
		
		
		
		
		
		
		
}
}