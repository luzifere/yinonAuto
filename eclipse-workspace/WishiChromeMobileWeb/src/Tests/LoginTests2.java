package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.LoginPages;
import PageObejecs.LoginPages2;

@Listeners(Tests.Listener.class)
public class LoginTests2 extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginClickable() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.ClickLoginButton();
		Assert.assertTrue(login.ElementDisplay("//div//input[@value='Log in']"));
		login.Closebuttonoflogin();
		LoginPages2.ExplicityWaitIsClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
	}	
	
	@Test(priority = 2,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.doLogin("yinon@@wishi.me", "156523784");
		login.Closebuttonoflogin();
		LoginPages2.ExplicityWaitIsClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
	}	
	
	@Test(priority = 3,groups={"sanity-group"})
	public void FillPasswordWithOutToFillEmail() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Fillpassword("156523784");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Email is required.')]]"));	
		login.Closebuttonoflogin();
		LoginPages2.ExplicityWaitIsClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
	}
	
	@Test(priority = 4,groups={"sanity-group"})
	public void FillEmailWithOutToFillPassword() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("yinon@wishi.me");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Password is required.')]]"));
		login.Closebuttonoflogin();
		LoginPages2.ExplicityWaitIsClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
	}
	
	@Test(priority = 5,groups={"sanity-group"})
	public void ClickLoginwWithOutToFillAnyFields() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Password is required.')]]"));
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Email is required.')]]"));
		login.Closebuttonoflogin();
		LoginPages2.ExplicityWaitIsClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void FillCorrectEmailWithWrongPassword() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("yinon@wishi.me");
		login.Fillpassword("123123123");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'The password you entered is incorrect')]]"));
		login.Closebuttonoflogin();
		LoginPages2.ExplicityWaitIsClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void FillCorrectPasswordWithWrongEmail() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("yinong@wishi.me");
		login.Fillpassword("156523784");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[@class='invalid-form ng-binding ng-scope']"));
		login.Closebuttonoflogin();
	}

}
