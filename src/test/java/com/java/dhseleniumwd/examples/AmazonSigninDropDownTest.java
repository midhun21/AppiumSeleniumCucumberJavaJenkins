package com.java.dhseleniumwd.examples;

import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.Assert;
import org.testng.Reporter;

public class AmazonSigninDropDownTest {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void amazonSigninDropdownTest() {
		Actions builder = new Actions(driver);
		String signinButton, newCustomerLink, yourListsLabel, yourListsWebElementTitle, yourAccoutLabel,
				yourAccountsWebElementTitle;
		WebElement accountsListNavLink = driver.findElement(By.id("nav-link-accountList"));
		builder.moveToElement(accountsListNavLink).perform();
		signinButton = driver.findElement(By.className("nav-action-inner")).getText();
		newCustomerLink = driver.findElement(By.id("nav-flyout-ya-newCust")).getText();
		yourListsLabel = driver.findElement(By.id("nav-al-title")).getText();

		Assert.assertEquals(signinButton, "Sign in",
				"Sign In button is dislpayed when mouse hovered on Accounts list Navigation link.");
		Assert.assertEquals(newCustomerLink, "New customer? Start here.",
				"Link to create a new customer is displayed.");
		Assert.assertEquals(yourListsLabel, "Your Lists", "Your Lists label is displayed in Accounts & List popup.");

		List<WebElement> yourListsWebElements = driver.findElements(By.xpath("//*[@id='nav-al-wishlist']/a"));

		for (int i = 0; i < yourListsWebElements.size(); i++) {
			yourListsWebElementTitle = driver
					.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[" + (i + 1) + "]/span")).getText();
			Reporter.log(yourListsWebElementTitle + " is displayed under Your Lists in Accounts & List popup.");
		}

		yourAccoutLabel = driver.findElement(By.xpath("//*[@id='nav-al-your-account']/div[1]")).getText();
		Assert.assertEquals(yourAccoutLabel, "Your Account",
				"Your Account label is displayed in Accounts & List popup");

		List<WebElement> yourAccountsWebElements = driver.findElements(By.xpath("//*[@id='nav-al-your-account']/a"));

		Reporter.log("***************************************************************************");
		for (int i = 0; i < yourAccountsWebElements.size(); i++) {
			yourAccountsWebElementTitle = driver
					.findElement(By.xpath("//*[@id='nav-al-your-account']/a[" + (i + 1) + "]/span")).getText();
			Reporter.log(yourAccountsWebElementTitle + " is displayed under Your Account in Accounts & List popup.");
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
