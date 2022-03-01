package com.bridgelabz.birdsanctuary;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Sanctuary!!"); 
		
	    Duck duck = new Duck(); 
	    Ostrich ostrich = new Ostrich(); 
	    Parrot parrot = new Parrot();
	    Penguin penguin = new Penguin();
	    Pigeon pigeon = new Pigeon(); 
	    
	    BirdRepository birdRepository = new BirdRepository();
	    
	    birdRepository.addBirds(duck);
	    birdRepository.addBirds(ostrich);
	    birdRepository.addBirds(parrot);
	    birdRepository.addBirds(penguin);
	    birdRepository.addBirds(pigeon);
		
	    UserInterface userInterface = new UserInterface(); 
	    userInterface.print(birdRepository.getBirdList());
	    
	    birdRepository.removeBirds(duck);
	    birdRepository.removeBirds(ostrich);
	    
	    System.out.println("Printing the birds after removal");
	    
	    userInterface.print(birdRepository.getBirdList());
	    
	    userInterface.printAllFlyableBirds(birdRepository.getBirdList()); 
	}
}
