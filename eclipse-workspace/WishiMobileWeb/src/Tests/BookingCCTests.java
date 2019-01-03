package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.BestMatchPage;
import PageObejecs.LoginPages;
import PageObejecs.LoginPages2;

@Listeners(Tests.Listener.class)
public class BookingCCTests extends BaseTest
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
		signup.doSignUp("wishite4sty@wishi.com" + number, "inon", "av", "ab1565");
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
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		best.ClickMeetMyMatch();
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
	@Test(priority = 3,groups={"sanity-group"})
	public void CheckoutUnlimitedCreditCard ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		//booking.FilterIcon();
		//booking.SelectUnlimited();
		//booking.ClickApllay();
		booking.ClickSearchButton();
		booking.Sleep(150);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		//booking.SelectStylist();
		booking.BookStylist();
		booking.ClickName();
		booking.Sleep(250);
		booking.Switch_to_strype();
		//booking.SwitchToFrame(0);
		//booking.Sleep(200);
		String CardNumber = this.configFileReader.getCardNumber();
		booking.FillCardNumber(CardNumber);
		String CardDate = this.configFileReader.getCardDate();
		booking.FillCardDate(CardDate);
		String CardCVC = this.configFileReader.getCardCVC();
		booking.FillCardCVC(CardCVC);
		booking.Sleep(150);
		//booking.returnToWindowdefault();
		//booking.ClickFinishCheckout();
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
		booking.returnToWindowdefault();
		PageObejecs.BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
		//booking.ClickBookingstylist();
	}

}