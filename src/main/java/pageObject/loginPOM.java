package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginPOM {
	WebDriver driver;
	//Login
	By MobileNo =By.cssSelector("[class='form-control mobileNumberInput']");
	By ButtonClick = By.cssSelector("[class='submitBottomOption']");
	By Errormsg = By.cssSelector("[class='errorContainer']");
	
	//Navigation
	

	
	public  loginPOM(WebDriver driver) 
	{
		this.driver=driver;
	}
	public WebElement loginnumber()
	{
		return driver.findElement(MobileNo);
	}
	public WebElement Button()
	{
		return driver.findElement(ButtonClick);
	}
	public WebElement errorMessage()
	{
		return driver.findElement(Errormsg);
	}
	//nav
	
	
	
}
