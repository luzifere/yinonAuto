package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.OnBoardingPage;
import PageObjects.SignUpPage1;


public class BestMatchFamleNormal extends BaseTest2
{
	
	@Test(priority = 3,groups={"sanity-group"})
	public void FamleNOrmal()
	{
		SignUpPage1 signup = new SignUpPage1(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		SignUpPage1.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		OnBoardingPage ob = new OnBoardingPage(driver);
		ob.SelectGender("Female");
		ob.FillBirthday();
		//ob.FillCountry("israel");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		//ob.ClickBacktOfStyle();
		//ob.ClickNext();
		ob.SelectBrands1("2");
		ob.ClickNext();
		ob.SelectInspiration("4");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		//driver.closeApp();
	}
}
