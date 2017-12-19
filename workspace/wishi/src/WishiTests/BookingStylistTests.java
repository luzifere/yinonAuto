package WishiTests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;



public class BookingStylistTests extends BaseTest 
{

	@Test(priority = 1,groups={"sanity-group"})
	public void Login() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.doLogin("yinon@wishi.me", "156523784");
		Assert.assertTrue(LoginPage.isnotatpage("//div//input[@value='Log in']"));
	}

	//@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		booking.ClickBookingstylist();		
	}

	//@Test(priority = 3,groups={"sanity-group"})
	public void CheckoutUnlimited ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectService();
		booking.SelectUnlimited();
		booking.ClickApllay();
		booking.SearchStylist("Cas");
		booking.SelectStylist();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		//		booking.ClickTakeYourStyleQuiz();
		booking.ClickBookingstylist();

	}

	@Test(priority = 4,groups={"sanity-group"})
	public void CheckoutByCreditCard ()
	{
		BookingPage booking = new BookingPage(driver);
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
