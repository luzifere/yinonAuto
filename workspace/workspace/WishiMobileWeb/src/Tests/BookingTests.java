package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObejecs.LoginPages;
import PageObejecs.LoginPages2;

public class BookingTests extends BaseTest
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
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.BasePage.ExplicityWaitIsClickable(By.xpath("//div[@class='closeXLeft ng-scope']"));
	}

	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickSearchButton();
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		booking.Sleep(250);
		PageObejecs.BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
		booking.ClickBookingstylist();		
	}

	@Test(priority = 3,groups={"sanity-group"})
	public void CheckoutUnlimited ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.FilterIcon();
		booking.SelectUnlimited();
		booking.ClickApllay();
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		PageObejecs.BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		booking.ClickBookingstylist();		

	}

	@Test(priority = 4,groups={"sanity-group"})
	public void CheckoutByCreditCard ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.SearchStylist("Cas");
		booking.SelectStylist();
		booking.BookStylist();
		booking.switchWindow();
		booking.FillFirstName("yinon");
		booking.FillLastName("aba");
		booking.SwitchToFrame(0);
		booking.FillCardNumber("4242424242424242");
		booking.FillCardDate("0218");
		booking.FillCardCVC("424");
		booking.Sleep(50);
		booking.switchWindow();
		booking.ClickTakeYourStyleQuiz();
		booking.ClickBookingstylist();
	}

}
