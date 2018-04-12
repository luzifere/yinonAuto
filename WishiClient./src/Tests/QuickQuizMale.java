package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BestMutch;
import PageObjects.CeckOutPage;
import PageObjects.LoginPage;
import PageObjects.QuizPage;
import PageObjects.SearchPage;
import PageObjects.SignUpPage;
import io.appium.java_client.TouchAction;

public class QuickQuizMale extends BaseTest
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
		sign.doSignUpClear("wishsi", "wishsi","wishitestftt@wishi.com" + number, "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickMale();
		best.fillBirthday("12121985");
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		best.ClickMoreStylistsButton();
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
		search.SelectImage2(250,450);
		//search.scrollDownXpath();
		//search.ScrollLeft();
		//search.ScrollLeft();
		//search.ScrollLeft();
		search.Sleep(200);
		search.ClickSearch();
		search.FillStylist("Mika Rissy");
		search.SelectStylist();
		//search.SelectviewProfileID();
	}	
	@Test(priority = 3,groups={"sanity-group"})
	public void SelectEvents() 
	{
		CeckOutPage co = new CeckOutPage(driver);
		//co.CheckIfElementEnabled("//*[@name='selectButtonID']");
		co.ClickSelectStylist();
		//co.CheckIfElementEnabled("//*[@name='selectButtonID']");
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
		//co.ClickMonthButton();
		co.Sleep(100);
		//co.scrollDownXpath();
		co.ClickAddCode();
		co.FillCode("wishitest");
		co.ClickDoneOfCode();
		co.ClickApplePayButton();
		co.ClickTakeYourStyleQwiz();
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void MadeQuiz() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Athletic");
		quiz.ClickNOtNow();
		quiz.SelectTab("Average");
		quiz.ClickTopPlus();
		quiz.ClickJeansPlus();
		quiz.ClickDressPlus();
		quiz.ClickShoesPlus();
		quiz.ClickNextw();
		quiz.SelectColor("Gray");
		quiz.SelectColor("Red");
		quiz.SelectColor("Orange");
		quiz.ClickNextw();
		quiz.SelectTab("Wool");
		quiz.ClickNextw();
		quiz.Sleep(150);
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		quiz.SelectTab("Gold");
		quiz.ClickNextw();
		//quiz.SelectHighlights("Legs");
		//quiz.SelectHighlights("Back");
		//quiz.ClickNextw();
		quiz.SelectTab("Close to my style");
		//quiz.SelectTab("Healthy mix of both");
		quiz.ClickAddFullBody();
		QuizPage.AcceptAlert();
		quiz.Sleep(250);
		quiz.SelectCategory("pants");
		quiz.Sleep(250);
		quiz.SelectImage2(250,450);
		quiz.SelectImage2(100,200);
		quiz.SelectImage2(150,250);
		quiz.ClickNextw();
		quiz.Sleep(250);
		Assert.assertTrue(quiz.ElementDisplay("//*[@name='Session with Mika RIssy']"));
		quiz.ClickBackButton();
		quiz.ClickStylistTab();
	}
	//@Test(priority = 6,groups={"sanity-group"})
	public void SearchStylist2() 
	{
		SearchPage search = new SearchPage(driver);
		//search.scrollDownXpath();
		//search.ScrollLeft();
		//search.ScrollLeft();
		//search.ScrollLeft();
		//search.Sleep(200);
		search.ClickSearch();
		search.FillStylist("Mika Rissy");
		search.SelectStylist();
		//search.SelectviewProfileID();
	}	
	@Test(priority = 7,groups={"sanity-group"})
	public void SelectEvents2() 
	{
		CeckOutPage co = new CeckOutPage(driver);
		//co.CheckIfElementEnabled("//*[@name='selectButtonID']");
		co.ClickSelectStylist();
		//co.CheckIfElementEnabled("//*[@name='selectButtonID']");
		co.ClickSelectStylist();
		co.ClickPlus("1");
		co.ClickPlus("2");
		co.ClickPlus("3");
		co.ClickclosetButton();
		co.ClickmixButton();
		co.Sleep(200);
		co.ClickstartCheckoutButton();
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void SelectSession2()
	{
		CeckOutPage co = new CeckOutPage(driver);
		co.ClickMonthButton();
		co.ClickSingleButton();
		//co.ClickMonthButton();
		co.Sleep(100);
		//co.scrollDownXpath();
		co.ClickAddCode();
		co.FillCode("wishitest");
		co.Sleep(200);
		co.ClickDoneOfCode();
		co.ClickApplePayButton();
		co.ClickTakeYourStyleQwiz();
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void MadeQuiz2() 
	{
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		Assert.assertTrue(quiz.ElementDisplay("//*[@name='Session with Mika RIssy']"));

	}


}
