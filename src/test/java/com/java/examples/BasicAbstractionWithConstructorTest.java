package com.java.examples;

abstract class Bike {
	// Abstract Method
	abstract void run();
	
	// Constructor
	Bike() {
		System.out.println("Bike Class Constructor!!!");
	}
}

public class BasicAbstractionWithConstructorTest extends Bike {

	// Implementation of Abstract method
	public void run() {
		System.out.println("Abstraction Runs!!!");
	}

	public static void main(String[] args) {
		Bike bike = new BasicAbstractionWithConstructorTest();
		bike.run();
	}
}
