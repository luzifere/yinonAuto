package WishiTests;

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
public class QwizMaleTests extends BaseTest 
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
		best.SelectHELLONO("1");
		best.SelectHELLONO("2");
		best.SelectSOMETIMES("3");
		best.SelectLoveIt("4");
		best.SelectHELLONO("5");
		best.SelectHELLONO("6");
		best.Selectbrands("1");
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
	//@Test(priority = 3,groups={"sanity-group"})
	public void SelectEvent ()
	{
		QuizPage qwiz = new QuizPage(driver);
		qwiz.SelectTab("Work / Business Casual");
		qwiz.ClickNextOfevent();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'BODY TYPE')]]"));

	}
	//@Test(priority = 4,groups={"sanity-group"})
	public void SelectBodyType ()
	{
		QuizPage qwiz = new QuizPage(driver);
		qwiz.SelectTab("Slim");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'2 OF 7')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'HEIGHT')]]"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void SelectHeight ()
	{
		QuizPage qwiz = new QuizPage(driver);
		qwiz.SelectTab("Tall");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'2 OF 7')]]"));
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'COLORS')]]"));
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void SelectColors ()
	{
		QuizPage qwiz = new QuizPage(driver);
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
		QuizPage qwiz = new QuizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Legs");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'CLOTHING PREFERENCES')]]"));
	}
	//@Test(priority = 8,groups={"sanity-group"})
	public void SelectClothingPreferences ()
	{
		QuizPage qwiz = new QuizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Healthy mix of both");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'HEELS')]]"));
	}
	//@Test(priority = 9,groups={"sanity-group"})
	public void SelectHeels ()
	{
		QuizPage qwiz = new QuizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Always");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'FABRICS')]]"));
	}
	@Test(priority = 10,groups={"sanity-group"})
	public void SelectFabrics ()
	{
		QuizPage qwiz = new QuizPage(driver);
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
		QuizPage qwiz = new QuizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Floral");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'SIZE')]]"));
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void SelectSize ()
	{
		QuizPage qwiz = new QuizPage(driver);
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
		QuizPage qwiz = new QuizPage(driver);
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
		QuizPage qwiz = new QuizPage(driver);
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
		QuizPage qwiz = new QuizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Gold");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[@class='step-title ng-binding']"));
		qwiz.Sleep(300);
		//qwiz.close();
		//Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
	}
	@Test(priority = 14,groups={"sanity-group"})
	public void FillNumberPhone ()
	{
		QuizPage qwiz = new QuizPage(driver);
		qwiz.FillNumberPhone("0523365435");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//button[@class='input_btn']"));
		qwiz.Sleep(300);
		qwiz.close();
		//qwiz.close();
		//Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
	}
	//@Test(priority = 15,groups={"sanity-group"})
	public void SelectBrands ()
	{
		QuizPage qwiz = new QuizPage(driver);
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
		QuizPage qwiz = new QuizPage(driver);
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
	
	
}
