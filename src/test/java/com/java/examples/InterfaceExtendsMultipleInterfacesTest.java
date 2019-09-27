package com.java.examples;

interface interfA1 {
	public void displayA1();
}

interface interfA2 {
	public void displayA2();
}

interface interfA3 {
	public void displayA3();
}

interface interfA4 extends interfA1, interfA2, interfA3 {
	public void displayA4();
}

public class InterfaceExtendsMultipleInterfacesTest implements interfA4 {

	@Override
	public void displayA1() {
		System.out.println("Overriding interface interfA1 displayA1() method");
	}

	@Override
	public void displayA2() {
		System.out.println("Overriding interface interfA2 displayA2() method");
	}

	@Override
	public void displayA3() {
		System.out.println("Overriding interface interfA3 displayA3() method");
	}

	@Override
	public void displayA4() {
		System.out.println("Overriding interface interfA4 displayA4() method");
	}

	public static void main(String[] args) {
		interfA1 interfA1Obj = new InterfaceExtendsMultipleInterfacesTest();
		interfA1Obj.displayA1();

		interfA2 interfA2Obj = new InterfaceExtendsMultipleInterfacesTest();
		interfA2Obj.displayA2();

		interfA3 interfA3Obj = new InterfaceExtendsMultipleInterfacesTest();
		interfA3Obj.displayA3();

		interfA4 interfA4Obj = new InterfaceExtendsMultipleInterfacesTest();
		interfA4Obj.displayA1();
		interfA4Obj.displayA2();
		interfA4Obj.displayA3();
		interfA4Obj.displayA4();
	}
}