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

public class ReviseThirdLookTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
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
		search.FillStylist("stylistt book");
		search.Sleep(200);
		search.SelectStylist("//*[@name='stylistt book']");
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
		CeckOutPage co = new CeckOutPage(driver);
		QuizPage.DismissAlert();
		co.HowDidYouHearAboutUs("yinon");
		quiz.Sleep(100);
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
		quiz.scrollDownXpath();
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
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.ClickCreateMoodBoardButton();
		//driver.findElement(By.id("Got It")).click();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.AddMoodBord();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.scrollDownXpath();
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		/*
		quiz.SelectCategory("shorts_new");
		quiz.scrollDownXpath();
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("pants_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		*/
		booking.ClickSave();
		booking.FillDescription("moodboard1");
		//booking.ClickToolBarDone();
		booking.ClickSendMoodBoard();
		//BasePage.AcceptAlert();
		driver.resetApp();
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void VerifyMoodBoard() throws IOException
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'moodboard1')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoveItem();
		//driver.resetApp();
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
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.ClickCreateLook();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.AddLooks();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.scrollDownXpath();
		quiz.scrollDownXpath();
		quiz.scrollDownXpath();
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts_new");
		quiz.scrollDownXpath();
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillLookDescription("look1");
		//booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void VerifyCreateLook() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
	//	login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'look1')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		//driver.resetApp();	

	}
	/*
	@Test(priority = 10,groups={"sanity-group"})
	public void CreateMoodBoard2() throws IOException 
	{
		BaseTest.capabileties2();
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateMoodBoardButton();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillDescription("moodboard2");
		//booking.ClickToolBarDone();
		booking.ClickSendMoodBoard();
		driver.resetApp();
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void VerifyMoodBoard2() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'moodboard2')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveItem();
		//driver.resetApp();
	}
	*/
	@Test(priority = 12,groups={"sanity-group"})
	public void CreateLook2() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.ClickCreateLook();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.AddLooks();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.scrollDownXpath();
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		/*
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		*/
		booking.ClickSave();
		booking.FillLookDescription("look2");
		//booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void AskRevise1() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		//Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'look2')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(150);
		booking.scrollDownXpath();
		booking.ClickReviseLookClient();
		booking.scrollDownXpath();
		booking.SelectImageForRevise();
		booking.scrollDownXpath();
		booking.ClickSendReviseClient();
		//driver.resetApp();	

	}
	@Test(priority = 14,groups={"sanity-group"})
	public void CreateReviseLook1() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.ClickReviseLookStylist();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.Sleep(200);
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectCategory("pants_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		booking.Sleep(200);
		quiz.SelectCategory("shoes_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		booking.Sleep(200);
		quiz.SelectCategory("dresses_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		booking.Sleep(200);
		booking.ClickSave();
		booking.FillLookDescription("revise2");
		//booking.ClickToolBarDone();
		booking.ClickReviseLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 15,groups={"sanity-group"})
	public void VerifyCreateLookrevise1() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'revise2')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		//driver.resetApp();
		//BaseTest.capabileties2();	

	}
	/*
	@Test(priority = 16,groups={"sanity-group"})
	public void CreateMoodBoard3() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Clickclose_menu4Button();
		booking.ClickCreateMoodBoardButton();
		driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillDescription("moodboard3");
		//booking.ClickToolBarDone();
		booking.ClickSendMoodBoard();
		driver.resetApp();
	}
	@Test(priority = 17,groups={"sanity-group"})
	public void VerifyMoodBoard3() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'moodboard3')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveItem();
		//driver.resetApp();
	}
	*/
	@Test(priority = 18,groups={"sanity-group"})
	public void CreateLook3() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.ClickCreateLook();
		//driver.findElement(By.id("Got It")).click();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("jackets_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		booking.FillLookDescription("look3");
		//booking.ClickToolBarDone();
		booking.ClickLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 19,groups={"sanity-group"})
	public void VerifyCreateLook3() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'look3')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		driver.resetApp();
		//BaseTest.capabileties2();	
		//driver.resetApp();	

	}
	//@Test(priority = 20,groups={"sanity-group"})
	public void ReviseLook() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Sleep(200);
	//	booking.Clickclose_menu4Button();
		booking.Sleep(200);
		booking.ClickReviseLookStylist();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.Sleep(200);
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectCategory("pants_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		booking.Sleep(200);
		quiz.SelectCategory("shoes_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("accessories_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		
		booking.Sleep(200);
		booking.ClickSave();
		//driver.findElement(By.xpath("//*[@name='Add an event']")).click();
		//driver.findElement(By.xpath("//*[@name='Party']")).click();
		booking.FillLookDescription("revise1");
		//booking.ClickToolBarDone();
		booking.ClickReviseLookSaveButton();
		driver.resetApp();
	}
	//@Test(priority = 21,groups={"sanity-group"})
	public void VerifyCreateRevise1() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'revise1')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		driver.resetApp();
		//BaseTest.capabileties2();	

	}
	@Test(priority = 22,groups={"sanity-group"})
	public void ReviseLook2() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		booking.Sleep(200);
		booking.ClickReviseLookStylist();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='Amazing!']")).click();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.ClickShop();
		booking.Sleep(200);
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectImage3(110,210);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		quiz.Sleep(250);
		quiz.SelectCategory("pants_new");
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		quiz.SelectCategory("bags_new");
		quiz.SelectImage3(110,200);
		quiz.SelectImage3(150,250);
		booking.ClickSave();
		//driver.findElement(By.xpath("//*[@name='Add an event']")).click();
		//driver.findElement(By.xpath("//*[@name='Party']")).click();
		booking.FillLookDescription("revise2");
		//booking.ClickToolBarDone();
		booking.ClickReviseLookSaveButton();
		driver.resetApp();
	}
	@Test(priority = 23,groups={"sanity-group"})
	public void VerifyCreateRevise2() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'revise2')]"));
		chat.SelectStylist("//*[@name='stylistt book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(350);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		driver.resetApp();
		BaseTest.capabileties2();	

	}
	@Test(priority = 24,groups={"sanity-group"})
	public void EndSession() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(200);
		BasePage.AcceptAlert();
	//	booking.Clickclose_menu4Button();
		booking.ClickEndSession();
		booking.ClickSendEndSession();
		driver.resetApp();
	}
	@Test(priority = 25,groups={"sanity-group"})
	public void ClientEndSession() throws IOException 
	{
		BaseTest.capabileties();
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("yinontesting@Automation.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(500);
		LoginPage.DismissAlert();
		login.Sleep(500);
		//login.SelectImage3(250,450);
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='stylistt book']"));
		chat.SelectStylist("//*[@name='stylistt book']");
		chat.Sleep(500);
		BookingPage booking = new BookingPage(driver);
		booking.scrollDownXpath();
		booking.ApproveEndSession();
		booking.RateStylist();
		booking.TipToStylist();
		driver.resetApp();
	}
	@Test(priority = 26,groups={"sanity-group"})
	public void VerifyEndSession() throws IOException 
	{

		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(250);
		driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
		booking.Sleep(250);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		ChatPage chat = new ChatPage(driver);
		booking.Sleep(250);
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'Payment Sent')]"));
		driver.resetApp();


	}
}
