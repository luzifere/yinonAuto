package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObejecs.ChatPage;
import PageObejecs.LoginPages;
import PageObejecs.LoginPages2;
public class ChatTests extends BaseTest
{
	String textforchat ;

	@Test(priority = 1,groups={"sanity-group"})
	   public void LoginAsStylist() 
		{
		LoginPages2 login = new LoginPages2(driver);
			login.ClickLoginButton();
			login.doLogin("clea+4@wishi.me", "Wishime1");

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
		chat.SelectUser("chat");
		chat.Sleep(100);
		chat.FillChat(textforchat);
		chat.SendChat();
		Assert.assertTrue(chat.ChatDisplay(textforchat));	
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
		LoginPages2 login = new LoginPages2(driver);
		login.ClickLoginButton();
		Assert.assertTrue(login.ElementDisplay("//div//input[@value='Log in']"));
		login.doLogin("chattest@wishi.me", "123456");
		login.Sleep(250);
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
		LoginPages2 login = new LoginPages2(driver);
		login.ClickLoginButton();
		login.doLogin("clea+4@wishi.me", "Wishime1");
		login.Sleep(300);
		chat.RefreshPage();
		Assert.assertTrue(chat.ChatDisplay(textforchat));
	}

}
