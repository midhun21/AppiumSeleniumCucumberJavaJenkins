package com.java.testng.examples;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class SoftAssertionsWithOneSAObjForEachTest {

	String className = "SoftAssertion";

	@Test
	public void softAssertionPassed() {
		SoftAssert softAssertObj1 = new SoftAssert();
		softAssertObj1.assertTrue(true == true);
		softAssertObj1.assertEquals(className, "SoftAssertion");
		softAssertObj1.assertEquals("SoftAssertion", "SoftAssertion");
		System.out.println("Soft Assertions Passed!!!");
		softAssertObj1.assertAll();
	}

	@Test
	public void softAssertionFailed() {
		SoftAssert softAssertObj2 = new SoftAssert();
		softAssertObj2.assertTrue(true == true);
		softAssertObj2.assertEquals(className, "ABCD");
		softAssertObj2.assertEquals("SoftAssertion", "SoftAssertion");
		System.out.println("Last Statement Gets Executed!!!");
		softAssertObj2.assertAll();
	}

}
