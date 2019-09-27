package com.java.dhseleniumwd.examples;

import com.java.dhseleniumwd.domainobject.BaseClass;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

public class CheckboxesTest extends BaseClass {

	// public WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(URL + "/checkboxes");
		driver.manage().window().maximize();
	}

	@Test
	public void checkboxDiscoverTest() {
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		System.out.println("With .attribute('checked')");
		for (WebElement checkbox : checkboxes) {
			System.out.println(checkbox.getAttribute("checked"));
		}

		System.out.println("\nWith .selected");
		for (WebElement checkbox : checkboxes) {
			System.out.println(checkbox.isSelected());
		}
	}

	@Test
	public void checkboxOption1Test() {
		WebElement checkbox1 = driver.findElement(By.cssSelector("form input:nth-of-type(1)"));
		Assert.assertNull(checkbox1.getAttribute("checked"), "By default Checkbox 1 get attribute is Null");
		Assert.assertFalse(checkbox1.isSelected(), "By default Checkbox 1 is not selected.");
	}

	@Test
	public void checkboxOption2Test() {
		WebElement checkbox2 = driver.findElement(By.cssSelector("form input:nth-of-type(2)"));
		Assert.assertNotNull("By default Checkbox 2 get attribute is Not Null", checkbox2.getAttribute("checked"));
		Assert.assertEquals(checkbox2.getAttribute("checked"), "true",
				"By default Checkbox 2 get attribute value is True");
		Assert.assertTrue(checkbox2.isSelected(), "By default Checkbox 2 is selected.");
	}

	@Test
	public void selectACheckboxTest() {
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		/*
		 * Select the checkbox which is unselected by default and assert the newly
		 * selected checkbox
		 */
		for (WebElement checkbox : checkboxes) {
			System.out.println("Check box text is: " + checkbox.getAttribute("checked"));
			if (checkbox.getAttribute("checked") == null) {
				checkbox.click();
			}
		}

		checkboxes = driver.findElements(By.cssSelector("input:checked[type='checkbox']"));
		for (WebElement checkbox : checkboxes) {
			Assert.assertNotNull(checkbox.getText() + " is Checked", checkbox.getAttribute("checked"));
			Assert.assertEquals(checkbox.getAttribute("checked"), "true",
					checkbox.getText() + " get attribute value is True");
			Assert.assertTrue(checkbox.isSelected(), checkbox.getText() + " is selected");
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
