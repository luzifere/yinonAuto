package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BestMutch;
import PageObjects.CeckOutPage;
import PageObjects.LoginPage;
import PageObjects.QuizPage;
import PageObjects.SearchPage;
import PageObjects.SignUpPage;
import io.appium.java_client.TouchAction;




@Listeners(Tests.Listener.class)

public class QuizForMaleTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickNextbutton();
		best.ClickMale();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.SelectBrands("GAP");
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//*[@name='So, to recap ']"));
		best.ClickNextbutton();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		best.scrollDownXpath();
		best.CloseBestMatch();
		best.Sleep(500);
		BestMutch.AcceptAlert();
		best.Sleep(500);
		BestMutch.AcceptAlert();

	}
	@Test(priority = 2,groups={"sanity-group"})
	public void SearchStylist() 
	{
		SearchPage search = new SearchPage(driver);
		//search.ClickCloseButton();
		//search.SelectImage2(250,450);
		//search.scrollDownXpath();
		//search.ScrollLeft();
		//search.ScrollLeft();
		//search.ScrollLeft();
		search.Sleep(200);
		search.ClickSearch();
		String stylistName = this.configFileReader.getStylistName();
		search.FillStylist(stylistName);
		//search.FillStylist("Oren Oren");
		search.SelectStylist("//*[@name='"+stylistName+"']");
	}	
	@Test(priority = 3,groups={"sanity-group"})
	public void SelectEvents() 
	{
		CeckOutPage co = new CeckOutPage(driver);
		co.ClickSelectStylist();
		co.ClickPlus("1");
		co.ClickPlus("2");
		co.ClickPlus("3");
		co.ClickclosetButton();
		co.ClickmixButton();
		co.Sleep(200);
		co.ClickstartCheckoutButton();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void SelectSession()
	{
		CeckOutPage co = new CeckOutPage(driver);
		co.ClickMonthButton();
		//co.ClickSingleButton();
		//co.ClickMonthButton();
		co.Sleep(100);
		//co.scrollDownXpath();
		co.ClickAddCode();
		String copun = this.configFileReader.getcopun();
		co.FillCode(copun);
		//co.FillCode("wishitest");
		co.ClickDoneOfCode();
		co.ClickApplePayButton();
		co.ClickTakeYourStyleQwiz();
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void SelectCountry() 
	{
		QuizPage quiz = new QuizPage(driver);
		CeckOutPage co = new CeckOutPage(driver);
		QuizPage.DismissAlert();
		co.HowDidYouHearAboutUs("yinon");
		quiz.ClickShowState();
		quiz.FillSearchCountry("israel");
		quiz.SelectCountry("//*[@name='Israel']");
		quiz.FillPhoneField("0523334567");
		quiz.ClickNextw();
		quiz.Sleep(250);
		quiz.ClickNOtNow();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void SelectBodyType() 
	{
		QuizPage quiz = new QuizPage(driver);
		
		quiz.SelectTab("Athletic");
		
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void SelectHeight() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Average");
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void SelectSize() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.ClickTopPlus();
		quiz.ClickJeansPlus();
		quiz.ClickDressPlus();
		quiz.ClickShoesPlus();
		quiz.ClickTopPlus();
		quiz.ClickJeansPlus();
		quiz.ClickDressPlus();
		quiz.ClickShoesPlus();
		quiz.ClickTopMinus();
		quiz.ClickJeansMinus();
		quiz.ClickDressMinus();
		quiz.ClickShoesMinus();
		quiz.ClickNextw();
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void SelectColor() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectColor("Gray");
		quiz.SelectColor("Red");
		quiz.SelectColor("Orange");
		quiz.ClickNextw();
	}
	@Test(priority = 10,groups={"sanity-group"})
	public void SelectFabrics() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Wool");
		quiz.ClickNextw();
		quiz.Sleep(150);
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void SelectFitTop() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void SelectFitBottom() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void SelectJewelry() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Gold");
		quiz.SelectTab("Black");
		quiz.ClickNextw();
		//quiz.SelectHighlights("Legs");
		//quiz.SelectHighlights("Back");
		//quiz.ClickNextw();
	}
	@Test(priority = 14,groups={"sanity-group"})
	public void SelectZone() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Close to my style");
		//quiz.SelectTab("Healthy mix of both");
	}
	@Test(priority = 15,groups={"sanity-group"})
	public void SelectClothingCategories() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.Sleep(150);
		quiz.ClickAddFullBody();
		quiz.DismissAlert();
		quiz.SelectCC("Tops");
		quiz.scrollDownXpath();
		quiz.SelectCC("Hats");
		quiz.Sleep(150);
		quiz.ClickNextw();
		quiz.Sleep(250);
		quiz.SelectImage3(150,250);
		quiz.WaitElementDisplay(By.xpath("//*[@name='Session with Oren Oren']"));
		Assert.assertTrue(quiz.ElementDisplay("//*[@name='Session with Oren Oren']"));
		driver.resetApp();
	}
	//@Test(priority = 16,groups={"sanity-group"})
	public void SelectYourCloset() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.Sleep(250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectCategory("pants");
		quiz.Sleep(250);
		quiz.SelectImage2(250,450);
		quiz.SelectImage2(100,200);
		quiz.SelectImage2(150,250);
		driver.findElement(By.id("Add")).click();
		//quiz.ClickNextw();
		quiz.Sleep(250);
		quiz.SelectImage3(150,250);
		String stylistName = this.configFileReader.getStylistName();
		quiz.WaitElementDisplay(By.xpath("//*[@name='Session with "+stylistName+"']"));
		Assert.assertTrue(quiz.ElementDisplay("//*[@name='Session with "+stylistName+"']"));
		driver.resetApp();
	}

}
