package org.nik.java;

public class JavaLessonFourteen {
	
	public static void main(String args[]){
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println();

		System.out.println(morris.getName());
		System.out.println(morris.favToy);
		System.out.println(morris.favFood);
		
		Animals tabby = new Cats("Tabby", "Salmon", "Ball");
		
		
		acceptAnimal(tabby);
	}
	
	//Polymorphism
	// You define a method by using/passing in the parent class type. But if a child class type is passed as an Argument. 
	// Java's Interpreter is smart enough to know and use the child classes methods/parameters if they were overridden
	// However the interpreter is NOT smart enough to locate the methods that are not inside the Animal
	public static void acceptAnimal(Animals randAnimal){
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		System.out.println();
		
		randAnimal.walkAround();
		
		// The Interpreter Cannot execute the below line, because the interepreter does not know anything about the Cat Type.
		// So in the jist, if you want to pass a subclass as an object to the Superclass, make sure you call only the methods that are overriden
		// You will get the results from the subclass
		//System.out.println(randAnimal.favToy);
		
		
		// Very Important //
		//However if you want to access methods/fields that are only in the Cats class, then you have to cast the object to the Cats class first
		
		Cats tempCat = (Cats)randAnimal;
		System.out.println(tempCat.favToy);
		
		// Casting # 2. You can also cast the object directly.
		System.out.println(((Cats)randAnimal).favToy);
			
		// Now , how to check if an object is an instanceOf etc.
		if(randAnimal instanceof Cats){
			System.out.println(randAnimal.getName() + " is a Cat");
		}
		
		// This is also going to work if , because, tabby is also an Animal
		if(randAnimal instanceof Animals){
			System.out.println(randAnimal.getName() + " is a Cat");
		}
	}

}
