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
import PageObject.SignUpPage;


@Listeners(WishiTests.Listener.class)
public class BookingStylistTests extends BaseTest 
{

	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttr@wishi.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		best.ClickNextbutton();
		best.SelectNormal();
		best.SelectNormal2();
		best.WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
		best.SelectTags("Petite");
		best.ClickNextbutton();
		best.SelectInspiration("2");
		best.ClickNextbutton();
		best.Selectbrands("2");
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
	}

	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.ClickBookingstylist();
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Per Session')]]"));
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		booking.ClickBookingstylist();		
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void CheckoutUnlimited ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectService();
		booking.SelectUnlimited();
		booking.ClickApllay();
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		//Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Unlimited Styling')]]"));
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		booking.ClickBookingstylist();		

	}

	@Test(priority = 4,groups={"sanity-group"})
	public void CheckoutByCreditCard ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		booking.BookStylist();
		booking.switchWindow();
		booking.FillFirstName("yinon");
		booking.FillLastName("aba");
		booking.SwitchToFrame(0);
		booking.FillCardNumber("4242424242424242");
		booking.FillCardDate("0222");
		booking.FillCardCVC("424");
		booking.Sleep(500);
		booking.switchWindow();
		booking.Sleep(200);
		booking.WaitElementDisplay(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]"));
		//BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		driver.findElement(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]")).click();
		booking.ClickBookingstylist();	
		driver.quit();
	}


}
