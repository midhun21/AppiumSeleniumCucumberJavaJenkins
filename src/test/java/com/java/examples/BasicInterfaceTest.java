package com.java.examples;

interface Multiply {
	// Member which is public, static & final
	int defaultValue = 10;

	// Abstract Methods
	int multiplyTwo(int x, int y);

	int muliplyThree(int x, int y, int z);
}

public class BasicInterfaceTest implements Multiply {

	public int multiplyTwo(int a, int b) {
		return a * b;
	}

	public int muliplyThree(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		Multiply multiply = new BasicInterfaceTest();
		System.out.println("Default value is: " + defaultValue);
		System.out.println("Sum of two integers is: " + multiply.multiplyTwo(10, 20));
		System.out.println("Sum of two integers is: " + multiply.muliplyThree(10, 20, 30));
	}
}
