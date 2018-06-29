package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.CeckOutPage;
import PageObjects.LoginPage;
import PageObjects.QuizPage;
import PageObjects.SearchPage;

public class CheckOutMounthTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("272wishitestftt@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//LoginPage.DismissAlert();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void SearchStylist() 
	{
		SearchPage search = new SearchPage(driver);
		//search.SelectImage2(250,450);
		//search.scrollDownXpath();
		//search.ScrollLeft();
		//search.ScrollLeft();
		//search.ScrollLeft();
		search.ClickSearch();
		search.FillStylist("Oren Oren");
		search.SelectStylist("//*[@name='Oren Oren']");
		//search.SelectviewProfileID();
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
		co.scrollDownXpath();
		co.ClickPayWithCreditCard();

	}
	@Test(priority = 5,groups={"sanity-group"})
	public void CompileBooking()
	{
		CeckOutPage co = new CeckOutPage(driver);
		//co.Fillemail("jhgjhg@fgcgf.jg");
		co.Fillnumbercard("4242424242424242424242");
		co.ClickCompileBooking();
		co.ClickTakeYourStyleQwiz();
		QuizPage quiz = new QuizPage(driver);
		QuizPage.DismissAlert();
		quiz.ClickShowState();
		quiz.FillSearchCountry("israel");
		quiz.SelectCountry("//*[@name='Israel']");
		quiz.FillPhoneField("0523334567");
		quiz.ClickNextw();
		quiz.Sleep(250);
		quiz.ClickNOtNow();
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		quiz.SelectTab("Oversized");
		quiz.ClickNextw();
		//quiz.SelectJeans("Skinny");
		//quiz.ClickNextw();
		quiz.SelectCC("Tops");
		quiz.scrollDownXpath();
		quiz.SelectCC("Hats");
		quiz.ClickNextw();
		quiz.Sleep(200);
		CeckOutPage.DismissAlert();
		//Assert.assertTrue(quiz.ElementDisplay("//*[@name='Subscription with Oren Oren']"));

	}
}
