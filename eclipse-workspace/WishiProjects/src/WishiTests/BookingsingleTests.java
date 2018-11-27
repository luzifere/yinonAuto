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
public class BookingsingleTests extends BaseTest 
{
	
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		Random num = new Random();
		int number = 356000000;
		for (int counter = 580000000; counter<=1000000000;counter++)
			number = num.nextInt(70000000);
		signup.ClickOnSignUpEmail();
		signup.doSignUp("wishites111@wishi.com" + number, "inon", "av", "ab1565");
		signup.WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		BestMatchPage best = new BestMatchPage(driver);
		best.ClickontinueButton();
		best.ClickFamle();
		best.FillAge("45");
		/*
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		*/
		best.ClickNextbutton();
		best.SelectNormal();
		best.SelectNormal2();
		best.WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
		best.SelectTags("Petite");
		best.ClickNextbutton();
		best.SelectInspiration("2");
		best.ClickNextbutton();
		best.Sleep(150);
		best.Selectbrands("2");
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'SEE MORE')]]"));
		//best.ClickMoreStylistsButton();
		BookingPage booking = new BookingPage(driver);
		booking.ClickBookingstylist();
	}	

	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		String stylistName = this.configFileReader.getStylistName();
		booking.SearchStylist(stylistName);
		booking.SelectStylist();
		//Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Per Session')]]"));
		//booking.BookStylist();
		booking.scrollDown();
		booking.SelectSingle();
		String copun = this.configFileReader.getcopun();
		booking.UseCodCoopon(copun);
		booking.ClickFinishCheckout();
		BookingPage.ExplicityWaitIsClickable(By.xpath("//div[@class='thank-u-btn']"));
		booking.ClickBookingstylist();
		/*
		ChatPage chat = new ChatPage(driver);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.doLogin("aya@wishi.me", "123456");
		login.Sleep(250);
		chat.RefreshPage();
		*/
		booking.ClickMyBooking();
		booking.RefreshPage();
		booking.WaitElementDisplay(By.xpath("//div[text()[contains(.,'Oren Oren')]]/..//span[text()[contains(.,'session')]]"));
		Assert.assertTrue(booking.ElementDisplay("//div[text()[contains(.,'Oren Oren')]]/..//span[text()[contains(.,'session')]]"));
		booking.Sleep(300);
		booking.close();
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
