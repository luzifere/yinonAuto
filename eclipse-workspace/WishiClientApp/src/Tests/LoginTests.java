package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

@Listeners(Tests.Listener.class)

public class LoginTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void FillPasswordWithOutToFillEmail() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillpassword("123456");
		login.CheckIfElementEnabled("//*[@name='loginButtonSecondID']");
		Assert.assertFalse(login.ElementEnable("//*[@name='loginButtonSecondID']"));	
		
	}
    @Test(priority = 2,groups={"sanity-group"})
	public void FillPasswordWithOutToFillPassword() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClearPassword();
		login.Fillusername("yinon@gmail.com");
		login.CheckIfElementEnabled("//*[@name='loginButtonSecondID']");
		Assert.assertFalse(login.ElementEnable("//*[@name='loginButtonSecondID']"));	
		
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void FillPasswordWithWrongEmail() 
	{
		LoginPage login = new LoginPage(driver);
		login.FillusernameClear("yinonjhjn@gmail.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		Assert.assertTrue(login.ElementDisplay("//*[@name='Dismiss']"));	
		login.ClickDismiss();

	}
	@Test(priority = 4,groups={"sanity-group"})
	public void FillPasswordWithWrongPassword() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClearUsername();
		login.Fillusername("yinon@gmail.com");
		login.Fillpassword("1234zdfzdf56");
		login.ClickLoginButton2();
		Assert.assertTrue(login.ElementDisplay("//*[@name='Dismiss']"));	
		login.ClickDismiss();

		
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void ClickLoginwWithOutToFillAnyFields() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClearUsername();
		login.ClearPassword();
		login.ClickLoginButton2();
		Assert.assertFalse(login.ElementEnable("//*[@name='loginButtonSecondID']"));	
		
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Fillusername("yinon@gmail.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.AcceptAlert();
		login.Sleep(500);
		LoginPage.AcceptAlert();
		//Assert.assertTrue(login.ElementDisplay("//*[@name='Allow"));	
		driver.resetApp();
		
	}
}
