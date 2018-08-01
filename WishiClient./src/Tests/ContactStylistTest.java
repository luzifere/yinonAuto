package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.CeckOutPage;
import PageObjects.ChatPage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;
import PageObjects.SettingPage;


@Listeners(Tests.Listener.class)

public class ContactStylistTest extends BaseTest
{
	String textforchat ;
	@Test(priority = 1,groups={"sanity-group"})
	public void StylistSendToClient() throws MalformedURLException 
	{
		Random num = new Random();
		int number = 3560;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);
		textforchat = "test"+number;
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("2362wishitestftt@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(200);
		SearchPage search = new SearchPage(driver);
		search.ClickSearch();
		search.FillStylist("stylistt");
		search.SelectStylist("//*[@name='stylistt booking']");
		//driver.findElement(By.xpath("//*[@name='Meet Inon']")).click();
		ChatPage chat = new ChatPage(driver);
		chat.ClickContactIcon();
		chat.FillContactMessage(textforchat);
		chat.ClickSendContact();
		BaseTest.capabileties2();
		ChatPage chat1 = new ChatPage(driver);
		chat1.ClickLoginStart();
		chat1.LoginStylistApp("stylistt.booking@wishi.com", "123456");
		chat1.ClickLoginButton();
		chat1.Sleep(200);
		BasePage.AcceptAlert();
		//chat.CheckIfElementEnabled("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat1.Clickclose_menu4Button();
		chat1.OpenChat(textforchat);
		Assert.assertTrue(chat1.ChatDisplay(textforchat));
		BaseTest.capabileties();

	}
	@Test(priority = 2,groups={"sanity-group"})
	public void ClientToStylist() throws MalformedURLException 
	{
		//	BaseTest.capabileties();
		Random num = new Random();
		int number = 3560;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);
		textforchat = "test"+number;
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("2362wishitestftt@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(200);
		SearchPage search = new SearchPage(driver);
		search.ClickSearch();
		search.FillStylist("stylistt");
		search.SelectStylist("//*[@name='stylistt booking']");
		CeckOutPage co = new CeckOutPage(driver);
		//driver.findElement(By.xpath("//*[@name='Meet Inon']")).click();
		ChatPage chat = new ChatPage(driver);
		chat.scrollDownXpath();
		chat.scrollDownXpath();
		chat.scrollDownXpath();
		driver.findElement(By.xpath("//*[@name='ContactButtonID']")).click();
		//chat.ScrollToElement("//*[@name='ContactButtonID']");
		chat.FillContactMessage(textforchat);
		chat.ClickSendContact();
		BaseTest.capabileties2();
		ChatPage chat1 = new ChatPage(driver);
		chat1.ClickLoginStart();
		chat1.LoginStylistApp("stylistt.booking@wishi.com", "123456");
		chat1.ClickLoginButton();
		chat1.Sleep(200);
		BasePage.AcceptAlert();
		//chat.CheckIfElementEnabled("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat1.Clickclose_menu4Button();
		chat1.OpenChat(textforchat);
		Assert.assertTrue(chat1.ChatDisplay(textforchat));
	}
}
