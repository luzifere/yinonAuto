package WishiTests;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BestMatchPage;
import PageObject.BookingPage;
import PageObject.LoginPage;
import PageObject.OnBoardingPage2;
import PageObject.SignUpPage;

@Listeners(WishiTests.Listener.class)

public class BestMatchMaleTest extends BaseTest 
{

	@Test(priority =3,groups={"sanity-group"})
	public void BestMatchMale()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestyinon@wishitest.com" + number, "inon bb av", "ab1565");
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickMale();
		best.SelectLoveIt("1");
		
		best.SelectSOMETIMES("2");
		
		best.SelectLoveIt("3");
		
		best.SelectSOMETIMES("4");
		
		best.SelectSOMETIMES("5");
		
		best.Selectbrands("brand_A.L.C");
		//best.ClickNextbutton();
		best.ClickMeetMyMatch();
		/*
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Male')]]"));
		
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'30% - Hipster, 28% - Dapper, 42% - Rock')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Armani')]]"));
		Assert.assertFalse(best.isElementPresent("//td[text()[contains(.,'You body type is:')]]"));
		best.ClickMeetMyMatch();
		*/
		best.StylistPageDisplayed();
		best.Sleep(300);
		
	}
	@Test(priority =3,groups={"sanity-group"})
	public void BestMatchMaleBack()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestyinon@wishitest.com" + number, "inon bb av", "ab1565");
		//signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickMale();
		best.SelectLoveIt("1");
		best.ClickBack();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.ClickBack();
		best.SelectHELLONO("2");
		best.SelectLoveIt("3");
		best.ClickBack();
		best.SelectHELLONO("3");
		best.SelectSOMETIMES("4");
		best.ClickBack();
		best.SelectHELLONO("4");
		best.SelectSOMETIMES("5");
		best.ClickBack();
		best.SelectSOMETIMES("5");
		best.Selectbrands("2");
		//best.ClickNextbutton();
		best.ClickMeetMyMatch();
		/*
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Male')]]"));
		
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'30% - Hipster, 28% - Dapper, 42% - Rock')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Armani')]]"));
		Assert.assertFalse(best.isElementPresent("//td[text()[contains(.,'You body type is:')]]"));
		best.ClickMeetMyMatch();
		*/
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();
		
	}

	

}
