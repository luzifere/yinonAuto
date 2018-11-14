package WishiTests;

import java.awt.Dimension;
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
		System.setProperty("webdriver.chrome.driver", "/Users/yinonwishi/Downloads/chromedriver 6");
	    driver = new ChromeDriver();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.get("https://stage.wishi.me");
		  try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  //driver.manage().window().setSize(new Dimension(2560,1440));

		//driver.manage().window().maximize();
		  //driver.manage().window().setSize(new Dimension(1600,900));

		
	}
	
	@AfterClass
	public void tearDown(){
	}
	
}
