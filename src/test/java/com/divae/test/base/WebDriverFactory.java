package com.divae.test.base;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriverFactory {

	public static WebDriver createWebDriver() {
		WebDriver driver;
		
		String browserName = System.getProperty("browserName");
		if (browserName != null) {
			
			if ("Firefox".equals(browserName))
				driver = new FirefoxDriver();
			else if ("Internet Explorer".equals(browserName)) {
				 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				 true);
				 driver = new InternetExplorerDriver(capabilities);
			}
			else if ("Chrome".equals(browserName))
				driver = new ChromeDriver();
			else
				driver = new HtmlUnitDriver();
		} else
			driver = new HtmlUnitDriver();

		driver.manage().window().setPosition(new Point(0,0));
		driver.manage().window().setSize(new Dimension(1024,768));
		
		System.out.println("Using " + driver.getClass().getName() + " for testing");
		
		
		
		
		return driver;
	}
	
}
