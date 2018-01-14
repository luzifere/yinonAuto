package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SignUpPage;

public class SignUpTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void Signupwithoutshtudel()
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUp("wishsi", "Last", "yinonwishi.me", "156523784");
		Assert.assertTrue(sign.ElementDisplay("//*[@name='Dismiss']"));
		sign.ClickDismiss();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void SignupwithoutDotCom()
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.doSignUpClear("wishsi", "wishsi", "wishsi@mecom", "123456");
		Assert.assertTrue(sign.ElementDisplay("//*[@name='Dismiss']"));
		sign.ClickDismiss();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void FillPsswordWithLessthan6Characters()
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.doSignUpClear("wishsi", "wishsi", "wishsi@mecom", "456");
		Assert.assertTrue(sign.ElementDisplay("//*[@name='Dismiss']"));
		sign.Sleep(150);
		sign.ClickDismiss();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void DoSignUp()
	{
	Random num = new Random();
	int number = 35600;
	for (int counter = 5800; counter<=100000;counter++)
		number = num.nextInt(7000);
	
		SignUpPage sign = new SignUpPage(driver);
		sign.doSignUpClear("wishsi", "wishsi","wishitesttt@wishi.com" + number, "123456");
		Assert.assertTrue(sign.ElementEnable("//*[@name='how_it_works_heart']"));
	}
}
