package Tests;


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import draft.LoginPages;
import io.appium.java_client.android.AndroidElement;


@Listeners(Tests.Listener.class)
public class BookingsingleTests extends BaseTest1
{
	int number;

	BookingsingleTests() {
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
	}
	
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.waitForPageLoaded();
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
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
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
		best.StylistPageDisplayed();	
	}	

	@Test(priority = 2,groups={"sanity-group"})
	public void SingleMini() throws IOException
	{
		
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		String stylistLastName = this.configFileReader.getStylistLastName();
		booking.SearchStylist(stylistName,stylistLastName);
		booking.BookStylistProfile();
		booking.ClickMIniGoal();
		booking.ClickMIniPlan();
		booking.ClickOneTime();
		booking.ClickaddCC();
		booking.Switch_to_strype();
		booking.FillCardNumber(this.configFileReader.getCardNumber());		
		booking.FillCardDate( this.configFileReader.getCardDate());		
		booking.FillCardCVC(this.configFileReader.getCardCVC());
		booking.ClickComplateBooking();
		booking.switchWindow();
		booking.close();
		setup();
		LoginPages login = new LoginPages(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.doLogin(this.configFileReader.getnewusermaile() + number,this.configFileReader.getpassword());
		PageObejecs.BookingPage booking1 = new PageObejecs.BookingPage(driver);
		booking1.waitForPageLoaded();
		booking1.MyBookingDisplay();
		booking1.MySessionDisplay();
		AndroidElement list = driver.findElement(By.xpath("//div[text()[contains(.,'"+stylistName+"')]][1]"));
		System.out.println(list);
		booking1.ExplicityWaitIsDisplayed(list);
		Assert.assertTrue(booking1.ElementDisplay(list));
		booking1.ClickStylistHeader();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void SingleMajor () throws IOException
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		String stylistLastName = this.configFileReader.getStylistLastName();
		booking.SearchStylist(stylistName,stylistLastName);
		booking.BookStylistProfile();
		booking.ClickMajorGoal();
		booking.ClickMajorPlan();
		booking.ClickOneTime();
		booking.ClickComplateBooking();
		booking.QuizPresent();
		booking.close();
		setup();
		LoginPages login = new LoginPages(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.doLogin(this.configFileReader.getnewusermaile() + number,this.configFileReader.getpassword());
		PageObejecs.BookingPage booking1 = new PageObejecs.BookingPage(driver);
		booking1.waitForPageLoaded();
		booking1.MyBookingDisplay();
		booking1.MySessionDisplay();
		AndroidElement list = driver.findElement(By.xpath("//div[text()[contains(.,'"+stylistName+"')]][1]"));
		System.out.println(list);
		booking1.ExplicityWaitIsDisplayed(list);
		Assert.assertTrue(booking1.ElementDisplay(list));
		booking1.close();	
	}
	}
