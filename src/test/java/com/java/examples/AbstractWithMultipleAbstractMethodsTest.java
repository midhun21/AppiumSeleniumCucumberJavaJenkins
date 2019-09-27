package com.java.examples;

abstract class Furniture {
	// Abstract Method
	abstract void shape();

	// Abstract Method
	abstract void orientation();

	// Abstract Method
	abstract int sumOfTwo(int x, int y);
}

class Chair extends Furniture {

	// Implements shape() method
	public void shape() {
		System.out.println("Chair has 4 legs!!!");
	}

	// Implements size() method
	public void orientation() {
		System.out.println("Chair is Right oriented!!!!");
	}

	// Implements sumOfTwo() method
	public int sumOfTwo(int a, int b) {
		return a + b;
	}
}

class DiningTable extends Furniture {

	// Implements shape() method
	public void shape() {
		System.out.println("Dining Table has 4 or more legs!!!");
	}

	// Implements size() method
	public void orientation() {
		System.out.println("Dining Table is Left oriented!!!!");
	}

	// Implements sumOfTwo() method
	public int sumOfTwo(int a, int b) {
		return a + b;
	}
}

public class AbstractWithMultipleAbstractMethodsTest {
	public static void main(String[] args) {
		Furniture furnitureChair = new Chair();
		furnitureChair.shape();
		furnitureChair.orientation();
		System.out.println("Sum of two integers is: " + furnitureChair.sumOfTwo(10, 20));

		Furniture furnitureDiningTable = new DiningTable();
		furnitureDiningTable.shape();
		furnitureDiningTable.orientation();
		System.out.println("Sum of two integers is: " + furnitureDiningTable.sumOfTwo(30, 40));
	}
}
