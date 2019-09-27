package com.java.examples;

interface intfA {
	// Abstract Method
	public int sumOfTwo(int x, int y);
}

interface intfB {
	// Absract Method
	public int sumOfThree(int x, int y, int z);
}

public class BasicTwoInterfacesTest implements intfA, intfB {

	@Override
	public int sumOfTwo(int a, int b) {
		return a + b;
	}

	@Override
	public int sumOfThree(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		intfA intfAObj = new BasicTwoInterfacesTest();
		System.out.println("Sum of two integers is: " + intfAObj.sumOfTwo(10, 20));

		intfB intfBObj = new BasicTwoInterfacesTest();
		System.out.println("Sum of three integers is: " + intfBObj.sumOfThree(10, 20, 30));
	}
}