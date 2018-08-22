package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.ChatPage;
import PageObjects.LoginPage;

public class ChatTest extends BaseTest
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
		BaseTest.capabileties2();
		
		ChatPage chat = new ChatPage(driver);
		chat.ClickLoginStart();
		chat.LoginStylistApp("staylistchat@wishi.me", "123456");
		chat.ClickLoginButton();
		chat.Sleep(200);
		BasePage.AcceptAlert();
		//chat.CheckIfElementEnabled("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat.Clickclose_menu4Button();
		chat.SelectStylist("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat.FillMessage(textforchat);
		chat.ClickSendButton();
		Assert.assertTrue(chat.ChatDisplay(textforchat));
		BaseTest.capabileties();	
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("clientchat@wishi.me");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(200);
		ChatPage chat1 = new ChatPage(driver);
		chat1.ClickcChatTab();
		//driver.findElementByAccessibilityId("Chat").click();
		chat1.SelectStylist("//*[@name='Stylist Chat']");
		Assert.assertTrue(chat.ChatDisplay(textforchat));
		driver.resetApp();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void ClientToStylist() throws MalformedURLException 
	{
		Random num = new Random();
		int number = 3560;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);
		textforchat = "test"+number;
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("clientchat@wishi.me");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		ChatPage chat = new ChatPage(driver);
		chat.ClickcChatTab();
		//driver.findElementByAccessibilityId("Chat").click();
		chat.SelectStylist("//*[@name='Stylist Chat']");
		chat.FillMessageClient(textforchat);
		chat.ClickSendButtonClient();
		Assert.assertTrue(chat.ChatDisplay(textforchat));
		BaseTest.capabileties2();	
		ChatPage chat1 = new ChatPage(driver);
		chat.Sleep(250);
		chat1.ClickLoginStart();
		chat1.LoginStylistApp("staylistchat@wishi.me", "123456");
		chat1.ClickLoginButton();
		chat1.Sleep(200);
		BasePage.AcceptAlert();
		//chat1.CheckIfElementEnabled("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat1.Clickclose_menu4Button();
		chat1.SelectStylist("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		Assert.assertTrue(chat.ChatDisplay(textforchat));
		driver.closeApp();
	}
}
