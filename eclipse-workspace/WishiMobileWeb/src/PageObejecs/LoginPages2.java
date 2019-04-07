package PageObejecs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPages2 extends BasePage
{
	@FindBy(xpath="//div [@class = 'sign-in-container']")
	WebElement LoginPage;
	
	@FindBy(xpath="//div[text()[contains(.,'Password is required.')]]")
	WebElement Passwordisrequired;
	
	@FindBy(xpath="//div[text()[contains(.,'Email is required.')]]")
	WebElement Emailisrequired;
	
	@FindBy(xpath="//header//div[@class='log-in']")
	WebElement btnLogin;

	@FindBy(xpath="//div//input[@id='signInEmail']")
	WebElement userName;
	
	@FindBy(xpath="//div//input[@id='signInPass']")
	WebElement password;
	
	@FindBy(xpath="//div//input[@value='Log in']")
	WebElement LoginButtonOfModel; 
			
	@FindBy(xpath="//div//input[@value='�����']")
	WebElement ButtonOfLogin;
	
	@FindBy(xpath="//div[@class='closeXLeft ng-scope']")
	WebElement ButtonOfCloseLogin;
	
	@FindBy(xpath="//div//input[@id='signInRemember']")
	WebElement RememberMe;
	
	@FindBy(xpath="//div[@class='fb ng-binding ng-isolate-scope']")
	WebElement LoginWithFacbook;
	
	@FindBy(xpath="//div//input[@id='m_login_email']")
	WebElement UserOfFacbook;
	
	@FindBy(xpath="//div//input[@id='m_login_password']")
	WebElement PassOfFacbook;
	
	@FindBy(xpath="//div//button[@name='login']")
	WebElement LoginButtonOfFacbook;
	
	public LoginPages2(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
		
	public void ClickLoginButton() 
	{
		click(btnLogin);
	}
	
	public void doLogin(String user,String pass)
	{
		filltext(userName, user);
		filltext(password, pass);
		click(LoginButtonOfModel);			
	} 
	public void Fillusername(String user)
	{
		filltext(userName, user);		
	} 
	
	public void FillusernameOfFacbook(String userfb)
	
	{
		
		filltext(UserOfFacbook, userfb);		
	} 
	
	public void FillPasswordOfFacbook(String Passfb)
	{
		filltext(PassOfFacbook, Passfb);		
	} 
	
	public void Clearusername()
	{
		clear(userName);		
	} 
	public void Fillpassword(String pass)
	{
		filltext(password, pass);		
	} 
	
	public void Clearpassword()
	{
		clear(password);		
	} 
	
	public void Clickloginbuttonn() 
	{
		click(LoginButtonOfModel);
	}
	
	public void ClickLoginButtonOfFacbook() 
	{
		click(LoginButtonOfFacbook);
	}
	
	public void ClickLoginWithFacbook() 
	{
		click(LoginWithFacbook);
	}
	
	
	
	public void Closebuttonoflogin() 
	{
		click(ButtonOfCloseLogin);
	}
	
	public void SIgnrememberme() 
	{
		click(RememberMe);
	}
	
	
}