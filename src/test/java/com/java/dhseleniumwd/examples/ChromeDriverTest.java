package com.java.dhseleniumwd.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class ChromeDriverTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void searchTextTest() {
		driver.get("http://the-internet.herokuapp.com/");
		String getTitle = driver.getTitle();
		System.out.println("Google website title is: " + getTitle);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}