package draft;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.BestMatchPage;
import PageObejecs.OnBoardingPage2;
import PageObejecs.SignUpPage;
import Tests.BaseTest1;
import Tests.Listener;



@Listeners(Tests.Listener.class)
public class BestMatchTests extends BaseTest1 
{

	@Test(priority = 1,groups={"sanity-group"})
	public void BMNormalFeamle()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		best.ClickNextbutton();
		best.SelectNormal();
		best.SelectNormal2();
		best.WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
		best.SelectTags("Petite");
		best.ClickTagsNextButton();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		//best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
	}
	@Test(priority =2,groups={"sanity-group"})
	public void BMLowFeamle()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishiyinon@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		best.ClickNextbutton();
		best.SelectCheapButtonID();
		best.SelectCheapButtonID2();
		best.WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
		best.SelectTags("Petite");
		best.ClickTagsNextButton();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
		
	}
	@Test(priority =3,groups={"sanity-group"})
	public void BMExpensiveFeamle()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		best.ClickNextbutton();
		best.SelectExpensiveButtonID();
		best.SelectExpensiveButtonID2();
		best.WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
		best.SelectTags("Petite");
		best.ClickTagsNextButton();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
		
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void BMNormalMale()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickMale();
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		best.ClickNextbutton();
		best.SelectNormal();
		best.SelectNormal2();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
	}
	@Test(priority =5,groups={"sanity-group"})
	public void BMLowMale()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickMale();
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		best.ClickNextbutton();
		best.SelectCheapButtonID();
		best.SelectCheapButtonID2();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
	}
	@Test(priority =6,groups={"sanity-group"})
	public void BMExpensiveMale()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickMale();best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		
		best.ClickNextbutton();
		best.SelectExpensiveButtonID();
		best.SelectExpensiveButtonID2();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();

	}
	@Test(priority =7,groups={"sanity-group"})
	public void BMNatural()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishitesttt.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickSelfIdentityButtonID();
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		best.ClickNextbutton();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]"));
		best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
		driver.quit();
	}


	

}
