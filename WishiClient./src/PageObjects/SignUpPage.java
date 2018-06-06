package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SignUpPage extends BasePage 
{

	public SignUpPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
	}
	@FindBy(id="signUpButton")
	WebElement EmailSignUpButton;
	@FindBy(xpath="//*[@name='FirstNameTextFieldID']")
	WebElement UserName;
	@FindBy(xpath="//*[@name='LastNameTextFieldID']")
	WebElement LastName;
	@FindBy(xpath="//*[@name='EmailTextFieldID']")
	WebElement Email;
	@FindBy(xpath="//*[@name='PasswordTextFieldID']")
	WebElement Password;
	@FindBy(xpath="//*[@name='SignUpButtonID']")
	WebElement SignButon;
	@FindBy(xpath="//*[@name='Dismiss']")
	WebElement Dismiss;
	@FindBy(xpath="//*[@name='Toolbar Next Button']")
	WebElement NextButton;
	@FindBy(xpath="//*[@name='NextButtonID']")
	WebElement NextButtonEmail;
	
	
	public void doSignUp(String uname,String lname,String email,String pass) 
	{
		Sleep(250);
		filltext(Email,email);
		click(NextButtonEmail);
		Sleep(250);
		filltext(UserName,uname);
		filltext(LastName,lname);
		filltext(Password,pass);
		click(SignButon);
		Sleep(250);
		
		
	}
	public void doSignUpClear(String uname,String lname,String email,String pass) 
	{
		filltextclear(Email,email);
		click(NextButtonEmail);
		Sleep(250);
		filltextclear(UserName,uname);
		filltextclear(LastName,lname);
		filltextclear(Password,pass);
		Sleep(350);
		click(SignButon);
		Sleep(400);
	
	}
	public void doSignUpEmailClear(String email) 
	{
		filltextclear(Email,email);
		click(NextButtonEmail);
	}
	public void ClickSignUpEmail() 
	{
		click(EmailSignUpButton);
	}
	public void ClickNextButton() 
	{
		click(NextButton);
	}
	public void FillUserName(String uname) 
	{
		UserName.sendKeys(uname);
	}
	public void FillLastName(String lname) 
	{
		LastName.sendKeys(lname);
	}
	public void FillEmail(String email) 
	{
		Email.sendKeys(email);
	}
	public void FillPassword(String pass) 
	{
		Password.sendKeys(pass);
	}
	public void ClickSignButton() 
	{
		click(SignButon);
	}
	public void ClickDismiss() 
	{
		click(Dismiss);
	}
	
}