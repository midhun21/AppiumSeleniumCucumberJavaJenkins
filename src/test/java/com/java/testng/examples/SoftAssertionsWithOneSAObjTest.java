package com.java.testng.examples;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class SoftAssertionsWithOneSAObjTest {
	
	SoftAssert softAssertObj = new SoftAssert();
	String className = "SoftAssertion";
	
	@Test
	public void softAssertionPassed() {
		softAssertObj.assertTrue(true == true);
		softAssertObj.assertEquals(className, "SoftAssertion");
		softAssertObj.assertEquals("SoftAssertion", "SoftAssertion");
		System.out.println("Soft Assertions Passed!!!");
		softAssertObj.assertAll();
	}
	
	@Test
	public void softAssertionFailed() {
		softAssertObj.assertTrue(true == true);
		softAssertObj.assertEquals(className, "ABCD");
		softAssertObj.assertEquals("SoftAssertion", "SoftAssertion");
		System.out.println("Last Statement Gets Executed!!!");
		softAssertObj.assertAll();
	}

}
