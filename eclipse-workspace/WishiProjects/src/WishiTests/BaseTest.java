package WishiTests;

//import java.awt.Dimension;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import PageObject.LoginPage;
import dataProvider.ConfigFileReader;



public class BaseTest 
{
	WebDriver driver;
	ConfigFileReader configFileReader;

	@BeforeClass
	(groups={"sanity-group"})
	public void setup()
	{
		configFileReader= new ConfigFileReader();
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
		driver.get(configFileReader.getApplicationUrl());
		  try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  //driver.manage().window().setSize(new Dimension(2560,1440));

		//driver.manage().window().maximize();
		  Point point = new Point(0, -1000);
		  driver.manage().window().setPosition(point);
		  Dimension dimension = new Dimension(1600, 1200);
		  driver.manage().window().setSize(dimension);
		  //driver.manage().window().setSize(new Dimension(1600,900));

		
	}
	
	@AfterClass
	public void tearDown(){
	}
	
}
