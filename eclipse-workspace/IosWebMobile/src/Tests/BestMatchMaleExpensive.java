package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.OnBoardingPage;
import PageObjects.SignUpPage1;


public class BestMatchMaleExpensive extends BaseTest2
{
	@Test(priority = 7,groups={"sanity-group"})
	public void MaleExpensive()
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
		ob.SelectGender("Male");
		ob.FillBirthday();
		//ob.FillCountry("israel");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		//ob.ClickBacktOfStyle();
		//ob.ClickNext();
		ob.SelectBrands1("3");
		ob.ClickNext();
		//ob.SelectInspiration("4");
		//ob.ClickNext();
		//Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(200);
		ob.Sleep(300);
		//driver.close();
	}
}
