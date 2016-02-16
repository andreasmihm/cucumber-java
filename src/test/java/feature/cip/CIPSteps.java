package feature.cip;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CIPSteps {

	WebDriver driver = new FirefoxDriver();

	@Given("^user navigates to '(.+)'$")
	public void user_navigates_to(String url) throws Throwable {
		driver.get(url);
		driver.get(url);
	}

	@When("^user enters '(.+)' in input with id '(.+)'$")
	public void user_fills_field_by_id(String input, String id)
			throws Throwable {
		driver.findElement(By.id(id)).sendKeys(input);
	}

	@When("^user clicks on button with xpath '(.+)'$")
	public void user_clicks_on_button_with_xpath_id(String xpath)
			throws Throwable {
		driver.findElement(By.xpath(xpath)).click();
		// dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user clicks on link with xpath '(.+)'$")
	public void user_clicks_on_link_with_xpath_id(String xpath)
			throws Throwable {
		driver.findElement(By.xpath(xpath)).click();
		// dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Then("^the text '(.+)' should appear in element with xpath '(.+)'$")
	public void the_text_should_appear_in_element_with_xpath(
			String expectedText, String xpath) throws Throwable {

		String actualText=driver.findElement(By.xpath(xpath)).getText();
        Assert.assertTrue("Text not found",actualText.contains(expectedText));		

	}
}