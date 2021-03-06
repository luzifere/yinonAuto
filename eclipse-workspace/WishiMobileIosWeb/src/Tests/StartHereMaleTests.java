package Tests;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Tests.Listener.class)

public class StartHereMaleTests extends BaseTest37 
{
	@Test(priority =6,groups={"sanity-group"})
	public void StartHereMaleTests()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickMale();
		best.SelectLoveIt("1");
		best.ClickBack();
		best.SelectSOMETIMES("1");
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
		best.Selectbrands("1");
		/*
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Male')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'26% - Hipster, 37% - Dapper, 37% - Rock')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Balenciaga')]]"));
		*/
		best.ClickMeetMyMatch();
		signup.doSignUpSH("yinonwishitest@wishitest.com" + number, "inon av", "ab1565");
		best.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Your Stylist Match!')]]"));
		Assert.assertTrue(best.ElementDisplay("//div[text()[contains(.,'Your Stylist Match!')]]"));
		best.Sleep(300);
		driver.close();

	}
}
