package com.divae.test.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebDriverFactory {

	public static WebDriver createWebDriver() {
		WebDriver driver;
		
		String browserName = System.getProperty("browserName");
		if (browserName != null) {
			
			if ("Firefox".equals(browserName))
				driver = new FirefoxDriver();
			else if ("Internet Explorer".equals(browserName))
				driver = new InternetExplorerDriver();
			else if ("Chrome".equals(browserName))
				driver = new ChromeDriver();
			else
				driver = new HtmlUnitDriver();
		} else
			driver = new HtmlUnitDriver();

		System.out.println("Using " + driver.getClass().getName() + " for testing");
		
		
		// DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		// capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		// true);
		// driver = new InternetExplorerDriver(capabilities);
		
		
		return driver;
	}
	
}
