package com.java.dhseleniumwd.examples;

import java.util.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectAnOptionFromADropDownListTest {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
	}

	@Test
	public void dropDownTest() {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		List<WebElement> listOfOptions = dropdown.findElements(By.tagName("option"));
		for (int i = 0; i < listOfOptions.size(); i++) {
			System.out.println("Option at position: " + i + " is: " + listOfOptions.get(i).getText());
			if (listOfOptions.get(i).getText().equals("Option 1")) {
				listOfOptions.get(i).click();
			}
		}
		String selectedOption = "";
		for (int i = 0; i < listOfOptions.size(); i++) {
			if (listOfOptions.get(i).isSelected()) {
				selectedOption = listOfOptions.get(i).getText();
			}
		}
		Assert.assertEquals("Select Option 1", selectedOption, "Option 1");
	}

	// Using Select Class
	@Test
	public void dropDownTextRedux() {
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Select selectList = new Select(driver.findElement(By.id("dropdown")));
		System.out.println("Default selected option is: " + selectList.getFirstSelectedOption().getText());
		selectList.selectByVisibleText("Option 1");
		// OR selectList.selectByValue("1");
		Assert.assertEquals("Option 1 is selected", selectList.getFirstSelectedOption().getText(), "Option 1");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
