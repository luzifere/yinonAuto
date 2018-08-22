package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import PageObjects.LoginPage;

public class LoginTest extends BaseTest
{
	
	public class LoginTests extends BaseTest
	{
		@Test(priority = 8,groups={"sanity-group"})
		public void DoLogin() 
		{
			LoginPage login = new LoginPage(driver);
			login.ClickLoginButton();
			login.doLogin("yinon@wishi.me", "156523784");
			login.Clickloginbuttonn();
			Assert.assertTrue(login.ElementDisplay("//div[@class='img-box']"));
			//LoginPage.ExplicityWaitIsClickable(By.xpath("//div[@class='img-box']"));
		}	
		
		@Test(priority = 3,groups={"sanity-group"})
		public void FillPasswordWithOutToFillEmail() 
		{
			LoginPage login = new LoginPage(driver);
			login.Sleep(150);
			LoginPage.ExplicityWaitIsClickable(By.xpath("//div//p[text()[contains(.,'Log In')]]"));
			login.Fillpassword("156523784");
			login.Clickloginbuttonn();
			Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Email is required.')]]"));	
			login.Closebuttonoflogin();
			LoginPage.ExplicityWaitIsClickable(By.xpath("//div//p[text()[contains(.,'Log In')]]"));
		}
		
		@Test(priority = 4,groups={"sanity-group"})
		public void FillEmailWithOutToFillPassword() 
		{
			LoginPage login = new LoginPage(driver);
			login.Clearpassword();
			login.Clearusername();
			login.Fillusername("yinon@wishi.me");
			login.Clickloginbuttonn();
			Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Password is required.')]]"));
			login.Closebuttonoflogin();
			LoginPage.ExplicityWaitIsClickable(By.xpath("//div//p[text()[contains(.,'Log In')]]"));
		}
		
		@Test(priority = 5,groups={"sanity-group"})
		public void ClickLoginwWithOutToFillAnyFields() 
		{
			LoginPage login = new LoginPage(driver);
			login.Clearpassword();
			login.Clearusername();
			login.Clickloginbuttonn();
			Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Password is required.')]]"));
			Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Email is required.')]]"));
			login.Closebuttonoflogin();
			LoginPage.ExplicityWaitIsClickable(By.xpath("//div//p[text()[contains(.,'Log In')]]"));
		}
		@Test(priority = 6,groups={"sanity-group"})
		public void FillCorrectEmailWithWrongPassword() 
		{
			LoginPage login = new LoginPage(driver);
			login.Clearpassword();
			login.Clearusername();
			login.Fillusername("yinon@wishi.me");
			login.Fillpassword("123123123");
			login.Clickloginbuttonn();
			Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'The password you entered is incorrect')]]"));
			login.Closebuttonoflogin();
			LoginPage.ExplicityWaitIsClickable(By.xpath("//div//p[text()[contains(.,'Log In')]]"));
		}
		@Test(priority = 7,groups={"sanity-group"})
		public void FillCorrectPasswordWithWrongEmail() 
		{
			LoginPage login = new LoginPage(driver);
			login.Clearpassword();
			login.Clearusername();
			login.Fillusername("yinong@wishi.me");
			login.Fillpassword("156523784");
			login.Clickloginbuttonn();
			Assert.assertTrue(login.ElementDisplay("//div[@class='invalid-form ng-binding ng-scope']"));
			login.Closebuttonoflogin();
		}

	}
}
