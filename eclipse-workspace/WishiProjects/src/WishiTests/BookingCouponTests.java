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
public class BookingCouponTests extends BaseTest 
{
	
	@Test(priority = 2,groups={"sanity-group"})
	public void CouponMini ()
	{
		Random num = new Random();
		int number;
		number = num.nextInt(70000000) + 356000000;
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		signup.ClickOnSignUpEmail();
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
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
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.BookStylistProfile();
		booking.ClickMIniGoal();
		booking.ClickMIniPlan();
		booking.ClickOneTime();
		booking.ClickPromoCode();
		booking.FillPromoCode(this.configFileReader.getcopun());
		booking.ClickSubmitPromoCode();
		booking.AssertTotalIs0();
		booking.ClickPaymentButton();
		booking.close();
		setup();
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.doLogin(this.configFileReader.getnewusermaile() + number,this.configFileReader.getpassword());
		BookingPage booking1 = new BookingPage(driver);
		booking1.RefreshPage();
		WebElement mini = driver.findElement(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'mini')]]"));
		Assert.assertTrue(BookingPage.ElementDisplay(mini));
		booking1.ClickStylistHeader();
		booking.close();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void CouponMajor ()
	{
		setup();
		int number;
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		signup.ClickOnSignUpEmail();
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
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
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.BookStylistProfile();
		booking.ClickMajorGoal();
		booking.ClickMajorPlan();
		booking.ClickOneTime();
		booking.ClickPromoCode();
		booking.FillPromoCode(this.configFileReader.getcopun());
		booking.ClickSubmitPromoCode();
		booking.AssertTotalIs0();
		booking.ClickPaymentButton();
		booking.QuizPresent();
		booking.close();
		setup();
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.doLogin(this.configFileReader.getnewusermaile() + number,this.configFileReader.getpassword());
		BookingPage booking1 = new BookingPage(driver);
		booking1.RefreshPage();
		WebElement major = driver.findElement(By.xpath("//div[text()[contains(.,'"+stylistName+"')]]/..//span[text()[contains(.,'major')]]"));
		Assert.assertTrue(BookingPage.ElementDisplay(major));
		booking1.Sleep(300);
		booking1.close();	
	}
	}
