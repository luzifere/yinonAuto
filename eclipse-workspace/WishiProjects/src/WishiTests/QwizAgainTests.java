package WishiTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BestMatchPage;
import PageObject.BookingPage;
import PageObject.LoginPage;
import PageObject.OnBoardingPage;
import PageObject.OnBoardingPage2;
import PageObject.QuizPage;
import PageObject.SignUpPage;









@Listeners(WishiTests.Listener.class)
public class QwizAgainTests extends BaseTest 
{
	int number;

	void QwizTests() {
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
	}

	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.doLogin("wishi.test@wishi.com", "123456");
		login.Sleep(300);
		login.MyBookingDisplay();
		BookingPage booking = new BookingPage(driver);
		booking.ClickStylistHeader();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.BookStylistProfile();
		booking.ClickMIniGoal();
		booking.ClickMIniPlan();
		booking.ClickOneTime();
		booking.ClickPaymentButton();
		booking.QuizPresent();
		booking.ClickLetsGoQuiz();

	}

	@Test(priority = 5,groups={"sanity-group"})
	public void SelectSpecificNneed ()
	{
		BookingPage booking = new BookingPage(driver);	
		booking.SelectGOAL_WORKWEAR();
		booking.ClickNext();
		booking.describe_your_worktitleTitlePresent();
		booking.Clickotherbutton();
		booking.Filltextarea("test");
		booking.ClickDone();
		booking.clothing_categoriestitlePresent();
	}

	@Test(priority = 6,groups={"sanity-group"})
	public void SelectCategories ()
	{
		BookingPage booking = new BookingPage(driver);	
		booking.ClickCLOTHING_CATEGORY_TOPS();
		booking.ClickCLOTHING_CATEGORY_PANTS();
		booking.ClickCLOTHING_CATEGORY_PANTS();
		booking.ClickCLOTHING_CATEGORY_JACKETS();
		booking.ClickCLOTHING_CATEGORY_JUMPSUITS();
		booking.ClickCLOTHING_CATEGORY_SWEATERS();
		booking.ClickCLOTHING_CATEGORY_SUNGLASSES();
		booking.ClickCLOTHING_CATEGORY_SHOES();
		booking.ClickCLOTHING_CATEGORY_SKIRTS();
		booking.ClickCLOTHING_CATEGORY_DRESSES();
		booking.ClickCLOTHING_CATEGORY_JEANS();
		booking.ClickCLOTHING_CATEGORY_BLAZERS();
		booking.ClickCLOTHING_CATEGORY_COATS();
		booking.ClickCLOTHING_CATEGORY_SCARVES();
		booking.ClickCLOTHING_CATEGORY_JEWELRIES();
		booking.ClickCLOTHING_CATEGORY_HATS();
		booking.ClickCLOTHING_CATEGORY_BAGS();
		booking.ClickNext();
		booking.featurestitlePresent();

	}

		@Test(priority = 12,groups={"sanity-group"})
	public void SelectHIGHLIGHT ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectHIGHLIGHT_CLEAVAGE();
		booking.SelectHIGHLIGHT_ABS();
		booking.SelectHIGHLIGHT_WAISTS();
		booking.ClickNext();
		booking.comfortzonetitletitlePresent();
	}

	
	@Test(priority = 18,groups={"sanity-group"})
	public void SelectCOMFORT_ZONE ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Selectbutton_COMFORT_ZONE_NOT_AT_ALL();
		booking.style_icontitletitlePresent();
		

	}
	@Test(priority = 21,groups={"sanity-group"})
	public void SelectIcon ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Filltextarea("test");
		booking.ClickNext();
		booking.locationtitlePresent();
	}
	@Test(priority = 25,groups={"sanity-group"})
	public void fillLocation ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.FillLocation("tel aviv,new york");
		booking.ClickFinishQuiz();
		booking.chatPresent();
	}
	 


}
