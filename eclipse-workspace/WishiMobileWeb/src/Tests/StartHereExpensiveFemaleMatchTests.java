package Tests;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.OnBoardingPage;



@Listeners(Tests.Listener.class)

public class StartHereExpensiveFemaleMatchTests extends BaseTest 
{
	@Test(priority =6,groups={"sanity-group"})
	public void BMExpensiveMale()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		//signup.ClickOnSignUpEmail();
		
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickStartHere();
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
		best.SelectExpensiveButtonID();
		best.ClickBack();
		best.SelectExpensiveButtonID();
		best.SelectExpensiveButtonID2();
		best.ClickBack();
		best.SelectExpensiveButtonID2();
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
		signup.doSignUpSH("wishitestoren@wishitesttt.com" + number, "inon", "av", "ab1565");
		best.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Your Stylist Match')]]"));
		//best.ClickMoreStylistsButton();
	
		
		driver.close();
	}
}
