package org.nik.java;

public class WorkWithAnimals {
	
	int justANum = 10;	
	
	public static void main(String args[]){
		
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		
		fido.setWeight(-1);
		
		// Everything in Java is passed by Value
		int randNum = 10;
		
		fido.changeVar(randNum); // Inside Method call
		System.out.println("randNum after the method : " + randNum); // After the Method Call
		
		// Name of Dog before the below method
		System.out.println("The dog name before the method call : " + fido.getName());
		
		// Objects are passed by reference
		changeObjectName(fido);
		System.out.println("The dog name after method call: " + fido.getName());

		
		//Polymorphism
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says " + doggy.getSound());
		System.out.println("Kitty Says " + kitty.getSound());
		
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says " + animals[0].getSound());
		System.out.println("Kitty says " + animals[1].getSound());
		
		// Now we can cycle through the arrays using foreach block
		System.out.println();
		System.out.println("Through for each loop");
		for(Animal a : animals)
		{
			if(a instanceof Dog){
				System.out.println("Doggy says " + a.getSound());
			}else if(a instanceof Cat){
				System.out.println("Kitty Says " + a.getSound());	
			}
			
		}
		
		// Lets call the Speak Animal Method
		speakAnimal(doggy);
		
		// Lets call a method in the Dog class that is not in the animal class
		((Dog)doggy).digHole();
		
		
		// Giraffe
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		System.out.println("Giraffe Name is " + giraffe.getName());
	}
	
	
	public static void changeObjectName(Dog fido){
		fido.setName("Marcus");
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println();
		System.out.println("Animal says " + randAnimal.getSound());
	}

}
