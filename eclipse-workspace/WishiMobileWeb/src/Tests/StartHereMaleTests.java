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

public class StartHereMaleTests extends BaseTest1 
{
	int number;

	StartHereMaleTests() {
	}
	@Test(priority =6,groups={"sanity-group"})
	public void StartHereMaleNoBackTests() throws IOException
	{
		setup();
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickMale();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectLoveIt("3");
		best.SelectSOMETIMES("4");
		best.SelectSOMETIMES("5");
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();

	}
	@Test(priority =4,groups={"sanity-group"})
	public void StartHereMaleBackTests()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickMale();
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
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();
	}
}
