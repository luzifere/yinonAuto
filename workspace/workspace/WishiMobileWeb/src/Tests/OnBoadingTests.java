package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObejecs.OnBoardingPage;
import PageObejecs.SignUpPage;
import io.appium.java_client.android.AndroidElement;

public class OnBoadingTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttt@wishi.com" + number, "inon", "av", "ab1565");
		SignUpPage.ExplicityWaitIsClickable(By.xpath("//div//button[@type='submit']"));
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void FillPersonalInformation()
	{
		OnBoardingPage ob = new OnBoardingPage(driver);
		//ob.SelectGender("Female");
		AndroidElement av = driver.findElement(By.xpath("//div//input[@id='exampleInput']"));
		av.click();
		ob.Sleep(500);
		String we = driver.getPageSource();
		System.out.println(we);
		//driver.findElement(By.cssSelector("[name='birthday_mob']")).sendKeys("11/11/2019");
		//ob.ClickOnBirthDay();
		//ob.Sleep(500);
		//String sourch = driver.getPageSource();
		//System.out.println(sourch);
		//ob.FillBirthDay("23/07/1984");
		//ob.FillCountry("israel");
		//ob.FillCity("tel aviv");
		ob.ClickNext();
		//Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'STYLE MATCH')]]"));
		
	}
	//@Test(priority = 3,groups={"sanity-group"})
	public void SelectStyle()
	{
		OnBoardingPage ob = new OnBoardingPage(driver);
		//ob.ClickBacktOfStyle();
		//ob.ClickNext();
		ob.SelectStyl("2");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'STYLE MATCH: GOALS')]]"));
	}
	//@Test(priority = 4,groups={"sanity-group"})
	public void SelectStyleGoal()
	{
		OnBoardingPage ob = new OnBoardingPage(driver);
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectStylGoal("2");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'STYLE INSPIRATION')]]"));
	}
	//@Test(priority = 5,groups={"sanity-group"})
	public void SelectInspiration()
	{
		OnBoardingPage ob = new OnBoardingPage(driver);
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.Sleep(500);
		ob.SelectInspiration("2");
		ob.ClickAddPhotoButton();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'LOCATION')]]"));
	}
//	@Test(priority = 6,groups={"sanity-group"})
	public void SelectLocation()
	{
		OnBoardingPage ob = new OnBoardingPage(driver);
		ob.ClickBacktOfStyle();
		ob.ClickAddPhotoButton();
		ob.SelectLocation("2");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
	}
//	@Test(priority = 7,groups={"sanity-group"})
	public void SelectBrands()
	{
		OnBoardingPage ob = new OnBoardingPage(driver);
		ob.ClickBacktOfStyle();
		ob.ClickAddPhotoButton();
		ob.SelectBrands("1");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'STYLIST LEVEL')]]"));
	}
	//@Test(priority = 8,groups={"sanity-group"})
	public void SelectLevel()
	{
		OnBoardingPage ob = new OnBoardingPage(driver);
		ob.ClickBacktOfStyle();
		ob.ClickNext();
		ob.SelectLevel("2");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[@class='match-image']"));
	}
}
