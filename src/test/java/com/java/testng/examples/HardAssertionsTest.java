package com.java.testng.examples;

import org.testng.annotations.Test;
import org.testng.Assert;

public class HardAssertionsTest {

	String className = "Hard Assertion";

	@Test
	public void hardAssertionPassed() {
		Assert.assertTrue(true == true);
		Assert.assertEquals(className, "Hard Assertion");
		Assert.assertEquals("Hard Assertion", "Hard Assertion");
		System.out.println("Successfully Passed!!!");
	}

	@Test
	public void hardAssertionFailed() {
		Assert.assertTrue(true == true);
		Assert.assertEquals(className, "Hard Assert"); // This step fails and the next steps will not be executed
		Assert.assertEquals("Hard Assertion", "Hard Assertion");
		System.out.println("Successfully Passed!!!");
	}
}
