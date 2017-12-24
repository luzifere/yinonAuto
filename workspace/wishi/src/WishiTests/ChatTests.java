package WishiTests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.ChatPage;
import PageObject.CrateLookPage;
import PageObject.LoginPage;

public class ChatTests extends BaseTest
{
	String textforchat ;

	@Test(priority = 1,groups={"sanity-group"})
	   public void LoginAsStylist() 
		{
			LoginPage login = new LoginPage(driver);
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
		chat.ClickMyBooking();
		chat.SelectUser("chat test");
		chat.Sleep(100);
		chat.FillChat(textforchat);
		chat.SendChat();
		Assert.assertTrue(chat.ChatDisplay(textforchat));	
		chat.ClickOnProfileButton();
		chat.ClickOnLogOut();
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		Assert.assertTrue(login.ElementDisplay("//div//input[@value='Log in']"));
		login.doLogin("chattest@wishi.me", "123456");
		login.Sleep(250);
		chat.RefreshPage();
		chat.ClickMyBooking();
		chat.SelectUser("Casey Huth");
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
		ChatPage.ExplicityWaitIsClickable(By.xpath("//div//button//span[@class='ng-scope']"));
		chat.ClickMyBooking();
		chat.SelectUser("Casey Huth");
		chat.Sleep(100);
		chat.FillChat(textforchat);
		chat.SendChat();
		Assert.assertTrue(chat.ChatDisplay(textforchat));	
		chat.ClickMyBooking();
		chat.ClickOnProfileClientButton();
		chat.ClickOnLogOut();
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.doLogin("clea+4@wishi.me", "Wishime1");
		login.Sleep(250);
		chat.RefreshPage();
		chat.SelectUser("chat test");
		ChatPage.ExplicityWaitIsClickable(By.xpath("//div//button//span[@class='ng-scope']"));
		Assert.assertTrue(chat.ChatDisplay(textforchat));
	}


}

