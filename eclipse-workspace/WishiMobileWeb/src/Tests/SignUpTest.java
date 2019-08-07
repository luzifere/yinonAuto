package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.BasePage;
import PageObejecs.SignUpPage;




@Listeners(Tests.Listener.class)
public class SignUpTest extends BaseTest1
{
	@Test(priority = 1,groups={"sanity-group"})
	public void SignUpClickable()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.ClickOnSignUpEmail();
		signup.WaitElementDisplay(By.xpath("//div//div[@class='closeXLeft ng-scope']"));
		Assert.assertTrue(signup.ElementDisplay("//div//div[@class='closeXLeft ng-scope']"));
	}
	
	@Test(priority = 2,groups={"sanity-group"})
	public void FillEmailWitoutShtudel()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.doSignUp("yinon542244243wishi.com", "inon bb av", "ab1565");
		Assert.assertTrue(SignUpPage.ElementDisplay("//div[contains(text(), 'Email is invalid')]"));
		
	} 
	
	@Test(priority = 3,groups={"sanity-group"})
	public void FillEmailWithoutDotCom()
	{
		
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.doSignUp("yinon@542244243wishi", "inon bb av", "ab1565");
		Assert.assertTrue(SignUpPage.ElementDisplay("//div[contains(text(), 'Email is invalid')]"));
		
	}
	
	@Test(priority = 4,groups={"sanity-group"})
	public void FillPsswordWithLessthan6Characters()
	{
		
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.doSignUp("yinon@542244243.wishi", "inon bb av", "ab");
		Assert.assertTrue(SignUpPage.ElementDisplay("//div[contains(text(), 'Password must have at least 6 characters')]"));
		
	} 
	@Test(priority = 5,groups={"sanity-group"})
	public void FillNameWithWrongcarecters()
	{
		
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.doSignUp("wishitesttt@wishi.com", "!!!!! @@@ 111111", "ab1565");
		Assert.assertTrue(SignUpPage.ElementDisplay("//div[contains(text(), 'You are using invalid characters')]"));
		
	}
	
	
	
	@Test(priority = 6,groups={"sanity-group"})
	public void DoSignUp()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 58; counter<=100000;counter++)
			number = num.nextInt(70);
		signup.doSignUp("wishitesttt@wishi.com" + number, "inon bb av", "ab1565");
		//Assert.assertTrue(SignUpPage.isatpage("//div[contains(text(), 'Male')]"));
		driver.close();
	}
}
