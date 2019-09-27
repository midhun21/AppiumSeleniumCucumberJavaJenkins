package com.java.examples;

interface intf1 {
	// Abstract Method
	public void method1();
}

interface intf2 extends intf1 {
	// Abstract Method
	public void method2();
}

public class InterfaceExtendsInterfaceTest implements intf2 {

	@Override
	public void method1() {
		System.out.println("Overridding method1() from intf1");
	}

	@Override
	public void method2() {
		System.out.println("Overridding method2() from intf2");
	}

	public static void main(String[] args) {
		intf2 intf2Obj = new InterfaceExtendsInterfaceTest();
		intf2Obj.method1();
		intf2Obj.method2();
	}
}
