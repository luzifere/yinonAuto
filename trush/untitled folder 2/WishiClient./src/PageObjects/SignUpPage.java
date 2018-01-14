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
	@FindBy(xpath="//*[@name='FirstNameTextField']")
	WebElement UserName;
	@FindBy(xpath="//*[@name='LastNameTextField']")
	WebElement LastName;
	@FindBy(xpath="//*[@name='EmailTextField']")
	WebElement Email;
	@FindBy(xpath="//*[@name='PasswordTextField']")
	WebElement Password;
	@FindBy(xpath="//*[@name='signUpButton']")
	WebElement SignButon;
	@FindBy(xpath="//*[@name='Dismiss']")
	WebElement Dismiss;
	@FindBy(xpath="//*[@name='Toolbar Next Button']")
	WebElement NextButton;
	public void doSignUp(String uname,String lname,String email,String pass) 
	{
		filltext(UserName,uname);
		filltext(LastName,lname);
		filltext(Email,email);
		filltext(Password,pass);
		click(SignButon);
	}
	public void doSignUpClear(String uname,String lname,String email,String pass) 
	{
		filltextclear(UserName,uname);
		filltextclear(LastName,lname);
		filltextclear(Email,email);
		filltextclear(Password,pass);
		click(SignButon);
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