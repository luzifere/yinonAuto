package WishiTests;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BestMatchPage;
import PageObject.BookingPage;
import PageObject.ChatPage;
import PageObject.LoginPage;
import PageObject.SignUpPage;


@Listeners(WishiTests.Listener.class)
public class BookingMembershipTests extends BaseTest 
{

	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		login.ClickLoginButton();
		login.doLogin("wishites111@wishi.com343230", "ab1565");
		login.Sleep(200);
		BookingPage booking = new BookingPage(driver);
		booking.ClickBookingstylist();
		booking.SelectService();
		booking.SelectUnlimited();
		booking.ClickApllay();
	}	

	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Unlimited Styling')]]"));
		booking.BookStylist();
		booking.switchWindow();
		booking.FillFirstName("yinon");
		booking.FillLastName("aba");
		booking.SwitchToFrame(0);
		booking.FillCardNumber("4242424242424242");
		booking.FillCardDate("0222");
		booking.FillCardCVC("424");
		booking.Sleep(800);
		booking.switchWindow();
		booking.Sleep(200);
		booking.WaitElementDisplay(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]"));
		//BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		driver.findElement(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]")).click();
		booking.ClickBookingstylist();	
		/*
		ChatPage chat = new ChatPage(driver);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.doLogin("aya@wishi.me", "123456");
		login.Sleep(250);
		*/
		booking.ClickMyBooking();
		booking.RefreshPage();
		booking.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Casey Huth')]]/..//span[text()[contains(.,'membership')]]"));
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Casey Huth')]]/..//span[text()[contains(.,'membership')]]"));
	}
	//@Test(priority = 3,groups={"sanity-group"})
	public void CheckoutUnlimited ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SelectService();
		booking.SelectUnlimited();
		booking.ClickApllay();
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		//Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Unlimited Styling')]]"));
		booking.BookStylist();
		booking.switchWindow();
		booking.FillFirstName("yinon");
		booking.FillLastName("aba");
		booking.SwitchToFrame(0);
		booking.FillCardNumber("4242424242424242");
		booking.FillCardDate("0222");
		booking.FillCardCVC("424");
		booking.Sleep(500);
		booking.switchWindow();
		booking.Sleep(200);
		booking.WaitElementDisplay(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]"));
		//BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		driver.findElement(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]")).click();
		booking.ClickBookingstylist();		

	}

	//@Test(priority = 4,groups={"sanity-group"})
	public void CheckoutByCreditCard ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.SearchStylist("Casey Huth");
		booking.SelectStylist();
		booking.BookStylist();
		booking.switchWindow();
		booking.FillFirstName("yinon");
		booking.FillLastName("aba");
		booking.SwitchToFrame(0);
		booking.FillCardNumber("4242424242424242");
		booking.FillCardDate("0222");
		booking.FillCardCVC("424");
		booking.Sleep(500);
		booking.switchWindow();
		booking.Sleep(200);
		booking.WaitElementDisplay(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]"));
		//BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		driver.findElement(By.xpath("(//div[text()[contains(.,'take your style quiz')]])[2]")).click();
		booking.ClickBookingstylist();	
		driver.close();
	}


}
