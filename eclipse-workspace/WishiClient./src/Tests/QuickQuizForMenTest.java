package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.CeckOutPage;
import PageObjects.LoginPage;
import PageObjects.QuizPage;
import PageObjects.SearchPage;




@Listeners(Tests.Listener.class)

public class QuickQuizForMenTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("quick.men@wishi.com");
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
		String stylistName = this.configFileReader.getStylistName();
		search.FillStylist(stylistName);
		//search.FillStylist("Oren Oren");
		search.SelectStylist("//*[@name='"+stylistName+"']");
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
		co.ClickSingleButton();
		co.ClickMonthButton();
		co.Sleep(100);
		//co.scrollDownXpath();
		//co.ClickPayWithCreditCard();

	}
	@Test(priority = 5,groups={"sanity-group"})
	public void CompileBooking()
	{
		CeckOutPage co = new CeckOutPage(driver);
		/*
		//co.Fillemail("jhgjhg@fgcgf.jg");
		co.Fillnumbercard("4242424242424242424242");
		co.ClickCompileBooking();
		co.ClickTakeYourStyleQwiz();
		*/
		co.ClickAddCode();
		String copun = this.configFileReader.getcopun();
		co.FillCode(copun);
		//co.FillCode("wishitest");
		co.Sleep(200);
		co.ClickDoneOfCode();
		co.ClickApplePayButton();
		co.ClickTakeYourStyleQwiz();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void MadeQuiz()
	{
		QuizPage quiz = new QuizPage(driver);
		QuizPage.DismissAlert();
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
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		quiz.SelectTab("Oversized");
		quiz.ClickNextw();
		quiz.Sleep(200);
		quiz.SelectCC("Tops");
		quiz.scrollDownXpath();
		quiz.SelectCC("Hats");
		quiz.ClickNextw();
		quiz.Sleep(200);
		QuizPage.DismissAlert();
		quiz.SelectImage3(150,250);
		String stylistName = this.configFileReader.getStylistName();
		quiz.WaitElementDisplay(By.xpath("//*[@name='Session with "+stylistName+"']"));
		Assert.assertTrue(quiz.ElementDisplay("//*[@name='Session with "+stylistName+"']"));
		driver.resetApp();

	}
}
