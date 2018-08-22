package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.BookingPage;
import PageObjects.OnBoardingPage;
import PageObjects.SignUpPage;

public class BookingCheckOutByCreditCardTest2 extends BaseTest2
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.Sleep(350);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		OnBoardingPage ob = new OnBoardingPage(driver);		
		ob.Sleep(300);
		ob.SelectGender("Male");
		ob.FillBirthday();
		//ob.FillCountry("israel");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.SelectBrands1("1");
		ob.ClickNext();
		ob.ClickMoreStylists();
		ob.Sleep(300);
		
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckoutByCreditCard ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.SearchStylist("Casey Huth");
		booking.Sleep(250);
		//booking.FilterIcon();
		//driver.findElement(By.xpath("//span[@class='close-filters']")).click();
		//booking.SelectStylist();
		driver.findElement(By.xpath("//div[@ng-repeat='item in stylist_list.items']")).click();
		booking.BookStylist();
		booking.ClickName();
		booking.Sleep(200);
		driver.switchTo().frame("__privateStripeFrame4");
		//driver.get("https://js.stripe.com/v3/elements-inner-card-a2a4069ff8634daf23dd43e823ae4390.html#hidePostalCode=true&componentName=card&wait=false&rtl=false&features[noop]=true&origin=https%3A%2F%2Fstage.wishi.me&referrer=https%3A%2F%2Fstage.wishi.me%2Fapp%2FstylistProfile%2Fc5ae785f-3331-11e7-b&controllerId=__privateStripeController1");
		booking.Sleep(200);
		booking.FillCardNumber();
		//booking.FillCardDate("0218");
		//booking.FillCardCVC("424");
		booking.Sleep(50);
	}
	
	/*{
		
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.SearchStylist("Casey Huth");
		booking.Sleep(250);
		booking.SelectStylist();
		booking.BookStylist();
		booking.ClickName();
		booking.SwitchToFrame(0);
		booking.Sleep(200);
		booking.FillCardNumber("4242424242424242");
		booking.FillCardDate("0218");
		booking.FillCardCVC("424");
		booking.Sleep(50);
		booking.switchWindow();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
	*/
	}

