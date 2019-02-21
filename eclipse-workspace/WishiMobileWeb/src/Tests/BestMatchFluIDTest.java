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

public class BestMatchFluIDTest extends BaseTest 
{

	@Test(priority =3,groups={"sanity-group"})
	public void BestMatchFemaleTest()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestyinon@wishitest.com" + number, "inon", "av", "ab1565");
		//signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickSelfIdentityButtonID();
		best.SelectBodyType("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("3");
		best.ClickNextbutton();
		best.SelectSOMETIMES("1");
		best.ClickBack();
		best.SelectLoveIt("1");
		best.SelectLoveIt("2");
		best.ClickBack();
		best.SelectSOMETIMES("2");
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
		best.SelectSOMETIMES("10");
		best.Selectbrands("1");
		/*
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Fluid')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Petite, Plus Size')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'40% - Boho, 60% - Elegant')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,' A.L.C')]]"));
		*/
		best.ClickMeetMyMatch();
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'SEE MORE')]]"));
		Assert.assertTrue(best.ElementDisplay("//div//button[text()[contains(.,'SEE MORE')]]"));
		best.Sleep(300);
		driver.close();
		
	}

	

}
