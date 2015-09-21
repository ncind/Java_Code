package org.nik.java;

public class Animal {

	private String name;
	private int weight;
	private String sound;

	// Define Getters and Setters.
	// Getter and Setter for Name
	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return this.name;
	}

	// Getter and Setter for Weight
	public void setWeight(int newWeight) {
		if (newWeight > 0) {
			this.weight = newWeight;
		} else {
			System.out.println("Weight must be greater than 0");
		}

	}

	public int getWeight() {
		return this.weight;
	}
	
	
	//Getter and Setter for Sound
	public void setSound(String newSound) {
		this.sound = newSound;
	}

	public String getSound() {
		return this.sound;
	}

}
