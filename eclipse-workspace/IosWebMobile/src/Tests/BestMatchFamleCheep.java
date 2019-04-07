package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.OnBoardingPage;
import PageObjects.SignUpPage1;


public class BestMatchFamleCheep extends BaseTest2
{
	@Test(priority = 2,groups={"sanity-group"})
	public void FamleCheep()
	{
		SignUpPage1 signup = new SignUpPage1(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 10000; counter<=100000;counter++)
			number = num.nextInt(25000);
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
		ob.SelectBrands1("1");
		ob.ClickNext();
		ob.SelectInspiration("4");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		driver.quit();
		//ob.ClickOnProfileButton();
		//ob.ClickOnLogOut();
		
	}
}
