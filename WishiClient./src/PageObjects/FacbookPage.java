package PageObjects;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class FacbookPage extends BasePage {

	public FacbookPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
	}

	String handle;
	@FindBy(xpath="//*[@name='facebookButton']")
	WebElement ConnectWithFacbook;
	@FindBy(xpath="//div//input[@id='m_login_email']")
	WebElement UserOfFacbook;
	@FindBy(xpath="//div//input[@id='m_login_password']")
	WebElement PassOfFacbook;
	@FindBy(xpath="//div//button[@name='login']")
	WebElement LoginButtonOfFacbook;
	@FindBy(xpath="//button[@name='__CONFIRM__']")
	WebElement ConfirmButton;

	public void DoLoginWithFacbook () 
	{
		ContextToWebView();
		filltextclear(UserOfFacbook, "aya@wishi.me");
		filltextclear(PassOfFacbook, "inonab1565");
		click(LoginButtonOfFacbook);
		click(ConfirmButton);
	}
	public void LoginWithFacbookWrongUserName () 
	{
		
		click(ConnectWithFacbook);
		Sleep(500);
		ContextToWebView();
		filltextclear(UserOfFacbook, "yinon@luzifere11.me");
		filltextclear(PassOfFacbook, "inonab1565");
		click(LoginButtonOfFacbook);
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));
		Sleep(200);
		click(UserOfFacbook);
	}

	public void LoginWithFacbookWrongPassword () 
	{
		ContextToWebView();
		filltextclear(UserOfFacbook, "yinon@wishi.me");
		filltextclear(PassOfFacbook, "inonadddddb1565");
		click(LoginButtonOfFacbook);
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));
		Sleep(200);
		click(UserOfFacbook);
	}
	public void LoginWithFacbookWithoutUser () 
	{		
		ContextToWebView();
		Sleep(100);
		clear(UserOfFacbook);
		Sleep(100);
		filltextclear(PassOfFacbook, "inonadddddb1565");
		Sleep(100);
		click(LoginButtonOfFacbook);
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));
		Sleep(200);
		click(UserOfFacbook);
	}
	public void LoginWithFacbookWithoutPassword () 
	{
		ContextToWebView();
		filltextclear(UserOfFacbook, "yinon@wishi.me");
		clear(PassOfFacbook);
		click(LoginButtonOfFacbook);
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));
		Sleep(200);
		click(UserOfFacbook);
	}

}
