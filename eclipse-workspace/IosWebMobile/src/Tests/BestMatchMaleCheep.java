package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.OnBoardingPage;
import PageObjects.SignUpPage;


public class BestMatchMaleCheep extends BaseTest2
{
	@Test(priority = 5,groups={"sanity-group"})
	public void MaleCheep()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		//driver.findElement(By.xpath("//div//button[@type='submit']")).click();
		//SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		OnBoardingPage ob = new OnBoardingPage(driver);
		ob.SelectGender("Male");
		ob.FillBirthday();
		//ob.FillCountry("israel");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		//ob.ClickBacktOfStyle();
		//ob.ClickNext();
		ob.SelectBrands1("1");
		ob.ClickNext();
		//ob.SelectInspiration("4");
		//ob.ClickNext();
		//Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		//driver.close();
	}
}
