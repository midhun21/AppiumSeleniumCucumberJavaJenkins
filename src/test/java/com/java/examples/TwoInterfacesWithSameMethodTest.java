package com.java.examples;

interface intfcA {
	// Abstract Method
	public void commonMethod();
}

interface intfcB {
	// Abstract Method
	public void commonMethod();
}

public class TwoInterfacesWithSameMethodTest implements intfcA, intfcB {

	public void commonMethod() {
		System.out.println("This method is applicable for any Interface");
	}

	public static void main(String[] args) {
		intfcA intfcAObj = new TwoInterfacesWithSameMethodTest();
		intfcAObj.commonMethod();

		intfcB intfcBObj = new TwoInterfacesWithSameMethodTest();
		intfcBObj.commonMethod();
	}
}