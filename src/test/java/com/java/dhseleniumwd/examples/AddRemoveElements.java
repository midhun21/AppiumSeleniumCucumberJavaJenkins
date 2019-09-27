package com.java.dhseleniumwd.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class AddRemoveElements {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void addRemoveElementsTest() {
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
