package feature.smb76;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import com.divae.test.base.IPageElements;

public class SMBElements implements IPageElements {

	private static Hashtable<String, String> xpaths;
	
	static {
		xpaths = new Hashtable<String, String>();
		xpaths.put("Title_On_Cart",
				"/html/body/div[2]/div/div[1]/div[1]/div/h1/span[1]");
		xpaths.put("SignIn_On_LoginPage",
				"/html/body/div[2]/div/div[2]/div[1]/div/div/form/div[3]/div/button");
		xpaths.put("Header_On_MyAccount",
				"/html/body/div[2]/div/div[1]/ol/li[3]");
		xpaths.put("ProductTitle_On_ProductDetail",
				"/html/body/div[2]/div/div[1]/div[4]/div[3]");
		xpaths.put("FirstProductTitle_On_Cart","/html/body/div[2]/div/div[1]/div[2]/div/form/div/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/a");
		xpaths.put("Warning_On_LoginPage","/html/body/div[2]/div/div[2]/div[1]/div/div/div");
		xpaths.put("Home","/html/body/div[2]/div/div[1]/ol/li[1]/a");
		xpaths.put("1st_product_in_caroussel","/html/body/div[2]/div/div[3]/div[1]/div/div/div/div[5]/div/a");
		xpaths.put("AddToCart_On_ProductDetail","//*[@id=\"productDetailForm_11089966\"]/div[3]/button");
		xpaths.put("UserName","//*[@id=\"ShopLoginForm_Login\"]");
		xpaths.put("Password","//*[@id=\"ShopLoginForm_Password\"]");
	}

	public WebElement getWebElementByRef(WebDriver driver, String ref) {

		String xpath = xpaths.get(ref);
		if (xpath != null) {
			return driver.findElement(By.xpath(xpath));
		} else {
			return null;
		}

	}

}
