package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class ConnectByFacbookPage extends BasePage
{

	public ConnectByFacbookPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@class='fb ng-binding ng-isolate-scope']")
	WebElement ConnectWithFB;
	
	@FindBy(xpath="//div//input[@id='m_login_email']")
	WebElement UserOfFacbook;
	
	@FindBy(xpath="//div//input[@id='m_login_password']")
	WebElement PassOfFacbook;
	
	@FindBy(xpath="//div//button[@name='login']")
	WebElement LoginButtonOfFacbook;
	
	public void ConnectWithFB() 
	{
		click(ConnectWithFB);	
	}
	
	public void FillusernameOfFacbook(String userfb)
	
	{
		
		filltext(UserOfFacbook, userfb);		
	} 
	
	public void FillPasswordOfFacbook(String Passfb)
	{
		filltext(PassOfFacbook, Passfb);		
	} 
	
	public void ClickLoginButtonOfFacbook() 
	{
		click(LoginButtonOfFacbook);
	}
	public void ClearusernameOfFacbook() 
	{
		click(UserOfFacbook);
	}
	public void ClearPasswordameOfFacbook() 
	{
		click(PassOfFacbook);
	}

}
