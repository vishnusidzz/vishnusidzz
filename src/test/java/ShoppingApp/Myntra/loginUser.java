package ShoppingApp.Myntra;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import pageObject.loginPOM;
import resources.Base;
@Test
public class loginUser extends Base {
	
	
		WebDriver driver;
	public  void testData() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	driver = browserInitialize();
	driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
	loginPOM l = new loginPOM(driver);
	l.loginnumber().sendKeys("000000000");
	l.Button().click();
	l.errorMessage().getText();
	assertTrue(true, "Please enter a valid mobile number (10 digits)");
	Thread.sleep(3000);
	l.loginnumber().clear();
	l.loginnumber().sendKeys("snmhdsjdk");
	l.Button().click();
	l.errorMessage().getText();
	assertTrue(false, "Please enter a valid mobile number (10 digits)");
	Thread.sleep(3000);

	
	
	}
	

}
