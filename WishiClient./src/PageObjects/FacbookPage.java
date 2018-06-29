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
		click(ConnectWithFacbook);
		Sleep(500);
		BasePage.AcceptAlert();
		Sleep(500);
		ContextToWebView();
		filltextclear(UserOfFacbook, "luzifere@gmail.com");
		filltextclear(PassOfFacbook, "inonab1565");
		Sleep(500);
		click(LoginButtonOfFacbook);
		Sleep(500);
		click(ConfirmButton);
	}
	public void LoginWithFacbookWrongUserName () 
	{
		
		click(ConnectWithFacbook);
		Sleep(500);
		BasePage.AcceptAlert();
		Sleep(500);
		ContextToWebView();
		filltextclear(UserOfFacbook, "yinon@luzifere11.me");
		filltextclear(PassOfFacbook, "inonab1565");
		click(LoginButtonOfFacbook);
		ContextToWebView();
		//WaitElementDisplay(By.xpath("//div[@class='_3-rj']"));
		//Assert.assertTrue(ElementEnable("//div[@class='_3-rj']"));
		WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));//div[@class='_3-rj']
		Sleep(200);
		//click(UserOfFacbook);
		driver.resetApp();
		//Sleep(200);
		//click(UserOfFacbook);
	}

	public void LoginWithFacbookWrongPassword () 
	{
		click(ConnectWithFacbook);
		Sleep(500);
		BasePage.AcceptAlert();
		Sleep(500);
		ContextToWebView();
		filltextclear(UserOfFacbook, "yinon@wishi.me");
		filltextclear(PassOfFacbook, "inonadddddb1565");
		click(LoginButtonOfFacbook);
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));
		Sleep(200);
		//click(UserOfFacbook);
		driver.resetApp();
	}
	public void LoginWithFacbookWithoutUser () 
	{	
		click(ConnectWithFacbook);
		Sleep(500);
		BasePage.AcceptAlert();
		Sleep(500);
		ContextToWebView();
		clear(UserOfFacbook);
		filltextclear(PassOfFacbook, "inonadddddb1565");
		click(LoginButtonOfFacbook);
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));
		Sleep(200);
		//click(UserOfFacbook);
		driver.resetApp();
	}
	public void LoginWithFacbookWithoutPassword () 
	{
		click(ConnectWithFacbook);
		Sleep(500);
		BasePage.AcceptAlert();
		Sleep(500);
		ContextToWebView();
		filltextclear(UserOfFacbook, "yinon@wishi.me");
		clear(PassOfFacbook);
		click(LoginButtonOfFacbook);
		Assert.assertTrue(ElementEnable("//div[@class='_5yd0 _2ph- _5yd1']"));
		Sleep(200);
		//click(UserOfFacbook);
		driver.resetApp();
	}

}
