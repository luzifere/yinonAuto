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
		login.MyBookingDisplay();
		BookingPage booking = new BookingPage(driver);
		booking.ClickStylistHeader();
		BestMatchPage best = new BestMatchPage(driver);
		best.ClicOnFilter();
		best.ClicRetake();
		best.ClickFamle();
		best.ClickBack();
		best.ClickMale();
		best.SelectHELLONO("1");
		best.SelectHELLONO("2");
		best.SelectSOMETIMES("3");
		best.SelectLoveIt("4");
		best.SelectHELLONO("5");
		best.Selectbrands("brand_GAP");
		best.ClickMeetMyMatch();
		best.StylistPageDisplayed();
		best.Sleep(300);
		best.close();
		
	}

	

}
