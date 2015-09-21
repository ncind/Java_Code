package org.nik.java;

public class LessonFifteen {

	public static void main(String[] args) {
		 
		Vehicle car = new Vehicle(4, 100.00);
		
		System.out.println("Car's max Speed: " + car.getSpeed());
		System.out.println("Number of Wheels: " + car.getWheel());
		
		car.setCarStrength(10);
		System.out.println("Car Strength : " + car.getCarStrength());

	}

}
