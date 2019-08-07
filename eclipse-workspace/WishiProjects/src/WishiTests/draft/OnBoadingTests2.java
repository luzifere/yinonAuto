package WishiTests.draft;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.ChatPage;
import PageObject.OnBoardingPage;
import PageObject.OnBoardingPage2;
import PageObject.SignUpPage;
import WishiTests.BaseTest;

public class OnBoadingTests2 extends BaseTest 
{
	//@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon bb av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void FamleCheep()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon bb av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.SelectGender("Female");
		ob.selectMounts(3);
		ob.selectDays(16);
		ob.selectYears(9);
		ob.FillCountry("israel");
		ob.FillCity("tel aviv");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectBrands1("1");
		ob.ClickNext();
		ob.SelectInspiration("4");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
		
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void FamleNOrmal()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon bb av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.SelectGender("Female");
		ob.selectMounts(3);
		ob.selectDays(16);
		ob.selectYears(9);
		ob.FillCountry("israel");
		ob.FillCity("tel aviv");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectBrands1("2");
		ob.ClickNext();
		ob.SelectInspiration("4");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void FamleExpensive()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon bb av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.SelectGender("Female");
		ob.selectMounts(3);
		ob.selectDays(16);
		ob.selectYears(9);
		ob.FillCountry("israel");
		ob.FillCity("tel aviv");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectBrands1("3");
		ob.ClickNext();
		ob.SelectInspiration("4");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void MaleCheep()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon bb av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.SelectGender("Male");
		ob.selectMounts(3);
		ob.selectDays(16);
		ob.selectYears(9);
		ob.FillCountry("israel");
		ob.FillCity("tel aviv");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectBrands1("1");
		ob.ClickNext();
		//ob.SelectInspiration("4");
		//ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void MaleNOrmal()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon bb av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.SelectGender("Male");
		ob.selectMounts(3);
		ob.selectDays(16);
		ob.selectYears(9);
		ob.FillCountry("israel");
		ob.FillCity("tel aviv");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectBrands1("2");
		ob.ClickNext();
		//ob.SelectInspiration("4");
	//	ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void MaleExpensive()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon bb av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.SelectGender("Male");
		ob.selectMounts(3);
		ob.selectDays(16);
		ob.selectYears(9);
		ob.FillCountry("israel");
		ob.FillCity("tel aviv");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectBrands1("3");
		ob.ClickNext();
		//ob.SelectInspiration("4");
		//ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
		ob.ClickMoreStylists();
		ob.Sleep(200);
		ob.Sleep(300);
		ob.ClickOnProfileButton();
		ob.ClickOnLogOut();
		driver.quit();

	}
}
