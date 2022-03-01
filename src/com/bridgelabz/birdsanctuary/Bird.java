package com.bridgelabz.birdsanctuary;

public class Bird {
	
	String birdName; 
	String birdColour;
	
	@Override
	public String toString() {
		return "Bird [name=" + birdName + ", colour=" + birdColour + "]";
	
	}
	
	public void eat() {
		System.out.println(getClass().getSimpleName() + " eat insects");
	}
	
	public void fly() {
		System.out.println(getClass().getSimpleName() + " can fly");
	}
	
	public void swim() {
		System.out.println(getClass().getSimpleName() + " can swim");
	}
}
