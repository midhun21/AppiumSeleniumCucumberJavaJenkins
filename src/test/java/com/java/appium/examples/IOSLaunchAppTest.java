package com.java.appium.examples;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import com.java.dhseleniumwd.domainobject.BaseClass;

public class IOSLaunchAppTest extends BaseClass {
	// WebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Desired Capabilities For iOS Simulator

		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "12.2");
		capabilities.setCapability("udid", "0AFA6845-CA86-4684-BF5B-446BF53A06B4");
		capabilities.setCapability("app", "/Users/midhungollapalli/Desktop/Automation/IPA_Files/Lyric4_4900055.app");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("fullReset", "false");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("deviceName", "iPhone 8 Plus");

		// Desired Capabilities For iOS Device
		/*
		 * capabilities.setCapability("platformName", "iOS");
		 * capabilities.setCapability("platformVersion", "12.2");
		 * capabilities.setCapability("udid","56a5e8846a40a0a850c85fd4cbe451772488da22")
		 * ; capabilities.setCapability("app",
		 * "/Users/midhungollapalli/Desktop/Automation/IPA_Files/Lyric_Platform_iOS_41001137.ipa"
		 * ); capabilities.setCapability("noReset","true");
		 * capabilities.setCapability("fullReset","false");
		 * capabilities.setCapability("automationName","XCUITest");
		 * capabilities.setCapability("deviceName","iPhone");
		 */

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test
	public void testCreateAccountButton() throws Exception {

		if (driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Create Account']")).isEnabled()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
