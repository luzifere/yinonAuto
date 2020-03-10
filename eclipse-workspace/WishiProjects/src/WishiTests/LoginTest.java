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
	@Test(priority = 8,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clearpassword();
		login.Clearusername();
		login.doLogin("wishi.test@wishi.com", "123456");
		login.Sleep(300);
		login.MyBookingDisplay();
		login.close();
	}	

	@Test(priority = 3,groups={"sanity-group"})
	public void FillPasswordWithOutToFillEmail() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.Fillpassword("156523784");
		login.Clickloginbuttonn();
		login.EmaileRequired();
	}

	@Test(priority = 4,groups={"sanity-group"})
	public void FillEmailWithOutToFillPassword() 
	{
		LoginPage login = new LoginPage(driver);
		login.Closebuttonoflogin();
		login.Sleep(30);
		login.ClickLoginButton();
		login.Fillusername("yinon@wishi.me");
		login.Clickloginbuttonn();
		login.PasswordRequired();
	}

	@Test(priority = 5,groups={"sanity-group"})
	public void ClickLoginwWithOutToFillAnyFields() 
	{
		LoginPage login = new LoginPage(driver);
		login.Closebuttonoflogin();
		login.Sleep(30);
		login.ClickLoginButton();
		login.Clickloginbuttonn();
		login.EmaileRequired();
		login.PasswordRequired();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void FillCorrectEmailWithWrongPassword() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("plan@wishitest.com");
		login.Fillpassword("123123123");
		login.Clickloginbuttonn();
		login.PasswordIncorrect();
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void FillCorrectPasswordWithWrongEmail() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("jhfgjhfjf@wishi.me");
		login.Fillpassword("156523784");
		login.Clickloginbuttonn();
		login.InvalidEmail();	

	}


}
