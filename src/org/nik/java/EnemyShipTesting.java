package org.nik.java;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {

		// EnemyShip theEnemy = null;
		//
		// Scanner userInput = new Scanner(System.in);
		//
		// String enemyShipOption = "";
		// System.out.println("What type of Ship ? (U/R)");
		//
		// if (userInput.hasNextLine()) {
		// enemyShipOption = userInput.nextLine();
		// }
		//
		// if (enemyShipOption.equals("U")) {
		// theEnemy = new UFOEnemyShip();
		//
		// } else if (enemyShipOption.equals("R")) {
		// theEnemy = new RocketEnemyShip();
		//
		// }
		//
		// doStuffEnemy(theEnemy);
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of Ship ? (U/R/B)");

		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();

			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}

		if (theEnemy != null) {
			doStuffEnemy(theEnemy);
		}

	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {

		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();

	}

}
