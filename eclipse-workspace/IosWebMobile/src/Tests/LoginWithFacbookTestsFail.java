package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginWithFacbookTestsFail extends BaseTest3
{
	@Test(priority = 2,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		LoginPage login = new LoginPage(driver);
		login.FillusernameOfFacbook("luzifere11@gmail.com");
		login.FillPasswordOfFacbook("inonab1565");
		login.scrollDown();
		login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongPassword()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.Sleep(200);
	    driver.findElement(By.xpath("//*[@src='../images/icon_facebook.gif']")).click();
		driver.findElement(By.xpath("//*[@src='../images/icon_facebook.gif']")).click();
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inon44ab1565");
		login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void LoginWithFacbook()
	{
		LoginPage login = new LoginPage(driver);
		//login.ClickLoginButton();
		//login.Sleep(200);
	   // driver.findElement(By.xpath("//*[@src='../images/icon_facebook.gif']")).click();
		//driver.findElement(By.xpath("//*[@src='../images/icon_facebook.gif']")).click();
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inonab1565");
		login.ClickLoginButtonOfFacbook();
		login.Sleep(300);
		LoginPage.ExplicityWaitIsClickable(By.xpath("//button[@name='__CONFIRM__']"));
		//login.ClickConfirm();
		login.Sleep(300);
		Assert.assertTrue(login.ElementDisplay("//div//span[text()[contains(.,'Book A Stylist')]]"));
	}
}
