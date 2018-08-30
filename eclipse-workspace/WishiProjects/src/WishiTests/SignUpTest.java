package WishiTests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.LoginPage;
import PageObject.SignUpPage;
@Listeners(WishiTests.Listener.class)
public class SignUpTest extends BaseTest 
{
	@Test(priority = 1,groups={"sanity-group"})
	public void SignUpClickable()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		signup.ClickOnSignUpEmail();
		Assert.assertTrue(signup.ElementDisplay("//div//div[@class='closeXLeft ng-scope']"));
	}
	
	@Test(priority = 2,groups={"sanity-group"})
	public void FillEmailWitoutShtudel()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi.com", "inon", "av", "ab1565");
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Email is invalid.')]"));
		
	} 
	
	@Test(priority = 3,groups={"sanity-group"})
	public void FillEmailWithoutDotCom()
	{
		
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi", "inon", "av", "ab1565");
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Email is invalid.')]"));
		
	}
	
	@Test(priority = 4,groups={"sanity-group"})
	public void FillPsswordWithLessthan6Characters()
	{
		
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi", "inon", "av", "ab");
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Password must have at least 6 characters.')]"));
		
	} 
	
	@Test(priority = 5,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.doSignUp("wishitestr@wishi.com" + number, "inon", "av", "ab1565");
		Assert.assertTrue(BasePage.isatpage("//div//a[@class='btn-start']"));
		driver.close();
	}
	
	
}
