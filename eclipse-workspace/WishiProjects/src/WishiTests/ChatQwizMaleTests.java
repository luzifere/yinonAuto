package WishiTests;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import PageObject.QwizPage;
import PageObject.SignUpPage;
@Listeners(WishiTests.Listener.class)
public class ChatQwizMaleTests extends BaseTest 
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
		signup.doSignUp("wishitesttr@wishi.com" + number, "inon bb av", "ab1565");
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickMale();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectLoveIt("3");
		best.SelectSOMETIMES("4");
		best.SelectSOMETIMES("5");
		best.Selectbrands("2");
		best.ClickMeetMyMatch();
		best.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Your Stylist Match!')]]"));
		best.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Your Stylist Match!')]]"));
		//best.ClickMoreStylistsButton();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		booking.SelectMini();
		booking.ClickOneTime();
		String copun = this.configFileReader.getcopun();
		booking.UseCodCoopon(copun);
		booking.ClickFinishCheckout();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void FillBirthday ()
	{
		QwizPage qwiz = new QwizPage(driver);
		//qwiz.switchWindow();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'Before we start working together I have some questions for you.')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'First, would you mind telling me your birthday?')]]"));
		qwiz.FillDate("12121987");
		qwiz.WaitElementDisplay(By.xpath("//div[@class=' flag-dropdown']"));
	    Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'1987-12-12')]]"));		
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void FillNumberPhone ()
	{
		QwizPage qwiz = new QwizPage(driver);
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'Oh cool! I love Sagittariuses!')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'I’ll text you when your look is ready to review. What’s your phone number?')]]"));
		qwiz.selectLocation("3");
		qwiz.FillNumberPhone("0523365435");
		qwiz.ClickNext();
		qwiz.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Average')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'0523365435')]]"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void Selectheight ()
	{
		QwizPage qwiz = new QwizPage(driver);
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'Now, let’s get a little personal. What’s your height?')]]"));
		qwiz.SelectHeight("Average");
		//qwiz.ClickNextOfevent();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'What kinds of pieces would you like me to shop for?')]]"));

	}
	
	@Test(priority = 6,groups={"sanity-group"})
	public void Selectategory ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.SelectCategory("Tops");
		qwiz.SelectCategory("Pants");
		qwiz.SelectCategory("Shoes");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'What’s your size?')]]"));
		
	}
	
	@Test(priority = 7,groups={"sanity-group"})
	public void SelectSize ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.OpenDropDwon("1");
		qwiz.SelectTopsSize("M");
		qwiz.OpenDropDwon("2");
		qwiz.SelectBottomsSize("FR 32 / UK 4/ US 0");
		qwiz.OpenDropDwon("3");
		qwiz.SelectShoesSize("FR 36.5/ UK 2.5/ US 5.5");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'And your budget?')]]"));
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void SelectBudget ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.OpenDropDwon("4");
		qwiz.SelectBottomsBudget("$50-$100","1");
		qwiz.OpenDropDwon("5");
		qwiz.SelectBottomsBudget("$50-$100","2");
		qwiz.OpenDropDwon("6");
		qwiz.SelectBottomsBudget("$50-$100","3");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'Great. Now to the fun part: Our first session! What kinds of outfits would you like me to focus on?')]]"));
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void SelectEvent()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.SelectEvent("Black Tie");
		qwiz.SelectEvent("Dinner");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'Who are your style icons?')]]"));
		qwiz.FillText("test");
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'test')]]"));
		qwiz.ClickHeart();
		Assert.assertTrue(qwiz.ElementDisplay("(//*[local-name()='svg']//*[local-name()='g' and @id='type']//*[local-name()='image' and @id='heart'])[1]"));

	}
	/*
	@Test(priority = 6,groups={"sanity-group"})
	public void SelectColors ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.Sleep(10);
		qwiz.ClickNext();
		qwiz.SelectColors("3");
		qwiz.SelectColors("4");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'3 OF 7')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'FABRICS')]]"));
	}
	//@Test(priority = 7,groups={"sanity-group"})
	public void SelectHighlight ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Legs");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'CLOTHING PREFERENCES')]]"));
	}
	//@Test(priority = 8,groups={"sanity-group"})
	public void SelectClothingPreferences ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Healthy mix of both");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'HEELS')]]"));
	}
	//@Test(priority = 9,groups={"sanity-group"})
	public void SelectHeels ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Always");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'FABRICS')]]"));
	}
	@Test(priority = 10,groups={"sanity-group"})
	public void SelectFabrics ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Wool");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'4 OF 7')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'SIZE')]]"));
	}
	//@Test(priority = 11,groups={"sanity-group"})
	public void SelectPrints ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Floral");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'SIZE')]]"));
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void SelectSize ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.ClickPlus("1");
		qwiz.scrollDown();
		qwiz.ClickMinus("2");
		qwiz.ClickPlus("4");
		WebElement element = driver.findElement(By.xpath("(//div[@class='increase-size'])[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		qwiz.ClickMinus("4");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'5 OF 7')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'BUDGET')]]"));
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void SelectBudget ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectBlouses("0");
		qwiz.SelectBottoms("0");
		qwiz.SelectShoes("0");
		qwiz.scrollDown();
		qwiz.SelectBags("0");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'6 OF 7')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'COMFORT ZONE')]]"));
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void SelectComfortZone ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.SelectBlouses("1");
		qwiz.ClickNext();
		qwiz.SelectTab("Close to my style");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'7 OF 7')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[@class='step-title ng-binding']"));
	}
	//@Test(priority = 14,groups={"sanity-group"})
	public void SelectJEWELRY ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Gold");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[@class='step-title ng-binding']"));
		qwiz.Sleep(300);
		//qwiz.close();
		//Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
	}
	
	//@Test(priority = 15,groups={"sanity-group"})
	public void SelectBrands ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectBrands("3");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//button[@class='input_btn']"));
		//Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'INVENTORY')]]"));
	}
	//@Test(priority = 16,groups={"sanity-group"})
	public void SelectInventory ()
	{
		QwizPage qwiz = new QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Mix");
		qwiz.scrollDown();
		qwiz.selectBudget(2);
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//button[@class='input_btn']"));
		qwiz.Sleep(300);
		qwiz.close();

	}
	
	*/
}
