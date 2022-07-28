package com.syntax.class11Part2;

public class Phone {

	String model;
	String make;
	double screenSize;
	int RAM;
	int storage;
	int camera;
	
	void call() {
		System.out.println("Calling comeone");
	}
	void takePictures() {
		System.out.println("Use my camera app to take pictures");
	}
	
	
	
	public static void main(String[] args) {

		Phone s22Ultra = new Phone();
		s22Ultra.make="Samsung";
		s22Ultra.model="Samsung Galaxy s22 Ultra";
		s22Ultra.screenSize=6.8;
		s22Ultra.RAM=12;
		s22Ultra.storage=512;
		System.out.println(s22Ultra.storage);
		s22Ultra.camera=108;
		s22Ultra.call();
		
		
		//	it's fine to leave some of the properties empty
		
		}

}
