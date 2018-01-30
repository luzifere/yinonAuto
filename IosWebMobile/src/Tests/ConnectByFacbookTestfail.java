package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ConnectByFacbookPage;
import PageObjects.LoginPage;

public class ConnectByFacbookTestfail extends BaseTest2
{
	@Test(priority = 3,groups={"sanity-group"})
	public void ConnectByFacbookWrongUserName() 
	{
		ConnectByFacbookPage cf = new ConnectByFacbookPage(driver);
		cf.Sleep(200);
	    driver.findElement(By.xpath("//*[@src='../images/icon_facebook.gif']")).click();
		driver.findElement(By.xpath("//*[@src='../images/icon_facebook.gif']")).click();
		cf.Sleep(200);
		cf.FillusernameOfFacbook("ooooooo");
		cf.FillPasswordOfFacbook("inonab1565");
		cf.ClickLoginButtonOfFacbook();
		Assert.assertTrue(cf.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void ConnectByFacbookWrongPassword() 
	{
		ConnectByFacbookPage cf = new ConnectByFacbookPage(driver);
		cf.FillusernameOfFacbook("luzifere@gmail.com");
		cf.FillPasswordOfFacbook("jhvjhgvjghv");
		cf.ClickLoginButtonOfFacbook();
		Assert.assertTrue(cf.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void ConnectByFacbook() 
	{
		ConnectByFacbookPage cf = new ConnectByFacbookPage(driver);
		cf.Sleep(200);
		cf.FillusernameOfFacbook("luzifere@gmail.com");
		cf.FillPasswordOfFacbook("inonab1565");
		cf.ClickLoginButtonOfFacbook();
		LoginPage login = new LoginPage(driver);
		login.ClickConfirm();
		driver.quit();
	}
}
