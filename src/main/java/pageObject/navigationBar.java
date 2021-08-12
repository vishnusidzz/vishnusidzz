package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigationBar {
	
	
	
	WebDriver driver;
	By Nav = By.xpath("//*[ contains (text(), 'MEN' ) ][1]");
	By NavTitlePage = By.xpath("//a[@data-group='men']");
	public navigationBar(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
		
		public WebElement navBar()
		{
			return driver.findElement(Nav);
		}
		public WebElement navTitleBar()
		{
			return driver.findElement(NavTitlePage);
		}
	
	
	}

