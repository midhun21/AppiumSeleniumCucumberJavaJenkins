package com.java.examples;

import org.testng.annotations.Test;

public class DefaultConstructorTest {
	
	public DefaultConstructorTest() {
		System.out.println("Default Constructor");
	}
	
	@Test
	public void defaultConstructor() {
		System.out.println("#####");
		@SuppressWarnings("unused")
		DefaultConstructorTest defaultC = new DefaultConstructorTest();
	}

}
