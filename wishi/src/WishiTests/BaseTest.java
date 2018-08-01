package WishiTests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObject.LoginPage;



public class BaseTest 
{
	WebDriver driver;

	@BeforeClass
	(groups={"sanity-group"})
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/yinonwishi/Downloads/chromedriver 3");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://stage.wishi.me/app/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown(){
	}
	
}
