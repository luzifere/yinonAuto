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

public class StartHereLowMaleMatchTests extends BaseTest 
{
	@Test(priority =6,groups={"sanity-group"})
	public void BMExpensiveMale()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		//signup.ClickOnSignUpEmail();
		
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickMale();
		best.ClickBack();
		best.ClickMale();
		best.FillAge("45");
		/*
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		*/
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickNextbutton();
		best.SelectCheapButtonID();
		best.ClickBack();
		best.SelectCheapButtonID();
		best.SelectCheapButtonID2();
		best.ClickBack();
		best.SelectCheapButtonID2();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.ClickBack();
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		signup.doSignUpSH("yinonwishitest@wishitest.com" + number, "inon", "av", "ab1565");
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'SEE MORE')]]"));
		//best.ClickMoreStylistsButton();
	
		signup.WaitElementDisplay(By.xpath("//h2[text()[contains(.,'Style session - starting at $20')]]"));
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.close();

	}
}
