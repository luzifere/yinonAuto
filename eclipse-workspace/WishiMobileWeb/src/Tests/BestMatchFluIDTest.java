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

public class BestMatchFluIDTest extends BaseTest1 
{

	@Test(priority =3,groups={"sanity-group"})
	public void BestMatchNaturalTestWithOutBack()
	{
		
			PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
			Random num = new Random();
			int number = num.nextInt(70000000) + 356000000;
			signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
			PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
			best.ClickontinueButton();
			best.ClickSelfIdentityButtonID();
			best.ClickPetit();
			best.ClickNextbutton();
			best.SelectLoveIt("1");
			best.SelectSOMETIMES("2");
			best.SelectLoveIt("3");
			best.SelectSOMETIMES("4");
			best.SelectSOMETIMES("5");
			best.SelectLoveIt("6");
			best.ClickSkipbutton2("2");
			best.SelectHELLONO("8");
			best.SelectLoveIt("9");
			best.SelectHELLONO("10");
			best.Selectbrands("brand_Adidas");
			best.ClickMeetMyMatch();
			best.StylistPageDisplayed();
			best.Sleep(300);
			best.close();

		}

		@Test(priority =4,groups={"sanity-group"})
		public void BestMatchNaturalTestWithBack() throws IOException
		{
			setup();
			PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
			Random num = new Random();
			int number = num.nextInt(70000000) + 356000000;
			signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
			PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
			best.ClickontinueButton();
			best.ClickFamle();
			best.ClickBack();
			best.ClickSelfIdentityButtonID();
			best.ClickPetit();
			best.ClickNextbutton();
			best.ClickBack();
			best.ClickPlusSize();
			best.ClickNextbutton();
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
			best.SelectLoveIt("6");
			best.ClickBack();
			best.SelectHELLONO("6");
			best.ClickSkipbutton2("2");
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
