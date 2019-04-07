package WishiTests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BestMatchPage;
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
		signup.Sleep(100);
		signup.WaitElementDisplay(By.xpath("//div//div[@class='closeXLeft ng-scope']"));
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
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.doSignUp("wishitestyinon@wishitest.com" + number, "inon", "av", "ab1565");
		//signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		signup.WaitElementDisplay(By.xpath("//div//button[@class='btn-start']"));
		Assert.assertTrue(signup.ElementDisplay("//div//button[@class='btn-start']"));
		signup.close();
	}
	
	
}
