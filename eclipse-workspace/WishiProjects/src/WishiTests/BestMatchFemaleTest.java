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

public class BestMatchFemaleTest extends BaseTest 
{

	@Test(priority =3,groups={"sanity-group"})
	public void BestMatchFemaleTest()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		//signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestyinon@wishitest.com" + number, "inon bb av", "ab1565");
		//signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickPetit();
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectLoveIt("3");
		best.SelectSOMETIMES("4");
		best.SelectSOMETIMES("5");
		best.SelectLoveIt("6");
		best.ClickSkipbutton2("1");
		best.SelectHELLONO("8");
		best.SelectLoveIt("9");
		best.SelectHELLONO("10");
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
		/*
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Female')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Petite, Plus Size')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'44% - Classic, 28% - Edgy, 28% - Minimal')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'All Saints')]]"));
		best.ClickMeetMyMatch();
		*/
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();
		
	}
	
	@Test(priority =4,groups={"sanity-group"})
	public void BestMatchFemaleTestWithBack()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		//signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestyinon@wishitest.com" + number, "inon bb av", "ab1565");
		//signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickFamle();
		best.ClickPetit();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickPlusSize();
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.ClickBack();
		best.SelectHELLONO("1");
		best.SelectSOMETIMES("2");
		best.ClickBack();
		best.SelectHELLONO("2");
		best.SelectLoveIt("3");
		best.ClickBack();
		best.SelectLoveIt("3");
		best.SelectSOMETIMES("4");
		best.ClickBack();
		best.SelectSOMETIMES("4");
		best.SelectSOMETIMES("5");
		best.ClickBack();
		best.SelectHELLONO("5");
		best.SelectLoveIt("6");
		best.ClickBack();
		best.SelectHELLONO("6");
		best.ClickSkipbutton2("1");
		best.ClickBack();
		best.SelectHELLONO("7");
		best.SelectHELLONO("8");
		best.ClickBack();
		best.SelectHELLONO("8");
		best.SelectLoveIt("9");
		best.ClickBack();
		best.SelectHELLONO("9");
		best.SelectHELLONO("10");
		best.ClickBack();
		best.SelectSOMETIMES("10");
		best.Selectbrands("2");
		best.ClickMeetMyMatch();
		/*
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Female')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Petite, Plus Size')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'44% - Classic, 28% - Edgy, 28% - Minimal')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'All Saints')]]"));
		best.ClickMeetMyMatch();
		*/
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();
		
	}


	

}
