package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	//Elements
	
		@FindBy(xpath="//div [@class = 'sign-in-container']")
		WebElement LoginPage;
		
		@FindBy(xpath="//div[text()[contains(.,'Password is required.')]]")
		WebElement Passwordisrequired;
		
		@FindBy(xpath="//div[text()[contains(.,'Email is required.')]]")
		WebElement Emailisrequired;
		
		@FindBy(xpath="//div[@class='logged-in-header-container ng-scope']//div[@class='log-in']")
		WebElement btnLogin;
	
		@FindBy(xpath="//div//input[@id='signInEmail']")
		WebElement userName;
		
		@FindBy(xpath="//div//input[@id='signInPass']")
		WebElement password;
		
		@FindBy(xpath="//div//input[@value='Log in']")
		WebElement LoginButtonOfModel; 
				
		@FindBy(xpath="//div//input[@value='התחבר']")
		WebElement ButtonOfLogin;
		
		@FindBy(xpath="//div[@class='closeXLeft ng-scope']")
		WebElement ButtonOfCloseLogin;
		
		@FindBy(xpath="//div//input[@id='signInRemember']")
		WebElement RememberMe;
		
		@FindBy(xpath="//div[@class='fb ng-binding ng-isolate-scope']")
		WebElement LoginWithFacbook;
		
		@FindBy(xpath="//div//input[@id='email']")
		WebElement UserOfFacbook;
		
		@FindBy(xpath="//div//input[@id='pass']")
		WebElement PassOfFacbook;
		
		@FindBy(xpath="//div//input[@value='Log In']")
		WebElement LoginButtonOfFacbook;
		
		
		
;
		
		public LoginPage(WebDriver driver) {
			super(driver);
		}
		
		

		
		public void ClickLoginButton() 
		{
			click(btnLogin);
		}
		
		public void doLogin(String user,String pass)
		{
			filltext(userName, user);
			Sleep(150);
			filltext(password, pass);
			Sleep(150);
			click(LoginButtonOfModel);	
			Sleep(150);
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
		
		
		
		

