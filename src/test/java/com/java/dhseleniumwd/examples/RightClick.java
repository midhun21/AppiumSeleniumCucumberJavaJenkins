package com.java.dhseleniumwd.examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class RightClick {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void rightClickTest() {
		 driver.get("http://the-internet.herokuapp.com/context_menu");
	        WebElement menu = driver.findElement(By.id("hot-spot"));
	        Actions action = new Actions(driver);
	        action.contextClick(menu)
	                //.sendKeys(Keys.ARROW_DOWN)
	                //.sendKeys(Keys.ARROW_DOWN)
	                //.sendKeys(Keys.ARROW_DOWN)
	                .sendKeys(Keys.ENTER)
	                .perform();
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert);
	        //assertThat(alert.getText(), is(equals("You selected a context menu")));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}