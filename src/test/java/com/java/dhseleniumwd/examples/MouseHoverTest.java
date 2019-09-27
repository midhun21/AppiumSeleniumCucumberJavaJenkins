package com.java.dhseleniumwd.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

public class MouseHoverTest {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
	}

	@Test
	public void mouseHoverTest() {
		Actions builder = new Actions(driver);
		WebElement anAvatar = driver.findElement(By.className("figure"));
		String userName, viewProfileLinkLabel;
		builder.moveToElement(anAvatar).perform();
		if (driver.findElement(By.className("figcaption")).isDisplayed()) {
			Reporter.log("User additional information is displayed when mouse hovered on an avatar");
			userName = driver.findElement(By.xpath("//h5")).getText();
			viewProfileLinkLabel = driver.findElement(By.xpath("//a[contains(@href,'/users/1')]")).getText();
			Assert.assertEquals(userName, "name: user1", "Username displayed when mouse hovered on an avatar");
			Assert.assertEquals(viewProfileLinkLabel, "View profile",
					"Profile Link label displayed when mouse hovered on an avatar");
		} else {
			Reporter.log("User additional information is not displayed when mouse hovered on an avatar");
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
