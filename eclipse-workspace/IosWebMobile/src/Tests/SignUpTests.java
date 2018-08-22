package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SignUpPage;



public class SignUpTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void SignUpClickable()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.ClickOnSignUpEmail();
		Assert.assertTrue(signup.ElementDisplay("//div//div[@class='closeXLeft ng-scope']"));
	}
	
	@Test(priority = 2,groups={"sanity-group"})
	public void FillEmailWitoutShtudel()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi.com", "inon", "av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Email is invalid.')]"));
		
	} 
	
	@Test(priority = 3,groups={"sanity-group"})
	public void FillEmailWithoutDotCom()
	{
		
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon@542244243wishi", "inon", "av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Email is invalid.')]"));
		
	}
	
	@Test(priority = 4,groups={"sanity-group"})
	public void FillPsswordWithLessthan6Characters()
	{
		
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi", "inon", "av", "ab");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Password must have at least 6 characters.')]"));
		
	} 
	
	@Test(priority = 5,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 58; counter<=100000;counter++)
			number = num.nextInt(70);
		signup.doSignUp("wishitesttt@wishi.com" + number, "inon", "av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		//Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Male')]"));
		driver.quit();
	}
}
