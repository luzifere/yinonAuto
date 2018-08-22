package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ChatPage;
import PageObjects.LoginPage;


public class ChatTest extends BaseTest
{
	String textforchat ;
	
	@Test(priority = 1,groups={"sanity-group"})
	public void FillPasswordWithOutToFillEmail() 
	{
		LoginPage login = new LoginPage(driver);
		login.Sleep(150);
		LoginPage.ExplicityWaitIsClickable(By.xpath("//div//p[text()[contains(.,'Log In')]]"));
		login.doLogin("staylistchat@wishi.me", "123456");
		login.Clickloginbuttonn();
	}

	@Test(priority = 2,groups={"sanity-group"})
	public void SendChatToclient ()
	{	
		Random num = new Random();
		int number = 356;
		for (int counter = 58; counter<=100000;counter++)
			number = num.nextInt(70);
		textforchat = "test for yinon"+number;
		ChatPage chat = new ChatPage(driver);
		chat.Sleep(150);
		chat.SelectUser("Client");
		chat.Sleep(100);
		chat.FillChat(textforchat);
		chat.SendChat();
		Assert.assertTrue(chat.ChatDisplay(textforchat));	
		chat.Sleep(200);
		//driver.findElement(By.xpath("(//nav//div//img)[1]")).click();
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
		LoginPage login1 = new LoginPage(driver);
		login1.ClickLoginButton();
		Assert.assertTrue(login1.ElementDisplay("//div//input[@value='Log in']"));
		login1.doLogin("clientchat@wishi.me", "123456");
		login1.Sleep(250);
		chat.RefreshPage();
		Assert.assertTrue(chat.ChatDisplay(textforchat));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void SendChatToStylist ()
	{
		Random num = new Random();
		int number = 356;
		for (int counter = 58; counter<=100000;counter++)
			number = num.nextInt(70);
		textforchat = "test for casy"+number;
		ChatPage chat = new ChatPage(driver);
		chat.FillChat(textforchat);
		chat.SendChat();
		Assert.assertTrue(chat.ChatDisplay(textforchat));	
		chat.Sleep(500);
		chat.ClickOnProfileButton2();
		chat.ClickOnLogOut();
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.doLogin("staylistchat@wishi.me", "123456");
		login.Sleep(300);
		chat.RefreshPage();
		chat.Sleep(200);
		Assert.assertTrue(chat.ChatDisplay(textforchat));
	}
}
