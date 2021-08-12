package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wishlist {
	WebDriver driver;
By withOutLogin = By.xpath("//*[@id='mountPoint']/div/div[2]/div[1]/div[3]/a[1]/span[1]");
By TextAfterCLick = By.xpath("//*[@id='mountRoot']/div/div/div/div/div[1]");
By LoginClick = By.cssSelector("[class='wishlistLogin-button']");
	public wishlist(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement wishlistClick()
	{
	return driver.findElement(withOutLogin);
	}
	public WebElement Text()
	{	
	return driver.findElement(TextAfterCLick);
	}
	public WebElement wishLoginClick()
	{	
	return driver.findElement(LoginClick);
	}
	
	
}
