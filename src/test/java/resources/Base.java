package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
 
	public WebDriver driver;
	@BeforeTest
	public WebDriver browserInitialize() throws IOException 
	{
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Udemy\\eclipse\\Myntra\\src\\test\\java\\resources\\data.properties");
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		if(browserName.equals("chrome")) 
		{	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.getProperty("webdriver.chrome.driver", "D:\\Udemy\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.getProperty("D:\\Udemy\\chromedriver.exe");
		}
		else if (browserName.equals("IE"))
		{
			System.getProperty("D:\\Udemy\\chromedriver.exe");
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	@AfterClass(alwaysRun = true)
	public void Drivequit() 
	{
		driver.quit();
		driver=null;
		
	}
	
	
	
}
