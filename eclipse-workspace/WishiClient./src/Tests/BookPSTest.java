package Tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.BookingPage;
import PageObjects.CeckOutPage;
import PageObjects.ChatPage;
import PageObjects.LoginPage;
import PageObjects.QuizPage;
import PageObjects.SearchPage;
import PageObjects.SettingPage;




@Listeners(Tests.Listener.class)

public class BookPSTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinonvoice@wishitest.com");
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
		search.FillStylist("leo stylist");
		search.SelectStylist("//*[@name='leo stylist']");
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
		co.Sleep(100);
		co.ClickAddCode();
		co.FillCode("wishitest");
		co.Sleep(200);
		co.ClickDoneOfCode();
		co.ClickApplePayButton();
		co.ClickTakeYourStyleQwiz();

	}

	@Test(priority = 5,groups={"sanity-group"})
	public void CompileBooking()
	{
		QuizPage quiz = new QuizPage(driver);
		CeckOutPage co = new CeckOutPage(driver);
		QuizPage.DismissAlert();
		co.HowDidYouHearAboutUs("yinon");
		QuizPage.DismissAlert();
		quiz.ClickShowState();
		quiz.FillSearchCountry("israel");
		quiz.SelectCountry("//*[@name='Israel']");
		quiz.FillPhoneField("0523334567");
		quiz.ClickNextw();
		CeckOutPage.DismissAlert();
		//driver.resetApp();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void CreateStyle() throws IOException
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("LEOstylist@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.Sleep(250);
		//WebElement style = driver.findElement(By.xpath("(//*[@name='STYLE'])[1]"));
		//String styletext = style.getText();
		//System.out.println(styletext);
		booking.ClickStyleLook();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillLookDescription("style1");
		booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
		//driver.resetApp();
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void VerifyStyle1() throws IOException
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinonvoice@wishitest.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'style1')]"));
		chat.SelectStylist("//*[@name='leo stylist']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.scrollDownXpath();
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		//driver.resetApp();
		//driver.findElement(By.xpath("//*[@name='Love all your ideas!'][1]")).click();
		//booking.ClickLoveIteme();
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void CreateStyle2() throws IOException
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("LEOstylist@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.Sleep(250);
		//WebElement style = driver.findElement(By.xpath("(//*[@name='STYLE'])[1]"));
		//String styletext = style.getText();
		//System.out.println(styletext);
		booking.ClickStyleLook();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillLookDescription("style2");
		booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void VerifyStyle2() throws IOException
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinonvoice@wishitest.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'style2')]"));
		chat.SelectStylist("//*[@name='leo stylist']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.scrollDownXpath();
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		driver.resetApp();
		//driver.findElement(By.xpath("//*[@name='Love all your ideas!'][1]")).click();
		//booking.ClickLoveIteme();
	}
	@Test(priority = 10,groups={"sanity-group"})
	public void EndSession() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("LEOstylist@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.ClickEndSession();
		booking.ClickSendEndSessionStyle();
		driver.resetApp();
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void ClientEndSession() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinonvoice@wishitest.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.SelectStylist("//*[@name='leo stylist']");
		chat.Sleep(500);
		BookingPage booking = new BookingPage(driver);
		booking.scrollDownXpath();
		booking.scrollDownXpath();
		booking.scrollDownXpath();
		booking.ApproveEndSession();
		booking.RateStylist();
		booking.TipToStylist();
		driver.resetApp();
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void VerifyEndSession() throws IOException 
	{

		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("LEOstylist@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		ChatPage chat = new ChatPage(driver);
		booking.Sleep(200);
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'thanks for booking me, you were a pleasure to work with!')]"));
		driver.resetApp();


	}
}
