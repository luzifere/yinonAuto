package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.SignUpPage;




@Listeners(Tests.Listener.class)

public class SignUpTest extends BaseTest
{
	@Test(priority = 2,groups={"sanity-group"})
	public void Signupwithoutshtudel()
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.WaitElementDisplay(By.id("signUpButton"));
		sign.ClickSignUpEmail();
		sign.doSignUpEmailClear("yinonwishi.me");
		Assert.assertTrue(sign.ElementDisplay("//*[@name='Dismiss']"));
		sign.ClickDismiss();
		driver.resetApp();
	}
	@Test(priority = 1,groups={"sanity-group"})
	public void SignupwithoutDotCom()
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.WaitElementDisplay(By.id("signUpButton"));
		sign.ClickSignUpEmail();
		sign.doSignUpEmailClear("wishsi@mecom");
		Assert.assertTrue(sign.ElementDisplay("//*[@name='Dismiss']"));
		sign.ClickDismiss();
		driver.resetApp();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void FillPsswordWithLessthan6Characters()
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.WaitElementDisplay(By.id("signUpButton"));
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi", "wishsi@me.com", "456");
		Assert.assertTrue(sign.ElementDisplay("//*[@name='Dismiss']"));
		sign.Sleep(150);
		sign.ClickDismiss();
		driver.resetApp();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void DoSignUp()
	{
	Random num = new Random();
	int number = 35600;
	for (int counter = 5800; counter<=100000;counter++)
		number = num.nextInt(7000);
	
		SignUpPage sign = new SignUpPage(driver);
		sign.WaitElementDisplay(By.id("signUpButton"));
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number +"wishitesttt@wishi.com", "123456");
		Assert.assertTrue(sign.ElementEnable("//*[@name='HowItWorksID']"));
		driver.resetApp();

	}
}
