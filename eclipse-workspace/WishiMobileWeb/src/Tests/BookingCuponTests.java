package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.BestMatchPage;
import PageObejecs.LoginPages;
import PageObejecs.LoginPages2;

@Listeners(Tests.Listener.class)
public class BookingCuponTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesty@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickontinueButton();
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
		best.ClickMeetMyMatch();
		best.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Your Stylist Match')]]"));	}

	@Test(priority = 2,groups={"sanity-group"})
	public void BookMajorCupon ()
	{
		

		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickSearchButton();
		booking.Sleep(150);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		//booking.SelectStylist();
		booking.BookStylist();
		booking.SelectMajor();
		String copun = this.configFileReader.getcopun();
		booking.UseCodCoopon(copun);
		booking.ClickFinishCheckout();
		booking.Sleep(250);
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'BODY TYPE')]]"));
		booking.ClickBookingstylist();	
	}

	@Test(priority = 3,groups={"sanity-group"})
	public void BookMiniCupon ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickSearchButton();
		booking.Sleep(150);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		//booking.SelectStylist();
		booking.BookStylist();
		booking.SelectMini();
		String copun = this.configFileReader.getcopun();
		booking.UseCodCoopon(copun);
		booking.ClickFinishCheckout();
		booking.Sleep(250);
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'BODY TYPE')]]"));
		booking.ClickBookingstylist();	
	}

	//@Test(priority = 4,groups={"sanity-group"})
	public void CheckoutByCreditCard ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickSearchButton();
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		booking.BookStylist();
		booking.ClickName();
		booking.Sleep(250);
		booking.SwitchToFrame(1);
		booking.Sleep(200);
		booking.FillCardNumber("4242424242424242");
		booking.FillCardDate("0225");
		booking.FillCardCVC("424");
		booking.Sleep(50);
		booking.switchWindow();
		PageObejecs.BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
		//booking.ClickBookingstylist();
	}

}