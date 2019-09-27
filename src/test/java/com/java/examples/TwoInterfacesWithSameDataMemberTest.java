package com.java.examples;

interface intfOne {
	// Data member which is public, static & final
	int numberValue = 20;
}

interface intfTwo {
	// Data member which is public, static & final
	int numberValue = 30;
}

public class TwoInterfacesWithSameDataMemberTest implements intfOne, intfTwo {

	public static void main(String[] args) {

		System.out.println("Value of intfOne's numberValue is: " + intfOne.numberValue);
		System.out.println("Value of intfTwo's numberValue is: " + intfTwo.numberValue);
	}
}
