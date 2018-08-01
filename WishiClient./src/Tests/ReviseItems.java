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

public class ReviseItems extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
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
		search.FillStylist("Stylist Booking");
		search.SelectStylist("//*[@name='stylist booking']");
	}	
	@Test(priority = 3,groups={"sanity-group"})
	public void SelectEvents() 
	{
		CeckOutPage co = new CeckOutPage(driver);
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
		co.Sleep(200);
		co.ClickDoneOfCode();
		co.ClickApplePayButton();
		co.ClickTakeYourStyleQwiz();

	}

	@Test(priority = 5,groups={"sanity-group"})
	public void CompileBooking()
	{
		QuizPage quiz = new QuizPage(driver);
		QuizPage.DismissAlert();
		quiz.ClickShowState();
		quiz.FillSearchCountry("israel");
		quiz.SelectCountry("//*[@name='Israel']");
		quiz.FillPhoneField("0523334567");
		quiz.ClickNextw();
		quiz.Sleep(250);
		quiz.ClickNOtNow();
		quiz.SelectTab("Loose");
		quiz.ClickNextw();
		quiz.SelectTab("Oversized");
		quiz.ClickNextw();
		quiz.SelectJeans("Skinny");
		quiz.ClickNextw();
		quiz.SelectCC("Tops");
		quiz.SelectCC("Hats");
		quiz.ClickNextw();
		quiz.Sleep(200);
		CeckOutPage.DismissAlert();
		//Assert.assertTrue(quiz.ElementDisplay("//*[@name='Session with Oren Oren']"));
		driver.resetApp();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void CreateMoodBoard() throws IOException
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateMoodBoardButton();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillDescription("moodboard1");
		booking.ClickToolBarDone();
		booking.ClickSendMoodBoard();
		driver.resetApp();
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void VerifyMoodBoard() throws IOException
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'moodboard1')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveItem();
		driver.resetApp();
		//driver.findElement(By.xpath("//*[@name='Love all your ideas!'][1]")).click();
		//booking.ClickLoveIteme();
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void CreateLook() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateLook();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillLookDescription("look1");
		booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void AskReviseLook() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'look1')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.ClickReviseLookClient();
		booking.SelectImageForRevise();
		booking.scrollDownXpath();
		booking.ClickSendReviseClient();
		driver.resetApp();	

	}
	@Test(priority = 10,groups={"sanity-group"})
	public void CreateReviseLook() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickReviseLookStylist();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.Sleep(200);
		/*
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.Sleep(250);
		quiz.SelectCategory("pants");
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		*/
		booking.ClickSave();
		booking.FillLookDescription("revise1");
		booking.ClickToolBarDone();
		booking.ClickReviseLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void VerifyCreateLook() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
	//	login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'revise1')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		driver.resetApp();
		BaseTest.capabileties2();	

	}
	@Test(priority = 12,groups={"sanity-group"})
	public void CreateMoodBoard2() throws IOException 
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateMoodBoardButton();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillDescription("moodboard2");
		booking.ClickToolBarDone();
		booking.ClickSendMoodBoard();
		driver.resetApp();
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void VerifyMoodBoard2() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'moodboard2')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveItem();
		driver.resetApp();
	}
	@Test(priority = 14,groups={"sanity-group"})
	public void CreateLook2() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateLook();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillLookDescription("look2");
		booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 15,groups={"sanity-group"})
	public void VerifyCreateLook2() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'look2')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.ClickReviseLookClient();
		booking.SelectImageForRevise();
		booking.scrollDownXpath();
		booking.ClickSendReviseClient();
		driver.resetApp();
		BaseTest.capabileties2();	

	}
	@Test(priority = 16,groups={"sanity-group"})
	public void CreateReviseLook2() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickReviseLookStylist();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.Sleep(200);
		/*
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.Sleep(250);
		quiz.SelectCategory("pants");
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		*/
		booking.ClickSave();
		booking.FillLookDescription("revise2");
		booking.ClickToolBarDone();
		booking.ClickReviseLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 17,groups={"sanity-group"})
	public void VerifyCreateLookrevise2() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'revise2')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		driver.resetApp();
		//BaseTest.capabileties2();	

	}
	/*
	@Test(priority = 18,groups={"sanity-group"})
	public void CreateMoodBoard3() throws IOException 
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateMoodBoardButton();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillDescription("moodboard3");
		booking.ClickToolBarDone();
		booking.ClickSendMoodBoard();
		driver.resetApp();
	}
	@Test(priority = 17,groups={"sanity-group"})
	public void VerifyMoodBoard3() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'moodboard3')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoveItem();
		driver.resetApp();
	}
	@Test(priority = 18,groups={"sanity-group"})
	public void CreateLook3() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateLook();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts");
		quiz.Sleep(250);
		quiz.SelectImage3(100,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillLookDescription("look3");
		booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 19,groups={"sanity-group"})
	public void VerifyCreateLook3() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'look3')]"));
		chat.SelectStylist("//*[@name='stylist booking']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoveOutfit();
		driver.resetApp();	

	}
	@Test(priority = 20,groups={"sanity-group"})
	public void EndSession() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickEndSession();
		booking.ClickSendEndSession();
		driver.resetApp();
	}
	@Test(priority = 21,groups={"sanity-group"})
	public void ClientEndSession() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("client110@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.SelectStylist("//*[@name='stylist booking']");
		chat.Sleep(500);
		BookingPage booking = new BookingPage(driver);
		booking.ApproveEndSession();
		booking.RateStylist();
		booking.ClickSubmit();
		driver.resetApp();
	}
	@Test(priority = 22,groups={"sanity-group"})
	public void VerifyEndSession() throws IOException 
	{

		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylist.booking@wishi.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='close_menu7']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		ChatPage chat = new ChatPage(driver);
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'Session Ended, payment sent')]"));

	}
	*/
}
