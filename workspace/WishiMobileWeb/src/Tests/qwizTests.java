package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class qwizTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.BasePage.ExplicityWaitIsClickable(By.xpath("//div[@class='closeXLeft ng-scope']"));
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		PageObejecs.BookingPage booking = new PageObejecs.BookingPage(driver);
		booking.ClickSearchButton();
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		booking.Sleep(250);
		PageObejecs.BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
		//booking.ClickBookingstylist();		
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void SelectEvent ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.Sleep(250);
		qwiz.SelectTab("No Specific Event");
		qwiz.ClickNextOfevent();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'BODY TYPE')]]"));

	}
	@Test(priority = 4,groups={"sanity-group"})
	public void SelectBodyType ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.SelectTab("Curvy");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'HEIGHT')]]"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void SelectHeight ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Tall");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'COLORS')]]"));
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void SelectColors ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.Sleep(10);
		qwiz.ClickNext();
		qwiz.SelectColors("3");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'HIGHLIGHT')]]"));
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void SelectHighlight ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Legs");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'CLOTHING PREFERENCES')]]"));
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void SelectClothingPreferences ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack2();
		qwiz.ClickNext();
		qwiz.SelectTab("Healthy mix of both");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'HEELS')]]"));
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void SelectHeels ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Always");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'FABRICS')]]"));
	}
	@Test(priority = 10,groups={"sanity-group"})
	public void SelectFabrics ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Fur");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'PRINTS')]]"));
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void SelectPrints ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Floral");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'SIZE')]]"));
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void SelectSize ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.ClickPlus("1");
		qwiz.scrollDown();
		qwiz.ClickMinus("2");
		qwiz.ClickPlus("3");
		qwiz.ClickMinus("4");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'COMFORT ZONE')]]"));
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void SelectComfortZone ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Close to my style");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'JEWELRY')]]"));
	}
	@Test(priority = 14,groups={"sanity-group"})
	public void SelectJEWELRY ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Gold");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
	}
	@Test(priority = 15,groups={"sanity-group"})
	public void SelectBrands ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectBrands("3");
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//div[text()[contains(.,'INVENTORY')]]"));
	}
	@Test(priority = 16,groups={"sanity-group"})
	public void SelectInventory ()
	{
		PageObejecs.QwizPage qwiz = new PageObejecs.QwizPage(driver);
		qwiz.ClickBack();
		qwiz.ClickNext();
		qwiz.SelectTab("Mix");
		qwiz.scrollDown();
		qwiz.selectBudget(2);
		qwiz.ClickNext();
		Assert.assertTrue(qwiz.ElementDisplay("//button[@class='input_btn']"));
		
	}
}
