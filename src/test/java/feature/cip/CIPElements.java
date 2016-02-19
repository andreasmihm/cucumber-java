package feature.cip;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CIPElements {

	private static Hashtable<String, String> xpaths;
	
	static {
		xpaths = new Hashtable<String, String>();
		xpaths.put("Title_On_Cart",
				"/html/body/div[1]/div[2]/div/div[1]/div/h1");
		xpaths.put("SignIn_On_LoginPage",
				"//*[@id=\"login-user-form\"]/div[3]/button");
		xpaths.put("Header_On_MyAccount",
				"/html/body/div[1]/div[2]/div[1]/ol/li[3]");
		xpaths.put("ProductTitle_On_ProductDetail",
				"/html/body/div[1]/div[2]/div[1]/div[4]/div/h1");
		xpaths.put("FirstProductTitle_On_Cart","/html/body/div[1]/div[2]/div/div[2]/div[1]/form/div[2]/div/table/tbody/tr/td[3]/div[1]/a");
		xpaths.put("Warning_On_LoginPage","/html/body/div[1]/div[2]/div[2]/div[1]/div/div");
		xpaths.put("ZeissLogo","/html/body/div[1]/div[1]/div[4]/a");
		xpaths.put("1st_product_in_caroussel","/html/body/div[1]/div[2]/div[4]/div/div/div/div/ul/li[1]/div/a/span[3]");
		xpaths.put("AddToCart_On_ProductDetail","/html/body/div[1]/div[2]/div/div[4]/div/form/div[4]/button");
	}

	public static WebElement getWebElementByRef(WebDriver driver, String ref) {

		String xpath = xpaths.get(ref);
		if (xpath != null) {
			return driver.findElement(By.xpath(xpath));
		} else {
			return null;
		}

	}

}
