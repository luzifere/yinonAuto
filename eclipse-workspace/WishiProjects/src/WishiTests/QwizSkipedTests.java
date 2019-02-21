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
		signup.doSignUp("wishitesttr@wishi.com" + number, "inon", "av", "ab1565");
		BestMatchPage best = new BestMatchPage(driver);
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
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		best.ClickMeetMyMatch();
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'SEE MORE')]]"));
		//best.ClickMoreStylistsButton();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSessionskip ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		booking.Sleep(300);
		booking.SelectMini();
		//Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Unlimited Styling')]]"));
		//booking.BookStylist();
		//booking.switchWindow();
		//booking.FillFirstName("yinon");
	//	booking.FillLastName("aba");
		//booking.Sleep(350);
		/*
		booking.SwitchToFrame(0);
		booking.FillCardNumber("4111111111111111");
		booking.FillCardDate("0222");
		booking.FillCardCVC("424");
		booking.Sleep(800);
		booking.switchWindow();
		booking.Sleep(200);
		booking.WaitElementDisplay(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]"));
		//BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		driver.findElement(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]")).click();
		*/
		String copun = this.configFileReader.getcopun();
		booking.UseCodCoopon(copun);
		booking.ClickFinishCheckout();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
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
		//qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		qwiz.ClickNext();
		qwiz.ClickSkip();
		qwiz.ClickSkip();
		//qwiz.ClickSkip();
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//button[@class='input_btn']"));
		qwiz.Sleep(300);
		qwiz.close();

	}

}
