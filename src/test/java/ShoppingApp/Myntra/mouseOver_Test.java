package ShoppingApp.Myntra;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.mouseOver1;
import resources.Base;

public class mouseOver_Test extends Base{


	WebDriver driver;
	
	@Test
public  void testData() throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	
driver = browserInitialize();
driver.get("https://www.myntra.com/shop/men");
mouseOver1 mo = new mouseOver1(driver);
mo.mousehover();
mo.mousehover1();
}

	
	
}
