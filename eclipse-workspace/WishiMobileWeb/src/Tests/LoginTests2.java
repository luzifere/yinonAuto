package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.LoginPages2;
import draft.LoginPages;

@Listeners(Tests.Listener.class)
public class LoginTests2 extends BaseTest1
{
	@Test(priority = 8,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPages2 login = new LoginPages2(driver);
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
		LoginPages2 login = new LoginPages2(driver);
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
		LoginPages2 login = new LoginPages2(driver);
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
		LoginPages2 login = new LoginPages2(driver);
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
		LoginPages2 login = new LoginPages2(driver);
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
		LoginPages2 login = new LoginPages2(driver);
		login.Clearpassword();
		login.Clearusername();
		login.Fillusername("jhfgjhfjf@wishi.me");
		login.Fillpassword("156523784");
		login.Clickloginbuttonn();
		login.InvalidEmail();	

	}
}
