package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class OnBoadingTests2 extends BaseTest 
{
	//@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void FamleCheep()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		PageObejecs.OnBoardingPage2 ob = new PageObejecs.OnBoardingPage2(driver);
		ob.SelectGender("Female");
		ob.SetDate();
		//ob.FillCountry("israel");
		//ob.FillCity("tel aviv");
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
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		PageObejecs.OnBoardingPage2 ob = new PageObejecs.OnBoardingPage2(driver);
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
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		PageObejecs.OnBoardingPage2 ob = new PageObejecs.OnBoardingPage2(driver);
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
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		PageObejecs.OnBoardingPage2 ob = new PageObejecs.OnBoardingPage2(driver);
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
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		PageObejecs.OnBoardingPage2 ob = new PageObejecs.OnBoardingPage2(driver);
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
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitestttt@wishi.com" + number, "inon", "av", "ab1565");
		PageObejecs.SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
		PageObejecs.OnBoardingPage2 ob = new PageObejecs.OnBoardingPage2(driver);
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
	}
}
