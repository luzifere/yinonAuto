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

public class StartHereFluIDTests extends BaseTest 
{
	@Test(priority =5,groups={"sanity-group"})
	public void StartHereFluIDTests()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickSelfIdentityButtonID();
		best.ClickPlusSize();
		best.ClickNextbutton();
		
		best.SelectHELLONO("1");
		
		best.SelectLoveIt("2");
		
		best.SelectLoveIt("3");
		
		best.SelectHELLONO("4");
		
		best.SelectHELLONO("5");
		
		best.SelectHELLONO("6");
		best.ClickSkipbutton2("1");
		
		best.SelectHELLONO("8");
		
		best.SelectHELLONO("9");
		
		best.SelectHELLONO("10");
		best.Selectbrands("brand_H&M");
		best.ClickMeetMyMatch();
		signup.doSignUpSH("yinonwishitest@wishitest.com" + number, "inon av", "ab1565");
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();

	}
	@Test(priority =6,groups={"sanity-group"})
	public void StartHereFluIDBackTests()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickSelfIdentityButtonID();
		best.SelectBodyType("0");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("1");
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.ClickBack();
		best.SelectHELLONO("1");
		best.SelectSOMETIMES("2");
		best.ClickBack();
		best.SelectLoveIt("2");
		best.SelectLoveIt("3");
		best.ClickBack();
		best.SelectLoveIt("3");
		best.SelectSOMETIMES("4");
		best.ClickBack();
		best.SelectHELLONO("4");
		best.SelectSOMETIMES("5");
		best.ClickBack();
		best.SelectHELLONO("5");
		best.SelectLoveIt("6");
		best.ClickBack();
		best.SelectHELLONO("6");
		best.ClickSkipbutton2("1");
		best.ClickBack();
		best.SelectSOMETIMES("7");
		best.SelectHELLONO("8");
		best.ClickBack();
		best.SelectHELLONO("8");
		best.SelectLoveIt("9");
		best.ClickBack();
		best.SelectHELLONO("9");
		best.SelectHELLONO("10");
		best.ClickBack();
		best.SelectHELLONO("10");
		best.Selectbrands("2");
		best.ClickMeetMyMatch();
		signup.doSignUpSH("yinonwishitest@wishitest.com" + number, "inon av", "ab1565");
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();

	}
	
	
}
