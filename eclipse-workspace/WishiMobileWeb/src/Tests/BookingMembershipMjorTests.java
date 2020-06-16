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

import PageObejecs.BasePage;
import PageObejecs.BookingPage;
import draft.LoginPages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;




@Listeners(Tests.Listener.class)
public class BookingMembershipMjorTests extends BaseTest1
{
	

	@Test(priority = 3,groups={"sanity-group"})
	public void MembershipMajor () throws IOException
	{
		int number;
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
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
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		String stylistLastName = this.configFileReader.getStylistLastName();
		booking.SearchStylist(stylistName,stylistLastName);
		booking.BookStylistProfile();
		booking.ClickMajorGoal();
		booking.ClickMajorPlan();
		booking.ClickSubScription();
		booking.ClickaddCC();
		booking.Switch_to_strype();
		booking.FillCardNumber(this.configFileReader.getCardNumber());		
		booking.FillCardDate( this.configFileReader.getCardDate());		
		booking.FillCardCVC(this.configFileReader.getCardCVC());
		booking.ClickComplateBookingmajor();
		booking.switchWindow();
		booking.close();
		setup();
		LoginPages login = new LoginPages(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.doLogin(this.configFileReader.getnewusermaile() + number,this.configFileReader.getpassword());
		BookingPage booking1 = new BookingPage(driver);
		booking1.waitForPageLoaded();
		booking1.MyBookingDisplay();
		booking1.MySessionDisplay();
		AndroidElement list = driver.findElement(By.xpath("//div[text()[contains(.,'"+stylistName+"')]][1]"));
		System.out.println(list);
		booking1.ExplicityWaitIsDisplayed(list);
		Assert.assertTrue(booking1.ElementDisplay(list));
		booking1.ClickStylistHeader();
	}
	
}





