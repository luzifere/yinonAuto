package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.BookingPage;
import PageObjects.OnBoardingPage;
import PageObjects.SignUpPage1;

public class BookingTest extends BaseTest2
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage1 signup = new SignUpPage1(driver);
		Random num = new Random();
		int number = 356;
		for (int counter = 1000; counter<=100000;counter++)
			number = num.nextInt(2500);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishitesttutt@wishi.com" + number, "inon", "av", "ab1565");
		SignUpPage1.ExplicityWaitIsClickable(By.xpath("//div//input[@class='sign-up-btn ng-scope']"));
		OnBoardingPage ob = new OnBoardingPage(driver);		
		ob.ClickMale();
		ob.FillBirthday();
		//ob.FillCountry("israel");
		ob.ClickNext();
		Assert.assertTrue(ob.ElementDisplay("//div[text()[contains(.,'BRANDS')]]"));
		ob.SelectBrands1("1");
		ob.ClickNext();
		ob.ClickMoreStylists();
		ob.Sleep(300);
		
	}

	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.SearchStylist("Casey Huth");
		booking.Sleep(250);
		//booking.FilterIcon();
		driver.findElement(By.xpath("//div[@ng-repeat='item in stylist_list.items']")).click();
		//driver.findElement(By.xpath("//div[@class='filter-icon']")).click();
		//driver.findElement(By.xpath("//span[@class='close-filters']")).click();
		//booking.SelectStylist();
		booking.BookStylist();
		booking.UseCodCoopon("wishitest");
		booking.ClickFinishCheckout();
		booking.Sleep(350);
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn-mob']"));
	}

}
