package Tests;


import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Tests.Listener.class)

public class StartHereHelloNoTests extends BaseTest1 
{
	int number;

	StartHereHelloNoTests() {
	}
	@Test(priority =6,groups={"sanity-group"})
	public void StartHereHellNoTests() throws IOException
	{
		setup();
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickPetit();
		best.ClickNextbutton();
		best.SelectHELLONO("1");
		best.SelectHELLONO("2");
		best.SelectHELLONO("3");
		best.SelectHELLONO("4");
		best.SelectHELLONO("5");
		best.SelectHELLONO("6");
		best.ClickSkipbutton2("2");
		best.SelectHELLONO("8");
		best.SelectHELLONO("9");
		best.SelectHELLONO("10");
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();

	}
	@Test(priority =4,groups={"sanity-group"})
	public void StartHereHellNoBackTests()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickFamle();
		best.ClickPetit();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickPlusSize();
		best.ClickNextbutton();
		best.SelectHELLONO("1");
		best.ClickBack();
		best.SelectHELLONO("1");
		best.SelectHELLONO("2");
		best.ClickBack();
		best.SelectHELLONO("2");
		best.SelectHELLONO("3");
		best.ClickBack();
		best.SelectHELLONO("3");
		best.SelectHELLONO("4");
		best.ClickBack();
		best.SelectHELLONO("4");
		best.SelectHELLONO("5");
		best.ClickBack();
		best.SelectHELLONO("5");
		best.SelectHELLONO("6");
		best.ClickBack();
		best.SelectHELLONO("6");
		best.ClickSkipbutton2("2");
		best.ClickBack();
		best.SelectHELLONO("7");
		best.SelectHELLONO("8");
		best.ClickBack();
		best.SelectHELLONO("8");
		best.SelectHELLONO("9");
		best.ClickBack();
		best.SelectHELLONO("9");
		best.SelectHELLONO("10");
		best.ClickBack();
		best.SelectHELLONO("10");
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();

	}
}
