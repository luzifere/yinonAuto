package WishiTests;

import java.util.Random;

import javax.swing.LookAndFeel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.ChatPage;
import PageObject.CrateLookPage;
import PageObject.LoginPage;
@Listeners(WishiTests.Listener.class)
public class BookMiniSubTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginAsClient() 
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//header//div[@class='log-in']"));
		login.doLogin("newplan@wishitest.com", "123456");


	}
	@Test(priority = 2,groups={"sanity-group"})
	public void CheckOutSession ()
	{
		BookingPage booking = new BookingPage(driver);
		booking.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'view more stylists')]]"));
		booking.Sleep(200);
		booking.ClickBookingstylist();
		booking.SearchStylist("leo stylist");
		booking.SelectStylist();
		booking.SelectMini();
		booking.Switch_to_strype();
		booking.Sleep(250);
		String CardNumber = this.configFileReader.getCardNumber();
		booking.FillCardNumber(CardNumber);
		String CardDate = this.configFileReader.getCardDate();
		booking.FillCardDate(CardDate);
		String CardCVC = this.configFileReader.getCardCVC();
		booking.FillCardCVC(CardCVC);
		booking.Sleep(800);
		booking.switchWindow();
		booking.Sleep(200);
		booking.WaitElementDisplay(By.xpath("//div[text()[contains(.,'HEIGHT')]]"));
		ChatPage chat = new ChatPage(driver);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
	}

	@Test(priority = 3,groups={"sanity-group"})
	public void LoginAsStylist() 
	{
		LoginPage login = new LoginPage(driver);
		login.Sleep(200);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("LEOstylist@Automation.com", "123456");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickMyBooking();


	}
	@Test(priority = 4,groups={"sanity-group"})
	public void CreateMoodBoard ()
	{
		CrateLookPage look = new CrateLookPage(driver);
		look.WaitElementDisplay(By.xpath("(//button[@class='create-look-btn ng-scope cta-btn big'])[1]"));
		look.ClickCrateMoodBoard();
		look.ClickShop();
		look.Sleep(200);
		//look.SelectLayoutTabs("[2]");
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.Sleep(200);
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.Sleep(200);
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.Sleep(200);
		look.ClickSave();
		look.Sleep(350);
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).click();
		//CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//textarea[@id='TextArea']"));
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).sendKeys("test");
		//look.FillDescription("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		look.WaitElementDisplay(By.xpath("//button[@class='save ng-binding']"));
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		look.Sleep(250);
		ChatPage chat = new ChatPage(driver);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();

	}
	@Test(priority = 5,groups={"sanity-group"})
	public void VerifyMoodBoard() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("newplan@wishitest.com", "123456");
		ChatPage chat = new ChatPage(driver);
		chat.RefreshPage();
		chat.ClickMyBooking();
		driver.findElement(By.xpath("(//button[@class='create-look-btn'])[1]")).click();
		CrateLookPage look = new CrateLookPage(driver);
		look.ClickI_LOVE_IT();
		ChatPage chat1 = new ChatPage(driver);
		chat1.ClickOnProfileClientButton();
		chat1.ClickOnLogOut();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void CreatePS ()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("LEOstylist@Automation.com", "123456");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickMyBooking();
		CrateLookPage look = new CrateLookPage(driver);
		look.WaitElementDisplay(By.xpath("(//button[@class='create-look-btn ng-scope cta-btn big'])[1]"));
		look.ClickCrateMoodBoard();
		look.ClickShop();
		look.Sleep(200);
		look.SelectLayoutTabs("[2]");
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.Sleep(200);
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.Sleep(200);
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.Sleep(200);
		look.ClickSave();
		look.Sleep(350);
		driver.findElement(By.xpath("//div//textarea[@placeholder='Tell your client why you chose those items']")).click();
		//CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//textarea[@id='TextArea']"));
		driver.findElement(By.xpath("//div//textarea[@placeholder='Tell your client why you chose those items']")).sendKeys("test");
		//look.FillDescription("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		look.Sleep(250);
		ChatPage chat = new ChatPage(driver);
		chat.Sleep(200);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
		chat.Sleep(200);
		chat.RefreshPage();
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void AskRevise() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("newplan@wishitest.com", "123456");
		CrateLookPage look = new CrateLookPage(driver);
		ChatPage chat = new ChatPage(driver);
		chat.RefreshPage();
		chat.ClickMyBooking();
		driver.findElement(By.xpath("(//button[@class='create-look-btn'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='autoreply-wrapper']//div[text()[contains(.,'Great! Could you please pick one?')]])[1]")).click();
		//look.ClickI_LOVE_IT_LOOK();
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void CreateLook1 ()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("LEOstylist@Automation.com", "123456");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickMyBooking();
		CrateLookPage look = new CrateLookPage(driver);
		look.WaitElementDisplay(By.xpath("(//button[@class='create-look-btn ng-scope cta-btn big'])[1]"));
		look.ClickCrateMoodBoard();
		look.ClickShop();
		look.Sleep(200);
		look.SelectLayoutTabs("[2]");
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.Sleep(200);
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.Sleep(200);
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.Sleep(200);
		look.ClickSave();
		look.Sleep(350);
		driver.findElement(By.xpath("//div//textarea[@placeholder='Tell your client why you chose those items']")).click();
		//CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//textarea[@id='TextArea']"));
		driver.findElement(By.xpath("//div//textarea[@placeholder='Tell your client why you chose those items']")).sendKeys("test");
		//look.FillDescription("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		look.Sleep(250);
		ChatPage chat = new ChatPage(driver);
		chat.Sleep(200);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
		chat.Sleep(200);
		chat.RefreshPage();
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void VerifyLook1() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("newplan@wishitest.com", "123456");
		CrateLookPage look = new CrateLookPage(driver);
		ChatPage chat = new ChatPage(driver);
		chat.RefreshPage();
		chat.ClickMyBooking();
		driver.findElement(By.xpath("(//button[@class='create-look-btn'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='autoreply-wrapper']//div[text()[contains(.,'Thanks, I found what I was looking for!')]])[1]")).click();
		//look.ClickI_LOVE_IT_LOOK();
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
	}
	//@Test(priority = 10,groups={"sanity-group"})
	public void CreateMoodBoard2 ()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("LEOstylist@Automation.com", "123456");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickMyBooking();
		CrateLookPage look = new CrateLookPage(driver);
		look.WaitElementDisplay(By.xpath("(//button[@class='create-look-btn ng-scope cta-btn big'])[1]"));
		look.ClickCrateMoodBoard();
		look.ClickShop();
		look.Sleep(200);
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.Sleep(200);
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.Sleep(200);
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.Sleep(200);
		look.ClickSave();
		look.Sleep(350);
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).click();
		//CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//textarea[@id='TextArea']"));
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).sendKeys("test");
		//look.FillDescription("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		look.Sleep(250);
		ChatPage chat = new ChatPage(driver);
		look.Sleep(200);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();


	}
	//@Test(priority = 11,groups={"sanity-group"})
	public void VerifyMoodBoard2() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("newplan@wishitest.com", "123456");
		ChatPage chat = new ChatPage(driver);
		chat.RefreshPage();
		chat.ClickMyBooking();
		driver.findElement(By.xpath("(//button[@class='create-look-btn'])[1]")).click();
		CrateLookPage look = new CrateLookPage(driver);
		look.ClickI_LOVE_IT();
		ChatPage chat1 = new ChatPage(driver);
		chat1.ClickOnProfileClientButton();
		chat1.ClickOnLogOut();
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void CreateLook2 ()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("LEOstylist@Automation.com", "123456");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickMyBooking();
		CrateLookPage look = new CrateLookPage(driver);
		look.WaitElementDisplay(By.xpath("(//button[@class='create-look-btn ng-scope cta-btn big'])[1]"));
		look.ClickCrateMoodBoard();
		look.ClickShop();
		look.Sleep(200);
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.Sleep(200);
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.Sleep(200);
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.Sleep(200);
		look.ClickSave();
		look.Sleep(350);
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).click();
		//CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//textarea[@id='TextArea']"));
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).sendKeys("test");
		//look.FillDescription("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		look.Sleep(250);
		ChatPage chat = new ChatPage(driver);
		chat.Sleep(200);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();

	}
	@Test(priority = 13,groups={"sanity-group"})
	public void VerifyLook2() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("newplan@wishitest.com", "123456");
		CrateLookPage look = new CrateLookPage(driver);
		ChatPage chat = new ChatPage(driver);
		chat.RefreshPage();
		chat.ClickMyBooking();
		driver.findElement(By.xpath("(//button[@class='create-look-btn'])[1]")).click();
		look.ClickI_LOVE_IT_LOOK();
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
	}
	@Test(priority = 22,groups={"sanity-group"})
	public void AskEndSession ()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("LEOstylist@Automation.com", "123456");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickMyBooking();
		CrateLookPage look = new CrateLookPage(driver);
		booking.WaitElementDisplay(By.xpath("(//button[text()[contains(.,'End Session')]])[1]"));
		look.ClickEndSeesionButton();
		look.WaitElementDisplay(By.xpath("//button[text()[contains(.,'Send')]]"));
		look.ClickSendEndSeesionButton();
		look.Sleep(200);
		ChatPage chat = new ChatPage(driver);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
	}
	@Test(priority = 23,groups={"sanity-group"})
	public void ClientEndSession() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("newplan@wishitest.com", "123456");
		CrateLookPage look = new CrateLookPage(driver);
		ChatPage chat = new ChatPage(driver);
		chat.RefreshPage();
		chat.ClickMyBooking();
		driver.findElement(By.xpath("(//button[@class='create-look-btn'])[1]")).click();
		chat.RefreshPage();
		look.ClickApproveEndSeesionButton();
		look.switchWindow();
		driver.findElement(By.xpath("//label[@for='sr4']")).click();
		look.Sleep(200);
		look.ClickSendRate();
		look.Sleep(200);
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
	}
	@Test(priority = 24,groups={"sanity-group"})
	public void VerifyEndSession ()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div//input[@value='Log in']"));
		login.doLogin("LEOstylist@Automation.com", "123456");
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(200);
		booking.ClickMyBooking();
		Assert.assertTrue(booking.ElementDisplay("(//p[text()[contains(.,'thanks for booking me, you were a pleasure to work with!')]])[1]"));
		driver.quit();
	}
	//@Test(priority = 88,groups={"sanity-group"})
	public void PersonalShopping ()
	{
		CrateLookPage look = new CrateLookPage(driver);
		look.ClickNewLook();
		look.ClickShop();
		look.Sleep(200);
		look.SelectLayoutTabs("[2]");
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.Sleep(200);
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.Sleep(200);
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.Sleep(200);
		look.ClickSave();
		look.ClickSaveOfDescription();
		look.ClickDescriptionPS();
		look.FillDescriptionPS("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		look.WaitElementDisplay(By.xpath("(//p[text()[contains(.,'Session Ended, payment sent')]])[1]"));
		Assert.assertTrue(look.ElementDisplay("(//p[text()[contains(.,'Session Ended, payment sent')]])[1]"));
		look.Sleep(300);
		look.close();

	}




}
