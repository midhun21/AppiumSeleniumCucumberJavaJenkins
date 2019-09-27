package com.java.dhseleniumwd.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ScrollToElement {

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
		WebElement element = driver.findElement(By.linkText("How To Generate A List Of Tags from Your Tests"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		// Using Actions Class
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		if (driver.findElement(By.linkText("How To Generate A List Of Tags from Your Tests")).isDisplayed()) {
			Reporter.log("Element: " + element.getText() + " is found!!!!", true);
		} else {
			Reporter.log("Element: " + element.getText() + " not yet found!!!!", false);
		}
		
		// Scroll up the list to find the element
		element.sendKeys(Keys.ARROW_UP);
		// Scroll down the list to find the element
		element.sendKeys(Keys.ARROW_DOWN);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}