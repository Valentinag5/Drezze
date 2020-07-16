package com.emtelco.certificacion.utils.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OwnWebDriver {

	private WebDriver driver;

	private OwnWebDriver() {
	
	}
	
	public static OwnWebDriver nuevo() {
		return new OwnWebDriver();
	}

	public WebDriver chrome(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized", "--disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
	public WebDriver internetExplorer(String url) {
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

}
