package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.ChatPage;
import PageObjects.LoginPage;
import PageObjects.SettingPage;


@Listeners(Tests.Listener.class)

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
		chat.LoginStylistApp("staylistchat@wishi.com", "123456");
		chat.ClickLoginButton();
		chat.Sleep(200);
		BasePage.AcceptAlert();
		//chat.CheckIfElementEnabled("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat.Clickclose_menu4Button();
		chat.ClickChatButton();
		//chat.SelectStylist("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat.FillMessage(textforchat);
		System.out.println(textforchat);
		chat.ClickSendButton();
		Assert.assertTrue(chat.ChatDisplay(textforchat));
		BaseTest.capabileties();	
		LoginPage login = new LoginPage(driver);
		login.Clickloginbutton1();
		login.Fillusername("clientchat@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(200);
		ChatPage chat1 = new ChatPage(driver);
		//chat1.SelectImage2(250,450);
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
		login.Fillusername("clientchat@wishi.com");
		login.Fillpassword("123456");
		login.ClickLoginButton2();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		login.Sleep(100);
		LoginPage.AcceptAlert();
		//login.SelectImage2(250,450);
		SettingPage setting = new SettingPage(driver);
		setting.ClickMeTab();
		ChatPage chat = new ChatPage(driver);
		//driver.findElement(By.xpath("//*[@name='Me']"));
		//driver.findElement(By.xpath("//*[@name='Chat']"));
		chat.ClickcChatTab();
		//driver.findElementByAccessibilityId("Chat").click();
		chat.SelectStylist("//*[@name='Stylist Chat']");
		chat.FillMessageClient(textforchat);
		System.out.println(textforchat);
		chat.ClickSendButtonClient();
		Assert.assertTrue(chat.ChatDisplay(textforchat));
		BaseTest.capabileties2();	
		ChatPage chat1 = new ChatPage(driver);
		chat.Sleep(250);
		chat1.ClickLoginStart();
		chat1.LoginStylistApp("staylistchat@wishi.com", "123456");
		chat1.ClickLoginButton();
		chat1.Sleep(200);
		BasePage.AcceptAlert();
		//chat1.CheckIfElementEnabled("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		chat1.Clickclose_menu4Button();
		chat1.ClickChatButton();
		//chat1.SelectStylist("(//XCUIElementTypeCell[@name=\"0\"])[2]//*[@name='Client⎜Session, Paid $20']");
		Assert.assertTrue(chat.ChatDisplay(textforchat));
		driver.resetApp();
	}
}
