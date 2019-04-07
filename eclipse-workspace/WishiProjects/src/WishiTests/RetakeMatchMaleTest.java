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

public class RetakeMatchMaleTest extends BaseTest 
{

	@Test(priority =3,groups={"sanity-group"})
	public void RetakeMatchMaleTest()
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		login.ClickLoginButton();
		login.doLogin("wishitesttr@wishi.com3807", "ab1565");
		login.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'view more stylists')]]"));
		Assert.assertTrue(login.ElementDisplay("//div//button[text()[contains(.,'view more stylists')]]"));
		login.Sleep(300);
		driver.findElement(By.xpath("//div//a[text()[contains(.,'Retake your style match')]]")).click();
		BestMatchPage best = new BestMatchPage(driver);
		//best.ClickontinueButton();
		
		best.ClickFamle();
		best.ClickBack();
		best.ClickMale();
		best.SelectHELLONO("1");
		best.SelectHELLONO("2");
		best.SelectSOMETIMES("3");
		best.SelectLoveIt("4");
		best.SelectHELLONO("5");
		best.SelectHELLONO("6");
		best.Selectbrands("1");
		//best.ClickNextbutton();
		best.ClickMeetMyMatch();
		/*
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Male')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'40% - Classic, 60% - Edgy')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Alexander wang')]]"));
		best.ClickMeetMyMatch();
		*/
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'view more stylists')]]"));
		Assert.assertTrue(best.ElementDisplay("//div//button[text()[contains(.,'view more stylists')]]"));
		best.Sleep(300);
		best.close();
		
	}

	

}
