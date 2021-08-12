package ShoppingApp.Myntra;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.loginPOM;
import pageObject.wishlist;
import resources.Base;
@Test
public class WishList_Test extends Base {
	WebDriver driver;
	
	public void wishList_NoLogin_Text() throws IOException
	{
		driver = browserInitialize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		wishlist WL = new wishlist(driver);
		WL.wishlistClick().click();
		String a = WL.Text().getText();
		assertEquals(a, "PLEASE LOG IN");
		
	}
	public void wishList_NoLogin() throws IOException, InterruptedException
	{
		driver = browserInitialize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		wishlist WL = new wishlist(driver);
		WL.wishlistClick().click();
		WL.wishLoginClick().click();
		String a=driver.getCurrentUrl();
		assertEquals(a, "https://www.myntra.com/login?referer=https://www.myntra.com/wishlist");
		
	}
	
	
	
}
