package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInit {

	private static DriverInit instanceDriver = null;
	private WebDriver driver;

	private DriverInit() {

	}

	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeoption);
		return driver;

	}

	public static DriverInit getInstance() {
		if (instanceDriver == null)
			instanceDriver = new DriverInit();
		return instanceDriver;

	}

}
