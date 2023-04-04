package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

	WebDriver driver;

	@BeforeMethod
	public void stepUp() {
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();
	}

	@Test
	public void testMethod1() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}
