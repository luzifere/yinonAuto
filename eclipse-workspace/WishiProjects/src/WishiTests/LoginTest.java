package WishiTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.ChatPage;
import PageObject.LoginPage;
@Listeners(WishiTests.Listener.class)
public class LoginTest extends BaseTest 
{	

	@Test(priority = 1,groups={"sanity-group"})
	public void LoginClickable() 
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		login.ClickLoginButton();
		Assert.assertTrue(login.ElementDisplay("//div//input[@value='Sign in']"));
		login.Closebuttonoflogin();
		//login.WaitElementClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
		login.ExplicityWaitIsClickable(By.xpath("//header//div[@class='log-in']"));
		login.WaitElementClickable(By.xpath("//div//input[@id='signInEmail']"));
	}	

	@Test(priority = 8,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		//login.ClickLoginButton();
		login.doLogin("wishi.test@wishi.com", "123456");
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Your Stylist Match!')]]"));
		//login.Closebuttonoflogin();
		//login.WaitElementClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
		//login.ExplicityWaitIsClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
		login.Sleep(300);
		//login.WaitElementClickable(By.xpath("//div//input[@id='signInEmail']"));
		login.close();
	}	

	@Test(priority = 3,groups={"sanity-group"})
	public void FillPasswordWithOutToFillEmail() 
	{
		LoginPage login = new LoginPage(driver);
		//login.ClickLoginButton();
		//login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.Fillpassword("156523784");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Email is required.')]]"));	
		login.Closebuttonoflogin();
		//login.WaitElementClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
		login.ExplicityWaitIsClickable(By.xpath("//header//div[@class='log-in']"));
		login.WaitElementClickable(By.xpath("//div//input[@id='signInEmail']"));
	}

	@Test(priority = 4,groups={"sanity-group"})
	public void FillEmailWithOutToFillPassword() 
	{
		LoginPage login = new LoginPage(driver);
		//	login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("yinon@wishi.me");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Password is required.')]]"));
		login.Closebuttonoflogin();
		//login.WaitElementClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
		login.ExplicityWaitIsClickable(By.xpath("//header//div[@class='log-in']"));
		login.WaitElementClickable(By.xpath("//div//input[@id='signInEmail']"));
	}

	@Test(priority = 5,groups={"sanity-group"})
	public void ClickLoginwWithOutToFillAnyFields() 
	{
		LoginPage login = new LoginPage(driver);
		//login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Password is required.')]]"));
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Email is required.')]]"));
		login.Closebuttonoflogin();
		//login.WaitElementClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
		login.ExplicityWaitIsClickable(By.xpath("//header//div[@class='log-in']"));
		login.WaitElementClickable(By.xpath("//div//input[@id='signInEmail']"));
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void FillCorrectEmailWithWrongPassword() 
	{
		LoginPage login = new LoginPage(driver);
		//login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("plan@wishitest.com");
		login.Fillpassword("123123123");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'The password you entered is incorrect')]]"));
		login.Closebuttonoflogin();
		//login.WaitElementClickable(By.xpath("//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']"));
		login.ExplicityWaitIsClickable(By.xpath("//header//div[@class='log-in']"));
		login.WaitElementClickable(By.xpath("//div//input[@id='signInEmail']"));
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void FillCorrectPasswordWithWrongEmail() 
	{
		LoginPage login = new LoginPage(driver);
		//login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("jhfgjhfjf@wishi.me");
		login.Fillpassword("156523784");
		login.Clickloginbuttonn();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Invalid email')]]"));
		login.Closebuttonoflogin();
		login.ExplicityWaitIsClickable(By.xpath("//header//div[@class='log-in']"));
		login.WaitElementClickable(By.xpath("//div//input[@id='signInEmail']"));
		

	}


}
