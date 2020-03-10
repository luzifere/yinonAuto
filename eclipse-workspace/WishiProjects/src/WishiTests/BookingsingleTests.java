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
public class BookingsingleTests extends BaseTest 
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
		best.ClickPetit();
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
		best.Selectbrands("brand_H&M");
		best.ClickMeetMyMatch();
		best.StylistPageDisplayed();	
	}	

	@Test(priority = 2,groups={"sanity-group"})
	public void BookStylist ()
	{
		
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.BookStylistProfile();
		booking.ClickMIniGoal();
		booking.ClickMIniPlan();
		booking.ClickOneTime();
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
		booking.ClickMyStyleSessions();
		WebElement mini = driver.findElement(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'mini')]]"));
		Assert.assertTrue(BookingPage.ElementDisplay(mini));
		booking.ClickStylistHeader();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void MembershipMajor ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.BookStylistProfile();
		booking.ClickMajorGoal();
		booking.ClickMajorPlan();
		booking.ClickOneTime();
		booking.ClickPaymentButton();
		booking.ChatPresent();
		booking.Sleep(200);
		booking.ClickMyStyleSessions();
		WebElement major = driver.findElement(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'major')]]"));
		Assert.assertTrue(BookingPage.ElementDisplay(major));
		booking.Sleep(300);
		booking.close();	
	}
	}
