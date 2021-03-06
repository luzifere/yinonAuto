package draft;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.CeckOutPage;
import PageObjects.LoginPage;
import PageObjects.QuizPage;
import PageObjects.SearchPage;
import Tests.BaseTest;
import Tests.Listener;



@Listeners(Tests.Listener.class)

public class CheckOutPSTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("singletest@AutomationUser.com");
		login.Fillpassword("123455");
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
		co.ClickSelectStylistPS();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectCC("Tops");
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void CheckOut()
	{
		CeckOutPage co = new CeckOutPage(driver);
		co.ClickPayWithCreditCard();
		co.Fillnumbercard("4242424242424242424242");
		co.ClickCompileBooking();
		co.ClickTakeYourStyleQwiz();
		QuizPage quiz = new QuizPage(driver);
		QuizPage.DismissAlert();
		co.HowDidYouHearAboutUs("yinon");
		quiz.ClickShowState();
		quiz.FillSearchCountry("israel");
		quiz.SelectCountry("//*[@name='Israel']");
		quiz.FillPhoneField("0523334567");
		quiz.ClickNextw();
		quiz.Sleep(250);
		/*
		quiz.ClickNOtNow();
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		quiz.SelectTab("Oversized");
		quiz.ClickNextw();
		quiz.SelectJeans("Skinny");
		quiz.ClickNextw();
		quiz.SelectCC("Tops");
		quiz.scrollDownXpath();
		quiz.SelectCC("Hats");
		quiz.ClickNextw();
		*/
		quiz.Sleep(200);
		CeckOutPage.DismissAlert();
		quiz.SelectImage3(150,250);
		String stylistName = this.configFileReader.getStylistName();
		quiz.WaitElementDisplay(By.xpath("//*[@name='Session with "+stylistName+"']"));
		Assert.assertTrue(quiz.ElementDisplay("//*[@name='Session with "+stylistName+"']"));
		driver.resetApp();


	}
}
