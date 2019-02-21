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

public class RetakeMatchFamleTest extends BaseTest 
{

	@Test(priority =3,groups={"sanity-group"})
	public void RetakeMatchFamleTest()
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		login.ClickLoginButton();
		login.doLogin("wishitesttr@wishi.com3807", "ab1565");
		Assert.assertTrue(login.ElementDisplay("//h2[text()[contains(.,'Style session - starting at $20')]]"));
		login.Sleep(300);
		driver.findElement(By.xpath("//div//a[text()[contains(.,' Retake Your Style Match')]]")).click();
		BestMatchPage best = new BestMatchPage(driver);
		//best.ClickontinueButton();
		best.ClickMale();
		best.ClickBack();
		best.ClickFamle();
		best.SelectBodyType("2");
		best.ClickNextbutton();
		best.SelectHELLONO("1");
		best.SelectHELLONO("2");
		best.SelectSOMETIMES("3");
		best.SelectLoveIt("4");
		best.SelectHELLONO("5");
		best.SelectHELLONO("6");
		best.SelectHELLONO("7");
		best.SelectHELLONO("8");
		best.SelectHELLONO("9");
		best.SelectHELLONO("10");
		best.Selectbrands("2");
		//best.ClickNextbutton();
		best.ClickMeetMyMatch();
		/*
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Female')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'40% - Classic, 60% - Edgy')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Fit')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'GAP')]]"));
		best.ClickMeetMyMatch();
		*/
		best.WaitElementDisplay(By.xpath("//h2[text()[contains(.,'Style session - starting at $20')]]"));
		Assert.assertTrue(best.ElementDisplay("//h2[text()[contains(.,'Style session - starting at $20')]]"));
		best.Sleep(300);
		best.close();
		
	}

	

}
