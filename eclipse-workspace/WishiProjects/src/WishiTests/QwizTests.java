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
public class QwizTests extends BaseTest 
{
	int number;

	QwizTests() {
		Random num = new Random();
		number = num.nextInt(70000000) + 356000000;
	}

	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = num.nextInt(70000000) + 356000000;
		signup.doSignUp(this.configFileReader.getnewusermaile() + number,  this.configFileReader.getnewusername(),  this.configFileReader.getpassword());
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickPetit();
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectLoveIt("3");
		best.SelectSOMETIMES("4");
		best.SelectSOMETIMES("5");
		best.SelectLoveIt("6");
		best.ClickSkipbutton2("1");
		best.SelectHELLONO("8");
		best.SelectLoveIt("9");
		best.SelectHELLONO("10");
		best.Selectbrands("brand_Adidas");
		best.ClickMeetMyMatch();
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
		booking.Switch_to_strype();
		booking.FillCardNumber(this.configFileReader.getCardNumber());		
		booking.FillCardDate( this.configFileReader.getCardDate());		
		booking.FillCardCVC(this.configFileReader.getCardCVC());
		booking.switchWindow();
		booking.QuizPresent();
		booking.ClickLetsGoQuiz();

	}
	@Test(priority = 3,groups={"sanity-group"})
	public void HowDidYouHear ()
	{
		BookingPage booking = new BookingPage(driver);		
		booking.HowDidYouHeartPresent();
		booking.Clickinstegrambutton();
		booking.InstegramTitlePresent();
		booking.Clickthewishibutton();
		booking.BirthdayTitlePresent();

	}
	@Test(priority = 4,groups={"sanity-group"})
	public void SelectBirthday ()
	{
		BookingPage booking = new BookingPage(driver);	
		booking.SelectMonth();
		booking.SelectDay();
		booking.SelectYear();
		booking.ClickNext();
		booking.SpecificNeedTitlePresent();

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
		booking.colorstitlePresent();

	}

	@Test(priority = 7,groups={"sanity-group"})
	public void SelectColors()
	{
		BookingPage booking = new BookingPage(driver);	
		booking.ClickAnything_goes();
		booking.heighttitlePresent();
	}

	@Test(priority = 8,groups={"sanity-group"})
	public void SelectHeight ()
	{
		BookingPage booking = new BookingPage(driver);	
		booking.ClickTall();
		booking.sizetitlePresent();
	}

	@Test(priority = 9,groups={"sanity-group"})
	public void SelectSize ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectSIZE_TOPS();
		booking.SelectSIZE_BOTTOM("6");
		booking.SelectSIZE_DRESS();
		booking.SelectSIZE_SHOES();
		booking.ClickNext();
		booking.budgettitlePresent();

	}
	@Test(priority = 10,groups={"sanity-group"})
	public void SelectBudget ()
	{
		BookingPage booking = new BookingPage(driver);	
		booking.Clicktop_50_100();
		booking.ClickBottoms_100_400();
		booking.ClickShoes_400_1000();
		booking.ClickBags_1000();
		booking.ClickAccessories_50_100();
		booking.ClickNext();
		booking.jeanstitlePresent();
	}

	@Test(priority = 11,groups={"sanity-group"})
	public void SelectJeans ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.ClickJEANS_SKINNY();
		booking.ClickJEANS_FLAIR();
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
		booking.topfittitlePresent();
	}

	@Test(priority = 13,groups={"sanity-group"})
	public void SelectFitTop ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectFIT_TOP_OVERSIZED();
		booking.SelectFIT_TOP_STRAIGHT();
		booking.ClickNext();
		booking.fitbottomtitlePresent();

	}

	@Test(priority = 14,groups={"sanity-group"})
	public void SelectFIT_BOTTOM ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectFIT_BOTTOM_FITTED();
		booking.SelectFIT_BOTTOM_STRAIGHT();
		booking.ClickNext();
		booking.AnythingavoidtitlePresent();

	}

	@Test(priority = 15,groups={"sanity-group"})
	public void SelectFABRICS ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectFABRICS_DRY_CLEAN_ONLY();
		booking.SelectFABRICS_VELVET();
		booking.ClickNext();
		booking.preferencetitlePresent();
	}

	@Test(priority = 16,groups={"sanity-group"})
	public void FillHeels ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Selectbutton_HEELS_ALWAYS();
		booking.best_describestitlePresent();


	}
	
	@Test(priority = 17,groups={"sanity-group"})
	public void SelectCLOTHING_PREFERENCES ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Selectbutton_CLOTHING_PREFERENCES_MIX();
		booking.comfortzonetitletitlePresent();
	}
	
	@Test(priority = 18,groups={"sanity-group"})
	public void SelectCOMFORT_ZONE ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Selectbutton_COMFORT_ZONE_NOT_AT_ALL();
		booking.JewelrytitletitlePresent();
		

	}
	@Test(priority = 19,groups={"sanity-group"})
	public void SelectJewelry ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectJEWELRY_BLACK();
		booking.SelectJEWELRY_GOLD();
		booking.ClickNext();
		booking.particularimportancetitlePresent();
		
		

	}
	
	@Test(priority = 20,groups={"sanity-group"})
	public void SelectWHAT_MATTERS ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectWHAT_MATTERS_COMFORT();
		booking.Filltextarea("test");
		booking.ClickNext();
		booking.style_icontitletitlePresent();
		

	}
	
	@Test(priority = 21,groups={"sanity-group"})
	public void SelectIcon ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Selecticon();
		booking.ClickNext();
		booking.InstagramtitlePresent();
	}
	@Test(priority = 22,groups={"sanity-group"})
	public void FillInstegram () throws Exception
	{
		BookingPage booking = new BookingPage(driver);
		booking.Fillinstegram("instegramtest");
		booking.ClickNext();
		booking.body_phototitlePresent();
	}
	@Test(priority = 23,groups={"sanity-group"})
	public void AddPhoto ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Fillphoto();
		booking.ClickNext();
		booking.phone_numbertitlePresent();
	}
	@Test(priority = 24,groups={"sanity-group"})
	public void fillphone ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Fillphone("0987654353647");
		booking.ClickNext();
		booking.locationtitlePresent();
	}
	@Test(priority = 25,groups={"sanity-group"})
	public void fillLocation ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.FillLocation("tel aviv,new york");
		booking.ClickNext();
		booking.confirm_emailtitlePresent();
	}
	@Test(priority = 26,groups={"sanity-group"})
	public void FinishQuiz ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.ClickFinishQuiz();
		booking.chatPresent();
	}
	
	 


}
