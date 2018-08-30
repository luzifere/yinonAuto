 package WishiTests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BestMatchPage;
import PageObject.BookingPage;
import PageObject.OnBoardingPage;
import PageObject.QwizPage;
import PageObject.SignUpPage;
@Listeners(WishiTests.Listener.class)
public class QwizSkipedTests extends BaseTest
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
		best.FillAge("45");
		/*
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		*/
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
	public void CheckOutSessionskip ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickBookingstylist();
		booking.SearchStylist("clea");
		booking.SelectStylist();
		booking.scrollDown();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void ClickSkip ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickNextOfevent();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickNext();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//button[@class='input_btn']"));
		driver.close();

	}

}
