package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class LoginPage extends BasePage 
{

	public LoginPage(AppiumDriver<WebElement> _driver) 
	{
		super(_driver);
	}
	@FindBy(xpath="//*[@name='loginButton']")
	WebElement LoginButton;
	@FindBy(xpath="//*[@name='emailTextField']")
	WebElement email;
	@FindBy(xpath="//*[@name='passwordTextField']")
	WebElement password;
	@FindBy(xpath="//*[@name='loginButtonSecondID']")
	WebElement LoginButtonWizard;
	@FindBy(xpath="//*[@name='Dismiss']")
	WebElement Dismiss;

public void Fillusername(String user)
{
	filltext(email, user);		
} 
public void Fillpassword(String pass)
{
	filltext(password, pass);		
} 
public void FillusernameClear(String user)
{
	filltextclear(email, user);		
} 
public void FillpasswordClear(String pass)
{
	filltextclear(password, pass);		
} 
public void Clickloginbutton1() 
{
	click(LoginButton);
}
public void ClickLoginButton2() 
{
	click(LoginButtonWizard);
}
public void ClearUsername() 
{
	clear(email);
}
public void ClearPassword() 
{
	clear(password);
}
public void ClickDismiss() 
{
	click(Dismiss);
}
}
