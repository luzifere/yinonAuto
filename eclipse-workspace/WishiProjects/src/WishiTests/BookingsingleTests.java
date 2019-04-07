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
import PageObject.ChatPage;
import PageObject.LoginPage;
import PageObject.SignUpPage;


@Listeners(WishiTests.Listener.class)
public class BookingsingleTests extends BaseTest 
{
	
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		Random num = new Random();
		int number = 356000000;
		for (int counter = 580000000; counter<=1000000000;counter++)
			number = num.nextInt(70000000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishites111@wishi.com" + number, "inon", "av", "ab1565");
		
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.SelectBodyType("0");
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
		best.ClickMeetMyMatch();
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'view more stylists')]]"));	
		//best.ClickMoreStylistsButton();
		BookingPage booking = new BookingPage(driver);
		booking.ClickBookingstylist();
	}	

	@Test(priority = 2,groups={"sanity-group"})
	public void SingleMini ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		booking.SelectMini();
		booking.ClickOneTime();
		String copun = this.configFileReader.getcopun();
		booking.UseCodCoopon(copun);
		booking.ClickFinishCheckout();
		booking.ClickMyBooking();
		booking.RefreshPage();
		booking.WaitElementDisplay(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'mini')]]"));
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'mini')]]"));
		booking.Sleep(300);
		booking.ClickBookingstylist();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void SingleMajor ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		booking.SelectMajor();
		booking.ClickOneTime();
		String copun = this.configFileReader.getcopun();
		booking.UseCodCoopon(copun);
		booking.ClickFinishCheckout();
		booking.ClickMyBooking();
		booking.RefreshPage();
		booking.WaitElementDisplay(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'major')]]"));
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'major')]]"));
		booking.Sleep(300);
		booking.close();

	}

}
