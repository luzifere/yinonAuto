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

public class BookMiniMonthlyFSTest extends BaseTest
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
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void SearchStylist() 
	{
		SearchPage search = new SearchPage(driver);

		search.ClickSearch();
		search.FillStylist("stylistt book");
		search.Sleep(200);
		search.SelectStylist("//*[@name='Stylistt Book']");
	}	
	@Test(priority = 3,groups={"sanity-group"})
	public void SelectPlan() 
	{
		CeckOutPage co = new CeckOutPage(driver);
		co.ClickSelectStylist();
		co.SelectMiniPlan();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void SelectSession()
	{
		CeckOutPage co = new CeckOutPage(driver);
		co.ClickMonthButton();
		//co.ClickSingleButton();
		//co.ClickMonthButton();
		co.Sleep(100);
		co.scrollDownXpath();
		co.ClickPayWithCreditCard();
		co.ClickCompileBooking();

	}
	//@Test(priority = 5,groups={"sanity-group"})
	public void CompileBooking()
	{
		CeckOutPage co = new CeckOutPage(driver);
		//co.Fillemail("jhgjhg@fgcgf.jg");
		String CardNumber = this.configFileReader.getCardNumber();
		co.Fillnumbercard(CardNumber);
		//co.Fillnumbercard("4242424242424242424242");
		co.ClickCompileBooking();
		/*
		co.ClickTakeYourStyleQwiz();
		QuizPage quiz = new QuizPage(driver);
		QuizPage.DismissAlert();
		co.HowDidYouHearAboutUs("yinon");
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
		*/
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
		//booking .ClickCloseOBButton();

		booking.Sleep(200);
		BasePage.AcceptAlert();

		booking.ClickCreateMoodBoardButton();

		booking.ClickGoItButton();

		booking.Sleep(200);
		booking.AddMoodBord();
		booking.ClickSave();
		booking.Sleep(200);
		driver.findElement(By.id("OKButtonID")).click();
		booking.FillDescription("moodboard1");
		//booking.ClickToolBarDone();
		booking.ClickSendMoodBoard();
		//BasePage.AcceptAlert();
		//driver.resetApp();
		driver.removeApp("com.Wishi.Wishi-Stylist");
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

		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='Stylistt Book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'moodboard1')]"));
		chat.SelectStylist("//*[@name='Stylistt Book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoveItem();

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
		//booking .ClickCloseOBButton();

		BasePage.AcceptAlert();

		booking.ClickCreateLook();

		booking.Sleep(200);

		booking.Sleep(200);
		booking.Clickclose_menu4Button();

		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		
		booking.SelectItem("1");
		booking.SelectItem("2");
		quiz.SelectCategory("shorts_new");
		quiz.scrollDownXpath();
		quiz.Sleep(250);
		booking.SelectItem("1");
		booking.ClickSave();
		booking.FillLookDescription("look1");
		
		booking.ClickLookSaveButton();
		driver.removeApp("com.Wishi.Wishi-Stylist");
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void AsaRevise1() throws IOException 
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
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='Stylistt Book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'look1')]"));
		chat.SelectStylist("//*[@name='Stylistt Book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(150);
		booking.ClickMessageCounter();
		booking.ClickReviseLookClient();
		booking.ClickMessageCounter();
		booking.SelectImageForRevise();
		booking.scrollDownXpath();
		booking.ClickSendReviseClient();


	}
	@Test(priority = 10,groups={"sanity-group"})
	public void CreateReviseLook1() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		//booking .ClickCloseOBButton();

		booking.Sleep(200);
		BasePage.AcceptAlert();

		booking.ClickReviseLookStylist();

		booking.Sleep(200);

		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.Sleep(200);
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.SelectCategory("pants_new");
		quiz.Sleep(250);
		booking.scrollDownXpath();
		booking.scrollDownXpath();
		booking.SelectItem("1");
		//booking.SelectItem("2");
		booking.Sleep(200);
		quiz.SelectCategory("shoes_new");
		quiz.Sleep(250);
		booking.SelectItem("1");
		booking.Sleep(200);
		quiz.SelectCategory("dresses_new");
		quiz.Sleep(250);
		booking.SelectItem("1");
		booking.Sleep(200);
		booking.ClickSave();
		booking.FillLookDescription("revise1");
		
		booking.ClickReviseLookSaveButton();
		driver.removeApp("com.Wishi.Wishi-Stylist");
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void VerifyCreateLookrevise1() throws IOException 
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

		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='Stylistt Book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'revise1')]"));
		chat.SelectStylist("//*[@name='Stylistt Book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();


	}

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
		//booking .ClickCloseOBButton();

		booking.Sleep(200);
		BasePage.AcceptAlert();

		booking.ClickCreateLook();

		booking.Sleep(200);

		booking.Sleep(200);
		booking.Clickclose_menu4Button();

		booking.ReplaceToEmptyCanvas();
		booking.ClickShop();
		booking.ClickUpArrow();
		QuizPage quiz = new QuizPage(driver);
		quiz.scrollDownXpath();
		booking.SelectItem("1");
		booking.SelectItem("2");		
		quiz.SelectCategory("shorts_new");
		quiz.Sleep(250);
		booking.SelectItem("1");
		
		booking.ClickSave();
		booking.FillLookDescription("look2");
		
		booking.ClickLookSaveButton();
		driver.removeApp("com.Wishi.Wishi-Stylist");
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void VerifiedLook2() throws IOException 
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

		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='Stylistt Book']"));

		chat.SelectStylist("//*[@name='Stylistt Book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
	}
	
	@Test(priority = 14,groups={"sanity-group"})
	public void ReviseLook2() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.ClickLoginButton();
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.Sleep(200);
		booking.ClickReviseLookStylist();
		booking.Sleep(200);
		booking.Clickclose_menu4Button();
		booking.AddLooks();
		booking.ClickSave();
		driver.findElement(By.id("OKButtonID")).click();
		booking.FillLookDescription("revise2");
		booking.ClickReviseLookSaveButton();
		driver.removeApp("com.Wishi.Wishi-Stylist");
	}
	@Test(priority = 15,groups={"sanity-group"})
	public void VerifyCreateRevise2() throws IOException 
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
		chat.WaitElementDisplay(By.xpath("//*[@name='Stylistt Book']"));
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'revise2')]"));
		chat.SelectStylist("//*[@name='Stylistt Book']");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(350);
		booking.scrollDownXpath();
		booking.ClickLoveOutfit();
		driver.resetApp();
		BaseTest.capabileties2();	

	}
	@Test(priority = 16,groups={"sanity-group"})
	public void EndSession() throws IOException 
	{
		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(200);
		//booking .ClickCloseOBButton();		
		booking.Sleep(200);
		BasePage.AcceptAlert();
		booking.ClickEndSession();
		booking.ClickSendEndSession();
		//driver.resetApp();
		driver.removeApp("com.Wishi.Wishi-Stylist");
	}
	@Test(priority = 17,groups={"sanity-group"})
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
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		chat.WaitElementDisplay(By.xpath("//*[@name='Stylistt Book']"));
		chat.SelectStylist("//*[@name='Stylistt Book']");
		BookingPage booking = new BookingPage(driver);
		booking.ClickMessageCounter();
		booking.scrollDownXpath();
		chat.Sleep(500);
		booking.ApproveEndSession();
		booking.RateStylist();
		booking.TipToStylist();
		driver.resetApp();
	}
	@Test(priority = 18,groups={"sanity-group"})
	public void VerifyEndSession() throws IOException 
	{

		BaseTest.capabileties2();	
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("stylistt.book@wishitest.com", "123456");
		booking.ClickLoginButton();
		booking.Sleep(250);
		//booking .ClickCloseOBButton();
		booking.Sleep(250);
		BasePage.AcceptAlert();
		//booking.Clickclose_menu4Button();
		ChatPage chat = new ChatPage(driver);
		booking.Sleep(250);
		Assert.assertTrue(chat.ElementDisplay("//*[contains(@name, 'Payment Sent')]"));
		//driver.resetApp();
		driver.removeApp("com.Wishi.Wishi-Stylist");


	}
}
