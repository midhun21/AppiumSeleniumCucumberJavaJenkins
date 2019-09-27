package com.java.dhseleniumwd.examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class ScrollToTopAndBottomInAWebPage {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void searchTextTest() {
		driver.get("http://elementalselenium.com/tips");

		// Using JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll to the bottom of the web page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// Scroll to the top of the web page
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		// Scroll down with coordinates
		js.executeScript("window.scrollBy(0, 250)", "");
		// Scroll up with coordinates
		js.executeScript("window.scrollBy(0, -250)", "");

		// Using Actions Class
		Actions actions = new Actions(driver);
		// Scroll to the bottom of the web page
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		// Scroll to the top of the web page
		actions.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}