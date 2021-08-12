package ShoppingApp.Myntra;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import pageObject.navigationBar;
import resources.Base;
@Test
public class selectNavigatioon extends Base {
	WebDriver driver;
	public void Navigation() throws IOException 
	{
		driver = browserInitialize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/shop/men");
		navigationBar w=new navigationBar(driver);
		w.navBar().click();
		w.navTitleBar().click();
		w.navTitleBar().getText();
		
		System.out.println(w.navTitleBar().getText());
		
	}
}
