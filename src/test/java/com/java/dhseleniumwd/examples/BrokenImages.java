package com.java.dhseleniumwd.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpResponse;

public class BrokenImages {
	
	WebDriver driver;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/./Drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void findBrokenImagesTest() {
		try {
			int invalidImagesCount = 0;
			driver.get("http://the-internet.herokuapp.com/broken_images");
			List<WebElement> listOfImages = driver.findElements(By.tagName("img"));
			for (WebElement ele : listOfImages) {
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(ele.getAttribute("src"));
				System.out.println("Current Image URL is: " + request);
				HttpResponse response = client.execute(request);
				System.out.println("Current Image response code is: " + response);
				if (response.getStatusLine().getStatusCode() != 200) {
					invalidImagesCount++;
				}
			}
			System.out.println("Total Invalid images in the current webpage are: " + invalidImagesCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}