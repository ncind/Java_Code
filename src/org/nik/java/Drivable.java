package org.nik.java;

public interface Drivable {
	
	double PI = 3.14;
	
	// The Below is technically public abstract int getWheel();
	int getWheel();
	
	void setWheels(int numWheels);
	
	double getSpeed();
	
	void setSpeed(double speed);
}
