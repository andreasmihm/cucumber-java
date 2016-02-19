package feature.smb76;

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

public class SMBSteps {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = WebDriverFactory.createWebDriver();

	}

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

	@When("^user clicks on button '(.+)'$")
	public void user_clicks_on_button_SignIn_On_LoginPage(String buttonRef) throws Throwable {
		SMBElements.getWebElementByRef(driver, buttonRef).click();
	}	
	
	@When("^user clicks on link with xpath '(.+)'$")
	public void user_clicks_on_link_with_xpath_id(String xpath)
			throws Throwable {
		driver.findElement(By.xpath(xpath)).click();
		// dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user clicks on link '(.+)'$")
	public void user_clicks_on_link(String ref)
			throws Throwable {
		SMBElements.getWebElementByRef(driver, ref).click();
		// dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Then("^the text '(.+)' should appear in element '(.+)'$")
	public void the_text_should_appear_in_element(
			String expectedText, String ref) throws Throwable {

		String actualText = SMBElements.getWebElementByRef(driver, ref).getText();
		Assert.assertTrue("Text not found", actualText.contains(expectedText));

	}

	@After
	public void cleanUp() {
		driver.quit();
	}
}