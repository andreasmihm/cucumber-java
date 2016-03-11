package com.divae.test.base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.divae.test.base.WebDriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * contains the test step implementations, which is used in the subclasses,
 * unfortunately the annotations don't support inheritance, which means, they
 * need to be defined again in the subclasses
 * 
 * @author mihm
 *
 */
public class BasicWebDriverSteps {

	protected WebDriver driver;
	protected IPageElements webElements;

	@Given("^user navigates to '(.+)'$")
	public void user_navigates_to(String url) throws Throwable {
		driver.get(url);
		// System.out.println(driver.getPageSource());
		try {
			driver.findElement(By.id("overridelink")).click();
		} catch (NoSuchElementException e) {
			// do nothing since there was no ssl cert warning
		}
		// driver.get("javascript:document.getElementById('overridelink').click();");
		driver.get(url);
	}

	@When("^user enters '(.+)' in input '(.+)'$")
	public void user_fills_field(String input, String inputRef) throws Throwable {
		webElements.getWebElementByRef(driver, inputRef).sendKeys(input);
	}
	//
	// @When("^user clicks on button with xpath '(.+)'$")
	// public void user_clicks_on_button_with_xpath_id(String xpath)
	// throws Throwable {
	// driver.findElement(By.xpath(xpath)).click();
	// // dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// }

	@When("^user clicks on button '(.+)'$")
	public void user_clicks_on_button(String buttonRef) throws Throwable {
		webElements.getWebElementByRef(driver, buttonRef).click();
	}

	// @When("^user clicks on link with xpath '(.+)'$")
	// public void user_clicks_on_link_with_xpath_id(String xpath)
	// throws Throwable {
	// driver.findElement(By.xpath(xpath)).click();
	// // dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// }

	@When("^user clicks on link '(.+)'$")
	public void user_clicks_on_link(String ref) throws Throwable {
		webElements.getWebElementByRef(driver, ref).click();
		// dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Then("^the text '(.+)' should appear in element '(.+)'$")
	public void the_text_should_appear_in_element(String expectedText, String ref) throws Throwable {

		String actualText = webElements.getWebElementByRef(driver, ref).getText();
		Assert.assertTrue("Text not found", actualText.contains(expectedText));

	}

}