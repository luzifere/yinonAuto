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
import PageObject.ChatPage;
import PageObject.LoginPage;
import PageObject.SignUpPage;


@Listeners(WishiTests.Listener.class)
public class BookingMembershipTests extends BaseTest 
{

	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		Random num = new Random();
		int number = 356000000;
		for (int counter = 580000000; counter<=1000000000;counter++)
			number = num.nextInt(70000000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishites111@wishi.com" + number, "inon bb av", "ab1565");
		
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
		BookingPage booking = new BookingPage(driver);
		booking.ClickBookingstylist();
	}	

	@Test(priority = 2,groups={"sanity-group"})
	public void MembershipMini ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		booking.SelectMini();
		booking.Switch_to_strype();
		booking.Sleep(250);
		String CardNumber = this.configFileReader.getCardNumber();
		booking.FillCardNumber(CardNumber);
		String CardDate = this.configFileReader.getCardDate();
		booking.FillCardDate(CardDate);
		String CardCVC = this.configFileReader.getCardCVC();
		booking.FillCardCVC(CardCVC);
		booking.Sleep(800);
		booking.switchWindow();
		booking.Sleep(200);
		booking.ClickMyBooking();
		booking.RefreshPage();
		booking.WaitElementDisplay(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'mini')]]"));
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'mini')]]"));
		booking.ClickBookingstylist();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void MembershipMajor ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		booking.SelectMajor();
		booking.Switch_to_strype();
		booking.Sleep(250);
		String CardNumber = this.configFileReader.getCardNumber();
		booking.FillCardNumber(CardNumber);
		String CardDate = this.configFileReader.getCardDate();
		booking.FillCardDate(CardDate);
		String CardCVC = this.configFileReader.getCardCVC();
		booking.FillCardCVC(CardCVC);
		booking.Sleep(800);
		booking.switchWindow();
		booking.Sleep(200);
		booking.ClickMyBooking();
		booking.RefreshPage();
		booking.WaitElementDisplay(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'major')]]"));
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'major')]]"));
		booking.Sleep(300);
		booking.close();	

	}

	//@Test(priority = 4,groups={"sanity-group"})
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
		booking.FillCardNumber("4111111111111111");
		booking.FillCardDate("0222");
		booking.FillCardCVC("424");
		booking.Sleep(500);
		booking.switchWindow();
		booking.Sleep(200);
		booking.WaitElementDisplay(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]"));
		//BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		driver.findElement(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]")).click();
		booking.ClickBookingstylist();	
		driver.close();
	}


}
