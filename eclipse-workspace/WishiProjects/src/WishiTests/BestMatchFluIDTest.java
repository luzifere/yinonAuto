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

public class BestMatchFluIDTest extends BaseTest 
{

	@Test(priority =3,groups={"sanity-group"})
	public void BestMatchNaturalTest()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickSelfIdentityButtonID();
		best.ClickPetit();
		best.ClickNextbutton();
		best.SelectSOMETIMES("1");
		
		best.SelectLoveIt("2");
		
		best.SelectLoveIt("3");
		
		best.SelectSOMETIMES("4");
		
		best.SelectSOMETIMES("5");
		
		best.SelectLoveIt("6");
		
		best.ClickSkipbutton2("1");
		
		best.SelectHELLONO("8");
		
		best.SelectLoveIt("9");
		
		best.SelectHELLONO("10");
		
		best.Selectbrands("brand_Adidas");
		//best.ClickNextbutton();
		best.ClickMeetMyMatch();
		best.StylistPageDisplayed();
		best.close();
		
	}
	@Test(priority =4,groups={"sanity-group"})
	public void BestMatchNaturalBackTest()
	{
		setup();
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.ClickOnSignUpEmail();
	signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickSelfIdentityButtonID();
		best.ClickPetit();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickPlusSize();
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
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();
		
	}

	

}
