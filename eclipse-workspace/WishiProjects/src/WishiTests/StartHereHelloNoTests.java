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

public class StartHereHelloNoTests extends BaseTest 
{
	@Test(priority =6,groups={"sanity-group"})
	public void StartHereHelloNoTests()
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
		best.ClickFamle();
		best.SelectBodyType("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("3");
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.ClickBack();
		best.SelectHELLONO("1");
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
		best.SelectHELLONO("10");
		best.Selectbrands("2");
		//best.ClickNextbutton();
		best.ClickMeetMyMatch();
		/*
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Female')]]"));
		Assert.assertFalse(best.isElementPresent("//span[text()[contains(.,'60% - Classic, 40% - Edgy')]]"));
		//Assert.assertTrue(!best.ElementDisplay("//span[text()[contains(.,'40% - Classic, 60% - Edgy')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Petite, Plus Size')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'H&M')]]"));
		best.ClickMeetMyMatch();
		*/
		signup.doSignUpSH("yinonwishitest@wishitest.com" + number, "inon", "av", "ab1565");
		best.Sleep(200);
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'SEE MORE')]]"));
		Assert.assertTrue(best.ElementDisplay("//div//button[text()[contains(.,'SEE MORE')]]"));
		best.Sleep(300);
		best.close();

	}
}
