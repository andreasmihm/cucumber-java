package feature.smb77;

import com.divae.test.base.BasicWebDriverSteps;
import com.divae.test.base.WebDriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SMBSteps extends BasicWebDriverSteps{

	@Before
	public void setUp() {
		driver = WebDriverFactory.createWebDriver();
		webElements = new SMBElements();
	}

	@Given("^user navigates to '(.+)'$")
	public void user_navigates_to(String url) throws Throwable {
		super.user_navigates_to(url);
	}

	@When("^user enters '(.+)' in input '(.+)'$")
	public void user_fills_field(String input, String inputRef)
			throws Throwable {
		super.user_fills_field(input, inputRef);
	}

	@When("^user clicks on button '(.+)'$")
	public void user_clicks_on_button(String buttonRef) throws Throwable {
		super.user_clicks_on_button(buttonRef);
	}	
	
//	@When("^user clicks on link with xpath '(.+)'$")
//	public void user_clicks_on_link_with_xpath_id(String xpath)
//			throws Throwable {
//		driver.findElement(By.xpath(xpath)).click();
//		// dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	}

	@When("^user clicks on link '(.+)'$")
	public void user_clicks_on_link(String ref)
			throws Throwable {
		super.user_clicks_on_link(ref);
	}
	
	@Then("^the text '(.+)' should appear in element '(.+)'$")
	public void the_text_should_appear_in_element(
			String expectedText, String ref) throws Throwable {

		super.the_text_should_appear_in_element(expectedText, ref);

	}

	@After
	public void cleanUp() {
		
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
}