package org.nik.java;

// Always extends comes before implements
public class Vehicle extends Crashable implements Drivable {

	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	// grab all the methods only// Another rule is that these implemented methods must be minimum as visible as the parent
	public int getWheel(){
		return this.numOfWheels;
	}
	
	public void setWheels(int numWheels){
		this.numOfWheels = numWheels;
	}
	
	public double getSpeed(){
		return this.theSpeed;
	}
	
	public void setSpeed(double speed){
		this.theSpeed = speed;
	}
	
	// Create a Constructor for this class, so that we can create new vehicles.
	public Vehicle(int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	
	// Below Implementing Abstract Class Crashable methods.
	public void setCarStrength(int carStrength){
		this.carStrength = carStrength;
	}
	
	public int getCarStrength(){
		return this.carStrength;
	}
}
