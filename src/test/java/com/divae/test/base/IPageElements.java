package com.divae.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IPageElements {

	/**
	 * returns a WebElement by a given ref, for every website to be tested this
	 * interface needs to be implemented to find the WebElements mentioned in
	 * the test scenarios and it needs to be set in the subclasses of {@link BasicWebDriverSteps} 
	 * 
	 * @param driver
	 * @param ref
	 * @return
	 */
	public WebElement getWebElementByRef(WebDriver driver, String ref);
}
