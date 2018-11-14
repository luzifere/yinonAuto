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
		signup.doSignUp("wishitesty@wishi.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickMale();
		best.FillAge("45");
		/*
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		*/
		best.ClickNextbutton();
		best.SelectNormal();
		best.SelectNormal2();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Your Stylist Match')]]"));
		//best.ClickMoreStylistsButton();
		/*
		driver.findElement(By.xpath("//img[@src='../images/search.png']")).click();
		
		driver.findElement(By.xpath("//div//input[@type='text']")).click();
		driver.findElement(By.xpath("//div//input[@type='text']")).sendKeys("casey");
		best.Sleep(400);
		driver.findElement(By.xpath("//li[@class='uib-typeahead-match ng-scope active']")).click();
		*/
	}

	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		

		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickSearchButton();
		booking.SearchStylist("Oren Oren");
		//booking.SelectStylist();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		booking.Sleep(250);
		PageObejecs.BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
		booking.ClickBookingstylist();		
	}

	//@Test(priority = 3,groups={"sanity-group"})
	public void CheckoutUnlimitedCreditCard ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		//booking.FilterIcon();
		//booking.SelectUnlimited();
		//booking.ClickApllay();
		booking.ClickSearchButton();
		booking.SearchStylist("Oren Oren");
		//booking.SelectStylist();
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
		booking.ClickFinishCheckout();
		PageObejecs.BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
		booking.ClickBookingstylist();			

	}

	//@Test(priority = 4,groups={"sanity-group"})
	public void CheckoutByCreditCard ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickSearchButton();
		booking.SearchStylist("Casey Huth");
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