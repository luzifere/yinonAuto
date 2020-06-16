package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.BestMatchPage;
import PageObejecs.LoginPages2;
import draft.LoginPages;





@Listeners(Tests.Listener.class)
public class QwizAgainTests extends BaseTest1 
{
	int number;

	void QwizTests() {
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
	}

	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPages2 login = new LoginPages2(driver);
		login.ClickLoginButton();
		login.Clearpassword();
		login.Clearusername();
		login.doLogin("wishi.test@wishi.com", "123456");
		login.Sleep(300);
		login.MyBookingDisplay();
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickStylistHeader();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		String stylistLastName = this.configFileReader.getStylistLastName();
		booking.SearchStylist(stylistName,stylistLastName);
		booking.BookStylistProfile();
		booking.ClickMIniGoal();
		booking.ClickMIniPlan();
		booking.ClickOneTime();
		booking.ClickComplateBooking();
		booking.QuizPresent();
		booking.ClickLetsGoQuiz();

	}

	@Test(priority = 5,groups={"sanity-group"})
	public void SelectSpecificNneed ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);	
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
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);	
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
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.SelectHIGHLIGHT_CLEAVAGE();
		booking.SelectHIGHLIGHT_ABS();
		booking.SelectHIGHLIGHT_WAISTS();
		booking.ClickNext();
		booking.comfortzonetitletitlePresent();
	}

	
	@Test(priority = 18,groups={"sanity-group"})
	public void SelectCOMFORT_ZONE ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.Selectbutton_COMFORT_ZONE_NOT_AT_ALL();
		booking.style_icontitletitlePresent();
		

	}
	@Test(priority = 21,groups={"sanity-group"})
	public void SelectIcon ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.Filltextarea("test");
		booking.ClickNext();
		booking.locationtitlePresent();
	}
	@Test(priority = 25,groups={"sanity-group"})
	public void fillLocation ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.FillLocation("tel aviv,new york");
		booking.ClickFinishQuiz();
		booking.chatPresent();
	}
}
