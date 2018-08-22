package Tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.BasePage;
import PageObejecs.SignUpPage;




@Listeners(Tests.Listener.class)
public class SignUpTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void SignUpClickable()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.ClickOnSignUpEmail();
		Assert.assertTrue(signup.ElementDisplay("//div//div[@class='closeXLeft ng-scope']"));
	}
	
	@Test(priority = 2,groups={"sanity-group"})
	public void FillEmailWitoutShtudel()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi.com", "inon", "av", "ab1565");
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Email is invalid.')]"));
		
	} 
	
	@Test(priority = 3,groups={"sanity-group"})
	public void FillEmailWithoutDotCom()
	{
		
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi", "inon", "av", "ab1565");
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Email is invalid.')]"));
		
	}
	
	@Test(priority = 4,groups={"sanity-group"})
	public void FillPsswordWithLessthan6Characters()
	{
		
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi", "inon", "av", "ab");
		Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Password must have at least 6 characters.')]"));
		
	} 
	
	@Test(priority = 5,groups={"sanity-group"})
	public void DoSignUp()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 58; counter<=100000;counter++)
			number = num.nextInt(70);
		signup.doSignUp("wishitesttt@wishi.com" + number, "inon", "av", "ab1565");
		//Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Male')]"));
		driver.close();
	}
}
