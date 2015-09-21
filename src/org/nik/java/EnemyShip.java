package org.nik.java;

public abstract class EnemyShip {
	
	private String name;
	private double amtDamage;
	
	// Declare Getters and Setters
	public void setName(String newName){
		this.name = newName;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDamage(double newDamage){
		this.amtDamage = newDamage;
	}

	public double getDamage(){
		return this.amtDamage;
	}

	public void followHeroShip()
	{
		System.out.println(getName() + " is following the Hero");
	}
	
	public  void displayEnemyShip(){
		System.out.println(getName() + " is on the screen");
	}
	
	public  void enemyShipShoots(){
		System.out.println(getName() + " attacks and does " + getDamage());
	}
	
	
	
}
