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

public class BestMatchNormalFeamleTests extends BaseTest 
{

	@Test(priority = 1,groups={"sanity-group"})
	public void BMNormalFeamle()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.waitForPageLoaded();
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickFamle();
		best.FillAge("45");
		/*
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		*/
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickNextbutton();
		best.SelectNormal();
		best.ClickBack();
		best.SelectNormal();
		best.SelectNormal2();
		best.ClickBack();
		best.SelectNormal2();
		best.WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
		best.SelectTags("Petite");
		best.ClickTagsNextButton();
		best.ClickBack();
		best.SelectTags("Petite");
		best.ClickTagsNextButton();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.ClickBack();
		best.ClickTagsNextButton();
		best.ClickBack();
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
		PageObejecs.OnBoardingPage2 ob = new PageObejecs.OnBoardingPage2(driver);
		ob.Sleep(300);
		driver.quit();
	}
}
