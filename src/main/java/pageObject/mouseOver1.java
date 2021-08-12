package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


public class mouseOver1
{
	WebDriver driver;
	By hover1=By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[4]/div/a");
	By hover2=By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[2]/div/a");
	//Actions a;
	
	public mouseOver1(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
public void mousehover() 
	{
	Actions a= new Actions(driver);
	a.moveToElement(driver.findElement(hover1)).build().perform();
	}
public void mousehover1()
{	Actions a= new Actions(driver);
	a.moveToElement(driver.findElement(hover2)).build().perform();
}

	
	
}
