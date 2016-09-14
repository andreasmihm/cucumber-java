package com.divae.test.base;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

/**
 * returns the WebDriver class to be used with browser specific settings
 * 
 * @author mihm
 *
 */
public class WebDriverFactory {

	public static WebDriver createWebDriver() {
		WebDriver driver;

		String browserName = System.getProperty("browserName");
		if (browserName != null) {

			if ("Firefox".equals(browserName)) {
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				//FirefoxProfile firefoxProfile = new FirefoxProfile();
				//firefoxProfile.setAcceptUntrustedCertificates(true);
				driver = new FirefoxDriver(capabilities);
			}
			else if ("Internet Explorer".equals(browserName)) {
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				driver = new InternetExplorerDriver(capabilities);
			} else if ("Chrome".equals(browserName)) {
				
				ChromeOptions co = new ChromeOptions();
		        co.setBinary(new File("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"));
		        // here "--start-maximized" argument is responsible to maximize chrome browser
		        co.addArguments("disable-extensions");
		        co.addArguments("--start-maximized");
		        System.setProperty("org.apache.commons.logging.Log",
		                "org.apache.commons.logging.impl.Jdk14Logger");
		        //System.setProperty("webdriver.chrome.driver",
		        //"C:\\Users\\devtesting\\Documents\\Workspace\\chromedriver.exe");

		       // System.setProperty("webdriver.chrome.driver",
		                //"C:\\Users\\devtesting\\AppData\\Local\\Google\\Chrome SxS\\Application\\chrome.exe");
				
				driver = new ChromeDriver(co);
			}
			else if ("Safari".equals(browserName))
				driver = new SafariDriver();
			else
				driver = new HtmlUnitDriver();
		} else
			driver = new HtmlUnitDriver();

		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().setSize(new Dimension(1024, 768));
		// driver.manage().window().setSize(new Dimension(640,1136)); // iPhone
		// 5

		System.out.println("Using " + driver.getClass().getName() + " for testing");

		return driver;
	}

}
