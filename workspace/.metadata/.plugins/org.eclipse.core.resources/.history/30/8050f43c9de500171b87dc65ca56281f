 package WishiTests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.OnBoardingPage;
import PageObject.QwizPage;
import PageObject.SignUpPage;

public class QwizSkipedTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp2()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestt@wishi.com" + number, "inon", "av", "ab1565");
		BasePage.ExplicityWaitIsClickable(By.xpath("//div[@class='closeXLeft ng-scope']"));
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
	}

}
