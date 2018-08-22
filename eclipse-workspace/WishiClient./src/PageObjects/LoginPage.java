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
	Sleep(250);
	filltext(email, user);	
	Sleep(250);
} 
public void Fillpassword(String pass)
{
	Sleep(250);
	filltext(password, pass);	
	Sleep(250);
} 
public void FillusernameClear(String user)
{
	Sleep(250);
	filltextclear(email, user);	
	Sleep(250);
} 
public void FillpasswordClear(String pass)
{
	Sleep(250);
	filltextclear(password, pass);	
	Sleep(250);
} 
public void Clickloginbutton1() 
{
	Sleep(250);
	click(LoginButton);
	Sleep(250);
}
public void ClickLoginButton2() 
{
	Sleep(250);
	click(LoginButtonWizard);
	Sleep(250);
}
public void ClearUsername() 
{
	Sleep(250);
	clear(email);
	Sleep(250);
}
public void ClearPassword() 
{
	Sleep(250);
	clear(password);
	Sleep(250);
}
public void ClickDismiss() 
{
	Sleep(250);
	click(Dismiss);
	Sleep(250);
}
}
