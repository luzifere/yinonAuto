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
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttr@wishi.com" + number, "inon bb av", "ab1565");
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
		best.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Your Stylist Match!')]]"));
		//best.ClickMoreStylistsButton();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSessionskip ()
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
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void ClickSkip ()
	{
		QwizPage qwiz = new QwizPage(driver);
		//qwiz.ClickNextOfevent();
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
		qwiz.Sleep(300);
		qwiz.close();

	}

}
