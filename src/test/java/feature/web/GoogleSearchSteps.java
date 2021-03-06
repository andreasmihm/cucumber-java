package feature.web;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.divae.test.base.WebDriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = WebDriverFactory.createWebDriver();

	}
	
	
	
	@Given("^user navigates to '(.+)'$")
	public void user_navigates_to_www_google_de(String url) throws Throwable {
		driver.get(url);
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//String blah = dr.getPageSource();
	}

	@When("^user enters '(.+)' in searchfield$")
	public void user_enters_diva_e_in_searchfield(String searchkey) throws Throwable {
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(searchkey);
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ESCAPE);
		
		//dr.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rso")));		
	}

	@Then("^the text '(.+)' should appear in search result$")
	public void the_text_diva_e_Digital_Value_Enterprise_should_appear_in_search_result(String expectedResult) throws Throwable {
		//System.out.println(dr.findElement(By.xpath("//*[@id='rso']")).getText());
		Assert.assertTrue("Search not successful",driver.findElement(By.xpath("//*[@id='rso']")).getText().contains(expectedResult));
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