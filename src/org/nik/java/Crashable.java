package org.nik.java;

// classes can be either public or final, not both.
public abstract class Crashable {
	boolean carDrivable = true;
	
	public void youCrashed(){
		this.carDrivable = false;
	}
	
	// The below is an abstract method.
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();
	
	
	
}
